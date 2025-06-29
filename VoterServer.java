import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;

public class VoterServer {
    private static final int PORT = 6789;

    public static void main(String[] args) {
        System.out.println("Server started and listening on port " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected: " + socket.getInetAddress());
                new Thread(() -> handleClient(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 private static void handleClient(Socket socket) {
    try (
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true)
    ) {
        String request;
        while ((request = in.readLine()) != null) {
            System.out.println("📨 Request received: " + request);

            if (request.isEmpty()) {
                out.println("Invalid data: Empty request");
                continue;
            }

            String[] parts = request.split(";", 2);
            String command = parts[0].toLowerCase();
            String data = parts.length > 1 ? parts[1] : "";
            System.out.println("📌 Command: " + command);
            System.out.println("📌 Data: " + data);

            switch (command) {
                case "castvote":
    String voterCNIC = in.readLine();
    String candidateCNIC = in.readLine();
    in.readLine(); // read and discard blank line

    String voteResult = castVote(voterCNIC, candidateCNIC);
    out.println(voteResult);
    break;
case "getresults": {
    List<String> results = getElectionResults();
    for (String row : results) {
        out.println(row);
    }
    out.println(); // Marks end of transmission
    break;
}

                case "insert":
                    out.println(insertVoter(data));
                    break;
                case "addparty":
                    out.println(insertParty(data));
                    break;
                case "updateparty":
                    out.println(updateParty(data));
                    break;
                case "deleteparty":
                    out.println(deleteParty(data));
                    break;
                case "getallparties":
                    List<String> allParties = getAllParties();
                    for (String line : allParties) {
                        out.println(line);
                    }
                    out.println(); // Mark end of transmission
                    break;
                case "update":
                    out.println(updateVoter(data));
                    break;
                case "delete":
                    out.println(deleteVoter(data));
                    break;
                    case "getallvoters":
    List<String> voters = getAllVoters();
    for (String voter : voters) {
        out.println(voter);
    }
    out.println(); // End of data
    break;

                case "addcandidate":
                    out.println(insertCandidate(data));
                    break;
                case "updatecandidate":
                    out.println(updateCandidate(data));
                    break;
                case "deletecandidate":
                    out.println(deleteCandidate(data));
                    break;
                    case "getallcandidates":
    List<String> candidates = getAllCandidates();
    for (String row : candidates) {
        out.println(row);
    }
    out.println(); // Send an empty line to signal end of data
    break;
    case "getcandidateresults":
    List<String> candidateResults = getCandidateWiseResults();
    for (String row : candidateResults) {
        out.println(row);
    }
    out.println();  // End of data
    break;
    case "getpartyresults":
    List<String> partyResults = getPartyResults();
    for (String res : partyResults) {
        out.println(res);
    }
    out.println(); // End of transmission
    break;
case "getvotehistory":
    List<String> voteRecords = getVoteHistory();
    for (String line : voteRecords) {
        out.println(line);
    }
    out.println();  // send blank line to mark end of response
    break;
case "getallparties1":
    List<String> parties = getAllParties1();
    for (String line : parties) {
        System.out.println("Sending line to client: " + line); // Debug
        out.println(line);
    }
    out.println(); // End of transmission
    break;
case "forcewin":
    if (data != null && !data.trim().isEmpty()) {
        String partyId = data.trim();  // since client sends: forcewin\n102
        String result = forceWin(partyId);
        out.println(result);
    } else {
        out.println("ERROR: Party ID missing for forcewin.");
    }
    out.println(); // End of transmission
    break;



                case "login":
                    String[] loginFields = data.split(";");
                    if (loginFields.length != 2) {
                        out.println("invalid");
                        break;
                    }
                    String loginCnic = loginFields[0].trim();
                    String loginConstituency = loginFields[1].trim();
                    out.println(handleLogin(loginCnic, loginConstituency));
                    break;
              
                default:
                    out.println("Invalid Command");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            socket.close();
            System.out.println("Client disconnected.");
        } catch (IOException e) {
            System.out.println("Error closing socket: " + e.getMessage());
        }
    }
}



    private static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/election_db";
        String user = "root"; 
        String password = "Singham@123"; 
        return DriverManager.getConnection(url, user, password);
    }

private static String insertVoter(String data) {
    String[] fields = data.split(",");
   if (fields.length != 7) {
    return "Invalid Data Format: Expected 7 fields, received " + fields.length;
}


    String cnic = fields[0].trim();
    String name = fields[1].trim();
    String ageStr = fields[2].trim();
    String gender = fields[3].trim();
    String address = fields[4].trim();
    String city = fields[5].trim();
    String constituencyIdStr = fields[6].trim();

    if (cnic.isEmpty() || name.isEmpty() || ageStr.isEmpty() || gender.isEmpty() ||
        address.isEmpty() || city.isEmpty() || constituencyIdStr.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    int age;
    int constituencyId;
    try {
        age = Integer.parseInt(ageStr);
        if (age <= 0) {
            return "Invalid Data: Age must be a positive integer.";
        }
    } catch (NumberFormatException e) {
        return "Invalid Data: Age must be a valid integer.";
    }

    try {
        constituencyId = Integer.parseInt(constituencyIdStr);
    } catch (NumberFormatException e) {
        return "Invalid Data: Constituency ID must be a valid integer.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL InsertVoter(?, ?, ?, ?, ?, ?, ?)}")) {
        stmt.setString(1, cnic);
        stmt.setString(2, name);
        stmt.setInt(3, age);
        stmt.setString(4, gender);
        stmt.setString(5, address);
        stmt.setString(6, city);
        stmt.setInt(7, constituencyId);

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Voter Inserted Successfully";
        else
            return "Voter not inserted yet...";
    } catch (Exception e) {
        return "Error inserting voter: " + e.getMessage();
    }
}
private static String insertParty(String data) {
    String[] fields = data.split(",");
    if (fields.length != 3) {
        return "Invalid Data Format: Expected 3 fields (ID, Name, Symbol), received " + fields.length;
    }

    String partyIdStr = fields[0].trim();
    String partyName = fields[1].trim();
    String partySymbol = fields[2].trim();

    if (partyIdStr.isEmpty() || partyName.isEmpty() || partySymbol.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    int partyId;
    try {
        partyId = Integer.parseInt(partyIdStr);
    } catch (NumberFormatException e) {
        return "Invalid Data: Party ID must be a valid integer.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL InsertParty(?, ?, ?)}")) {
        stmt.setInt(1, partyId);
        stmt.setString(2, partyName);
        stmt.setString(3, partySymbol);

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Party Inserted Successfully";
        else
            return "Party not inserted.";
    } catch (SQLException e) {
        return "Error inserting party: " + e.getMessage();
    }
}
private static String updateParty(String data) {
    String[] fields = data.split(",");
    if (fields.length != 3) {
        return "Invalid Data Format: Expected 3 fields (ID, Name, Symbol), received " + fields.length;
    }

    String partyIdStr = fields[0].trim();
    String partyName = fields[1].trim();
    String partySymbol = fields[2].trim();

    if (partyIdStr.isEmpty() || partyName.isEmpty() || partySymbol.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    int partyId;
    try {
        partyId = Integer.parseInt(partyIdStr);
    } catch (NumberFormatException e) {
        return "Invalid Data: Party ID must be a valid integer.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL UpdateParty(?, ?, ?)}")) {
        stmt.setInt(1, partyId);
        stmt.setString(2, partyName);
        stmt.setString(3, partySymbol);

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Party Updated Successfully";
        else
            return "Party not updated. Check Party ID.";
    } catch (Exception e) {
        return "Error updating party: " + e.getMessage();
    }
}
private static String deleteParty(String data) {
    String partyIdStr = data.trim();

    if (partyIdStr.isEmpty()) {
        return "Invalid Data: Party ID is required.";
    }

    int partyId;
    try {
        partyId = Integer.parseInt(partyIdStr);
    } catch (NumberFormatException e) {
        return "Invalid Data: Party ID must be a valid integer.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL DeleteParty(?)}")) {
        stmt.setInt(1, partyId);

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Party Deleted Successfully";
        else
            return "Party not deleted. Check Party ID.";
    } catch (Exception e) {
        return "Error deleting party: " + e.getMessage();
    }
}
private static List<String> getAllParties() {
    List<String> partyList = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetAllParties()}");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            int id = rs.getInt("PartyID");
            String name = rs.getString("Name");
            String symbol = rs.getString("Symbol");

            String line = id + "," + name + "," + symbol;
            partyList.add(line);
        }

    } catch (SQLException e) {
        partyList.add("Error: " + e.getMessage());
    }

    return partyList;
}




private static String insertCandidate(String data) {
    String[] fields = data.split(",");
    if (fields.length != 4) {
        return "Invalid Data Format: Expected 4 fields (CNIC, Name, PartyID, ConstituencyID)";
    }

    String cnic = fields[0].trim();
    String name = fields[1].trim();
    String partyIdStr = fields[2].trim();
    String constituencyIdStr = fields[3].trim();

    if (cnic.isEmpty() || name.isEmpty() || partyIdStr.isEmpty() || constituencyIdStr.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    try {
        int partyId = Integer.parseInt(partyIdStr);
        int constituencyId = Integer.parseInt(constituencyIdStr);

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall("{CALL InsertCandidate(?, ?, ?, ?)}")) {
            stmt.setString(1, cnic);
            stmt.setString(2, name);
            stmt.setInt(3, partyId);
            stmt.setInt(4, constituencyId);

            int rows = stmt.executeUpdate();
            return rows > 0 ? "Candidate Inserted Successfully" : "Candidate insertion failed";
        }

    } catch (NumberFormatException e) {
        return "Invalid Data: PartyID and ConstituencyID must be integers.";
    } catch (SQLException e) {
        return "Error inserting candidate: " + e.getMessage();
    }
}
private static String updateCandidate(String data) {
    String[] fields = data.split(",");
    if (fields.length != 4) {
        return "Invalid Data Format: Expected 4 fields (CNIC, Name, PartyID, ConstituencyID)";
    }

    String cnic = fields[0].trim();
    String name = fields[1].trim();
    String partyIdStr = fields[2].trim();
    String constituencyIdStr = fields[3].trim();

    if (cnic.isEmpty() || name.isEmpty() || partyIdStr.isEmpty() || constituencyIdStr.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    try {
        int partyId = Integer.parseInt(partyIdStr);
        int constituencyId = Integer.parseInt(constituencyIdStr);

        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall("{CALL UpdateCandidate(?, ?, ?, ?)}")) {
            stmt.setString(1, cnic);
            stmt.setString(2, name);
            stmt.setInt(3, partyId);
            stmt.setInt(4, constituencyId);

            int rows = stmt.executeUpdate();
            return rows > 0 ? "Candidate Updated Successfully" : "Candidate update failed";
        }

    } catch (NumberFormatException e) {
        return "Invalid Data: PartyID and ConstituencyID must be integers.";
    } catch (SQLException e) {
        return "Error updating candidate: " + e.getMessage();
    }
}
private static String deleteCandidate(String data) {
    String cnic = data.trim();

    if (cnic.isEmpty()) {
        return "Invalid Data: Candidate CNIC is required.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL DeleteCandidate(?)}")) {
        stmt.setString(1, cnic);

        int rows = stmt.executeUpdate();
        return rows > 0 ? "Candidate Deleted Successfully" : "Candidate deletion failed";

    } catch (SQLException e) {
        return "Error deleting candidate: " + e.getMessage();
    }
}



  private static String updateVoter(String data) {
    String[] fields = data.split(",");
    if (fields.length != 7) {
        return "Invalid Data Format: Expected 7 fields, received " + fields.length;
    }

    String cnic = fields[0].trim();
    String name = fields[1].trim();
    String ageStr = fields[2].trim();
    String gender = fields[3].trim();
    String address = fields[4].trim();
    String city = fields[5].trim();
    String constituencyIdStr = fields[6].trim();

    if (cnic.isEmpty() || name.isEmpty() || ageStr.isEmpty() || gender.isEmpty() ||
        address.isEmpty() || city.isEmpty() || constituencyIdStr.isEmpty()) {
        return "Invalid Data: All fields are required.";
    }

    int age;
    int constituencyId;
    try {
        age = Integer.parseInt(ageStr);
        if (age <= 0) {
            return "Invalid Data: Age must be a positive integer.";
        }
    } catch (NumberFormatException e) {
        return "Invalid Data: Age must be a valid integer.";
    }

    try {
        constituencyId = Integer.parseInt(constituencyIdStr);
    } catch (NumberFormatException e) {
        return "Invalid Data: Constituency ID must be a valid integer.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL UpdateVoter(?, ?, ?, ?, ?, ?, ?)}")) {
        stmt.setString(1, cnic);
        stmt.setString(2, name);
        stmt.setInt(3, age);
        stmt.setString(4, gender);
        stmt.setString(5, address);
        stmt.setString(6, city);
        stmt.setInt(7, constituencyId);

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Voter Updated Successfully";
        else
            return "No voter found with this CNIC to update.";
    } catch (Exception e) {
        return "Error updating voter: " + e.getMessage();
    }
}

   private static String deleteVoter(String cnic) {
    if (cnic == null || cnic.trim().isEmpty()) {
        return "CNIC is required to delete a voter.";
    }

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL DeleteVoter(?)}")) {
        stmt.setString(1, cnic.trim());

        int rows = stmt.executeUpdate();
        if (rows > 0)
            return "Voter Deleted Successfully";
        else
            return "No voter found with this CNIC to delete.";
    } catch (Exception e) {
        return "Error deleting voter: " + e.getMessage();
    }
}
   
private static String handleLogin(String cnic, String constituencyId) {
    System.out.println("🔐 Login attempt: CNIC = " + cnic + ", Constituency ID = " + constituencyId);

    final String ADMIN_CNIC = "1234567890123";
    if (cnic.equals(ADMIN_CNIC)) {
        System.out.println("✅ Admin login");
        return "admin";
    }

    try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Voter WHERE CNIC = ? AND ConstituencyID = ?")) {

        stmt.setString(1, cnic);
        stmt.setInt(2, Integer.parseInt(constituencyId));

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println("✅ Voter found in DB");
            return "voter";
        } else {
            System.out.println("❌ No voter found");
            return "invalid";
        }

    } catch (Exception e) {
        e.printStackTrace();
        return "invalid";
    }
}
private static List<String> getAllVoters() {
    List<String> voterList = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetAllVoters()}");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            String cnic = rs.getString("CNIC");
            String name = rs.getString("Name");
            int age = rs.getInt("Age");
            String gender = rs.getString("Gender");
            String address = rs.getString("Address");
            String city = rs.getString("City");
            String constituencyName = rs.getString("ConstituencyName");

            String row = cnic + "," + name + "," + age + "," + gender + "," + address + "," + city + "," + constituencyName;
            voterList.add(row);
        }
    } catch (SQLException e) {
        voterList.add("Error: " + e.getMessage());
    }

    return voterList;
}
private static List<String> getAllCandidates() {
    List<String> candidateList = new ArrayList<>();

    try (Connection conn = getConnection();  
         CallableStatement stmt = conn.prepareCall("{CALL GetAllCandidates()}");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            String cnic = rs.getString("CNIC");
            String name = rs.getString("CandidateName");
            String partyName = rs.getString("PartyName");
            String partySymbol = rs.getString("PartySymbol");
            String constituencyName = rs.getString("ConstituencyName");

            String row = cnic + "," + name + "," + partyName + "," + partySymbol + "," + constituencyName;
            System.out.println("→ Sending row: " + row); // Log what’s being sent
            candidateList.add(row);
        }

    } catch (SQLException e) {
        String err = "Error: " + e.getMessage();
        System.out.println(err); // Log error
        candidateList.add(err);
    }

    return candidateList;
}
private static String castVote(String voterCNIC, String candidateCNIC) {
    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL CastVote(?, ?)}")) {

        stmt.setString(1, voterCNIC);
        stmt.setString(2, candidateCNIC);

        stmt.execute();
        return "SUCCESS";

    } catch (SQLException e) {
        // If error indicates voter already voted
        if (e.getMessage().contains("Duplicate entry")) {
            return "ALREADY_VOTED";
        }
        return "ERROR: " + e.getMessage();
    }
}
private static List<String> getElectionResults() {
    List<String> results = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetElectionResults()}")) {

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String partyName = rs.getString("PartyName");
            String partySymbol = rs.getString("PartySymbol");
            int noOfCandidates = rs.getInt("NoOfCandidates");
            int totalVotes = rs.getInt("TotalVotes");
            int votesBehind = rs.getInt("VotesBehind");
            String status = rs.getString("Status");

            // Format: name;symbol;candidates;votes;behind;status
            String row = partyName + ";" + partySymbol + ";" + noOfCandidates + ";" +
                         totalVotes + ";" + votesBehind + ";" + status;

            results.add(row);
        }

        rs.close();
    } catch (SQLException e) {
        results.clear();
        results.add("ERROR: " + e.getMessage());
    }

    return results;
}
private static List<String> getCandidateWiseResults() {
    List<String> results = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetCandidateWiseResults()}")) {

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String candidateName = rs.getString("CandidateName");
            String constituency = rs.getString("ConstituencyName");
            String party = rs.getString("PartyName");
            String symbol = rs.getString("PartySymbol");
            int votes = rs.getInt("Votes");
            String status = rs.getString("Status");

            String row = candidateName + ";" + constituency + ";" + party + ";" + symbol + ";" + votes + ";" + status;
            results.add(row);
        }

        rs.close();
    } catch (SQLException e) {
        results.clear();
        results.add("ERROR: " + e.getMessage());
    }

    return results;
}
private static List<String> getPartyResults() {
    List<String> partyResults = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetPartySeatsWon()}")) {

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String partyName = rs.getString("PartyName");
            String partySymbol = rs.getString("PartySymbol");
            int seatsWon = rs.getInt("SeatsWon");

            // Format as: name;symbol;seats
            String row = partyName + ";" + partySymbol + ";" + seatsWon;
            partyResults.add(row);
        }

        rs.close();
    } catch (SQLException e) {
        partyResults.clear();
        partyResults.add("ERROR: " + e.getMessage());
    }

    return partyResults;
}
private static List<String> getVoteHistory() {
    List<String> voteHistory = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetVoteHistory()}");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            String voterName = rs.getString("VoterName");
            String candidateName = rs.getString("CandidateName");
            String partyName = rs.getString("PartyName");
            String voteTime = rs.getTimestamp("VoteTime").toString();

            voteHistory.add(voterName + ";" + candidateName + ";" + partyName + ";" + voteTime);
        }

    } catch (SQLException e) {
        voteHistory.add("ERROR: " + e.getMessage());
    }

    return voteHistory;
}
private static List<String> getAllParties1() {
    List<String> allParties = new ArrayList<>();

    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL GetAllParties1()}");
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
             String partyId = rs.getString("PartyID");
            String partyName = rs.getString("Name");
            String partySymbol = rs.getString("Symbol");
           

           allParties.add(partyId + ";" + partyName + ";" + partySymbol);

        }

    } catch (SQLException e) {
        allParties.add("ERROR: " + e.getMessage());
    }

    return allParties;
}
private static String forceWin(String partyId) {
    try (Connection conn = getConnection();
         CallableStatement stmt = conn.prepareCall("{CALL ForceWin(?)}")) {

        stmt.setInt(1, Integer.parseInt(partyId));
        stmt.execute();

        return "Force win executed successfully for Party ID " + partyId;

    } catch (SQLException e) {
        return "ERROR: " + e.getMessage();
    }
}


}


    