package design;
import driver.ClientSide;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {
DefaultTableModel partyTableModel;

    public Admin() {
        initComponents();
              if (ClientSide.socket == null || ClientSide.socket.isClosed()) {
        ClientSide.connectToServer();
    }
partyTableModel = (DefaultTableModel) candidateParty.getModel();
partyTableModel.setRowCount(0); // Clear existing rows from GUI builder

// Load party data into the table
loadPartiesIntoCandidateTable();

            

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Party = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        partyNameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        partySymbolField = new javax.swing.JTextField();
        partyIdField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Candidate = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        candidateName = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        candidateCnic = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        candidateConstituency = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        candidateParty = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        reports = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 220, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/coalition.png"))); // NOI18N
        jLabel2.setText("Add Party");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/recruitment.png"))); // NOI18N
        jLabel3.setText("Add Candidate");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/results.png"))); // NOI18N
        jLabel4.setText("View Reports");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        jLabel5.setText("Logout");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(78, 78, 78)
                .addComponent(jLabel5)
                .addContainerGap(547, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1182));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));

        Party.setBackground(new java.awt.Color(204, 255, 204));

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PARTY PORTAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 204, 102))); // NOI18N

        partyNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        partyNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        partyNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partyNameFieldActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(204, 255, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Party Name");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(204, 255, 204));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Party Symbol");

        partySymbolField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        partySymbolField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        partySymbolField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partySymbolFieldActionPerformed(evt);
            }
        });

        partyIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        partyIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        partyIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partyIdFieldActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 255, 204));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Party ID");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partyNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partySymbolField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partyIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(partySymbolField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(457, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/approved.png"))); // NOI18N
        jLabel20.setText("WELCOME TO PARTY PORTAL");

        javax.swing.GroupLayout PartyLayout = new javax.swing.GroupLayout(Party);
        Party.setLayout(PartyLayout);
        PartyLayout.setHorizontalGroup(
            PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartyLayout.createSequentialGroup()
                .addGroup(PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                .addGap(0, 61, Short.MAX_VALUE))
        );
        PartyLayout.setVerticalGroup(
            PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Candidates", Party);

        Candidate.setBackground(new java.awt.Color(204, 255, 204));

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidate Portal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 204, 102))); // NOI18N

        candidateName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        candidateName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        candidateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateNameActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(204, 255, 204));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Candidate Name");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(204, 255, 204));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Candidate CNIC");

        candidateCnic.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        candidateCnic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        candidateCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateCnicActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(204, 255, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Candidate Party");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus.png"))); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(204, 255, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Candidate Constituency");

        candidateConstituency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR CONSTITUTENCIES ", "1. Lahore Gulshan Ravi NA-128", "2. Lahore Model Town NA-126", "3. Lahore Cantt NA-129", " ", "4. Karachi Saddar NA-247", "5. Karachi Korangi NA-241", "6. Karachi Malir NA-238", " ", "7. Islamabad G-10 NA-47", "8. Islamabad G-13 NA-48", "9. Islamabad I-8 NA-49", " ", "10. Rawalpindi Westridge NA-53", "11. Rawalpindi Chaklala NA-52", "12. Rawalpindi Dhoke Hassu NA-55" }));
        candidateConstituency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateConstituencyActionPerformed(evt);
            }
        });

        candidateParty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Party ID", "Name", "Symbol"
            }
        ));
        jScrollPane3.setViewportView(candidateParty);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidateName, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidateCnic, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(candidateConstituency, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(16, 16, 16))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(candidateName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(candidateConstituency, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(candidateCnic, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(518, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/candidate.png"))); // NOI18N
        jLabel29.setText("WELCOME TO CANDIDATE PORTAL");

        javax.swing.GroupLayout CandidateLayout = new javax.swing.GroupLayout(Candidate);
        Candidate.setLayout(CandidateLayout);
        CandidateLayout.setHorizontalGroup(
            CandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CandidateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(CandidateLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CandidateLayout.setVerticalGroup(
            CandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CandidateLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Parties", Candidate);

        reports.setBackground(new java.awt.Color(204, 255, 204));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/OIP (2).jpeg"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("General-Election-Reports 2025");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Party", "Symbol", "Total Votes", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        javax.swing.GroupLayout reportsLayout = new javax.swing.GroupLayout(reports);
        reports.setLayout(reportsLayout);
        reportsLayout.setHorizontalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addGroup(reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(reportsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        reportsLayout.setVerticalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Reports", reports);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, -48, -1, 1230));

        setSize(new java.awt.Dimension(816, 777));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void partyNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partyNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partyNameFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    addParty();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void partySymbolFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partySymbolFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partySymbolFieldActionPerformed

    private void partyIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partyIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partyIdFieldActionPerformed

    private void candidateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_candidateNameActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   addCandidate();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void candidateCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_candidateCnicActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
          jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
         jLabel2.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
         jLabel2.setBorder(null);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
         jLabel3.setBorder(null);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
         jLabel4.setBorder(null);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
         jLabel5.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(null);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      deleteParty();      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     updateParty();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
deleteCandidate();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
updateCandidate(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void candidateConstituencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateConstituencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_candidateConstituencyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadPartiesIntoCandidateTable(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
  this.setVisible(false);   
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked
    private void addParty() {
    String partyId = partyIdField.getText().trim();
    String partyName = partyNameField.getText().trim();
    String partySymbol = partySymbolField.getText().trim();

    if (!validatePartyInput(partyId, partyName, partySymbol)) {
        return;
    }

    try {
        if (!ClientSide.isConnected()) {
            ClientSide.connectToServer();
        }

        String data = String.join(",", partyId, partyName, partySymbol);
        ClientSide.out.println("addparty;" + data);  // Command: addparty
        String response = ClientSide.in.readLine();
      
        JOptionPane.showMessageDialog(this, "Server: " + response);

        if (response != null && response.toLowerCase().contains("success")) {
            clearPartyFields();
             loadPartiesIntoCandidateTable(); 
             
        }

    }
    catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Communication error: " + ex.getMessage());
    }
}
    private void updateParty() {
    String partyId = partyIdField.getText().trim();
    String partyName = partyNameField.getText().trim();
    String partySymbol = partySymbolField.getText().trim();

    if (!validatePartyInput(partyId, partyName, partySymbol)) {
        return;
    }

    try {
        if (!ClientSide.isConnected()) {
            ClientSide.connectToServer();
        }

        String data = String.join(",", partyId, partyName, partySymbol);
        ClientSide.out.println("updateparty;" + data);  // Command: updateparty
        String response = ClientSide.in.readLine();
        JOptionPane.showMessageDialog(this, "Server: " + response);

        if (response != null && response.toLowerCase().contains("success")) {
            clearPartyFields();
             loadPartiesIntoCandidateTable(); 
            // Optional, only if you want to clear the form after update
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Communication error: " + ex.getMessage());
    }
}
private void deleteParty() {
    String partyId = partyIdField.getText().trim();

    if (partyId.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Party ID is required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        int id = Integer.parseInt(partyId);
        if (id <= 0) {
            JOptionPane.showMessageDialog(this, "Party ID must be a positive integer.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Party ID must be a valid integer.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this party?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    try {
        if (!ClientSide.isConnected()) {
            ClientSide.connectToServer();
        }

        ClientSide.out.println("deleteparty;" + partyId);  // Command format
        String response = ClientSide.in.readLine();
        JOptionPane.showMessageDialog(this, "Server: " + response);

        if (response != null && response.toLowerCase().contains("success")) {
            clearPartyFields();
             loadPartiesIntoCandidateTable(); 
             
        }

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Communication error: " + ex.getMessage());
    }
}

private boolean validatePartyInput(String partyId, String partyName, String partySymbol) {
    List<String> errors = new ArrayList<>();

    if (partyId.isEmpty()) errors.add("Party ID is required.");
    if (partyName.isEmpty()) errors.add("Party Name is required.");
    if (partySymbol.isEmpty()) errors.add("Party Symbol is required.");

    try {
        int id = Integer.parseInt(partyId);
        if (id <= 0) {
            errors.add("Party ID must be a positive number.");
        }
    } catch (NumberFormatException e) {
        errors.add("Party ID must be a valid integer.");
    }

    if (!errors.isEmpty()) {
        JOptionPane.showMessageDialog(this, String.join("\n", errors), "Validation Error", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}
private void clearPartyFields() {
    partyIdField.setText("");
    partyNameField.setText("");
    partySymbolField.setText("");
}
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
private void addCandidate() {
    String cnic = candidateCnic.getText().trim();
    String name = candidateName.getText().trim();

    int selectedRow = candidateParty.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a party from the table.");
        return;
    }
    String partyId = (String) candidateParty.getValueAt(selectedRow, 0);

    String selectedConstituency = (String) candidateConstituency.getSelectedItem();
    String constituencyId = selectedConstituency != null ? selectedConstituency.split("\\.")[0].trim() : "";

    if (!validateCandidateInput(cnic, name, partyId, constituencyId)) {
        return;
    }

    String data = String.join(",", cnic, name, partyId, constituencyId);
    String response = ClientSide.sendRequest("addcandidate;" + data);

    if (response != null && response.toLowerCase().contains("success")) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
        clearCandidateFields();
    } else if (response != null) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
    }
}

private void updateCandidate() {
    String cnic = candidateCnic.getText().trim();
    String name = candidateName.getText().trim();

    int selectedRow = candidateParty.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a party from the table.");
        return;
    }
    String partyId = (String) candidateParty.getValueAt(selectedRow, 0);

    String selectedConstituency = (String) candidateConstituency.getSelectedItem();
    String constituencyId = selectedConstituency != null ? selectedConstituency.split("\\.")[0].trim() : "";

    if (!validateCandidateInput(cnic, name, partyId, constituencyId)) {
        return;
    }

    String data = String.join(",", cnic, name, partyId, constituencyId);
    String response = ClientSide.sendRequest("updatecandidate;" + data);

    if (response != null && response.toLowerCase().contains("success")) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
        clearCandidateFields();
    } else if (response != null) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
    }
}

private void deleteCandidate() {
    String cnic = candidateCnic.getText().trim();

    if (cnic.isEmpty()) {
        JOptionPane.showMessageDialog(this, "CNIC is required for deletion.");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this candidate?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    String response = ClientSide.sendRequest("deletecandidate;" + cnic);

    if (response != null && response.toLowerCase().contains("success")) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
        clearCandidateFields();
    } else if (response != null) {
        JOptionPane.showMessageDialog(this, "Server: " + response);
    }
}


private boolean validateCandidateInput(String cnic, String name, String partyId, String constituencyId) {
    List<String> errors = new ArrayList<>();

    if (cnic.isEmpty()) errors.add("CNIC is required.");
    if (name.isEmpty()) errors.add("Name is required.");
    if (partyId == null || partyId.isEmpty()) errors.add("Party selection is required.");
    if (constituencyId == null || constituencyId.isEmpty()) errors.add("Constituency selection is required.");

    if (!errors.isEmpty()) {
        JOptionPane.showMessageDialog(this, String.join("\n", errors), "Validation Error", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}
private void clearCandidateFields() {
    candidateCnic.setText("");
    candidateName.setText("");
     candidateParty.getSelectionModel().clearSelection();

    candidateConstituency.setSelectedIndex(-1);
}
private void loadPartiesIntoCandidateTable() {
    partyTableModel.setRowCount(0); // Clear existing rows

    try {
        // Force fresh connection for each request (recommended for single-request-per-connection servers)
        ClientSide.connectToServer();

        ClientSide.out.println("getallparties");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break; // End of data

            String[] parts = line.split(",");
            if (parts.length == 3) {
                Object[] row = {parts[0].trim(), parts[1].trim(), parts[2].trim()};
                partyTableModel.addRow(row);
            }
        }

        // Optional: Close socket after read if you want to enforce reconnects elsewhere too
        ClientSide.socket.close(); // Safe cleanup if you want short-lived connections

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading parties: " + e.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Candidate;
    private javax.swing.JPanel Party;
    private javax.swing.JTextField candidateCnic;
    private javax.swing.JComboBox<String> candidateConstituency;
    private javax.swing.JTextField candidateName;
    private javax.swing.JTable candidateParty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField partyIdField;
    private javax.swing.JTextField partyNameField;
    private javax.swing.JTextField partySymbolField;
    private javax.swing.JPanel reports;
    // End of variables declaration//GEN-END:variables
}
