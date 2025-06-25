package driver;

import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ClientSide {
    public static Socket socket;
    public static PrintWriter out;
    public static BufferedReader in;

    public static void connectToServer() {
        closeConnection();  // Always close any previous connection first

        try {
            socket = new Socket("localhost", 6789);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("✅ Connected to server successfully.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "❌ Error connecting to server: " + e.getMessage(),
                "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean isConnected() {
        return socket != null && socket.isConnected() && !socket.isClosed();
    }

    public static void closeConnection() {
        try {
            if (in != null) in.close();
        } catch (IOException ignored) {}
        if (out != null) out.close();
        try {
            if (socket != null && !socket.isClosed()) socket.close();
        } catch (IOException ignored) {}
    }

    // Always reconnect before sending request
    public static String sendRequest(String request) {
        connectToServer();

        try {
            out.println(request);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                if (line.trim().isEmpty()) break;
                response.append(line).append("\n");
            }

            return response.toString().trim();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "❌ Communication error: " + e.getMessage(),
                "Communication Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            closeConnection();  // Close after each request
        }
    }
}

