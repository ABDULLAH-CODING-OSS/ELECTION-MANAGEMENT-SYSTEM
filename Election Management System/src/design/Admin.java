package design;
import design.USER;
import static design.USER.voteHistoryTableModel;

import driver.ClientSide;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.io.BufferedReader;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {
DefaultTableModel partyTableModel1;

DefaultTableModel candidateResultTableModel;
DefaultTableModel resultPartyTableModel;
public static DefaultTableModel voteHistoryTableModel;

DefaultTableModel partyTableModel;
DefaultTableModel voterTableModel;
DefaultTableModel resultTableModel;
DefaultTableModel candidateTableModel;
    public Admin() {
       
        initComponents();
              if (ClientSide.socket == null || ClientSide.socket.isClosed()) {
        ClientSide.connectToServer();
  }
partyTableModel1 = (DefaultTableModel) partyTable.getModel();
partyTableModel1.setRowCount(0);

voterTableModel = (DefaultTableModel) voterTablee.getModel();
voterTableModel.setRowCount(0);
partyTableModel = (DefaultTableModel) candidateParty.getModel();
partyTableModel.setRowCount(0);
resultTableModel = (DefaultTableModel) resultTable.getModel();
resultTableModel.setRowCount(0);
candidateTableModel = (DefaultTableModel) candidateTable.getModel();
candidateTableModel.setRowCount(0);
candidateResultTableModel = (DefaultTableModel) candidateResultTable.getModel();
candidateResultTableModel.setRowCount(0);  // Clear any existing data
resultPartyTableModel = (DefaultTableModel) resultPartyTable.getModel();
resultPartyTableModel.setRowCount(0);
voteHistoryTableModel = (DefaultTableModel) voteHistoryTable.getModel();
voteHistoryTableModel.setRowCount(0); 
try {
    loadPartyTable();
    loadResultTableData();
    loadVoterTableData(); 
    loadCandidateTableData();
    loadCandidateResultTableData();
    loadPartyResultTableData();
    loadVoteHistoryTableData();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error loading admin data: " + e.getMessage());
    e.printStackTrace();
}

  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        updateVoter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        constituencyField = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cnicField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        EditResults = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        voterTable = new javax.swing.JScrollPane();
        voterTablee = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        candidateTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        corruption = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        candidateResultTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultPartyTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        voteHistoryTable = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        partyTable = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

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

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updates.png"))); // NOI18N
        jLabel7.setText("Update INFO");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/voting-box.png"))); // NOI18N
        jLabel8.setText("Detailed-Data");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(204, 255, 204));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toxic.png"))); // NOI18N
        jLabel16.setText("$$$$$$$$$");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(43, 43, 43)
                .addComponent(jLabel16)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(447, Short.MAX_VALUE))
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

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-button.png"))); // NOI18N
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

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updates.png"))); // NOI18N
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
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
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
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/approved.png"))); // NOI18N
        jLabel20.setText("WELCOME TO PARTY PORTAL");

        javax.swing.GroupLayout PartyLayout = new javax.swing.GroupLayout(Party);
        Party.setLayout(PartyLayout);
        PartyLayout.setHorizontalGroup(
            PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartyLayout.createSequentialGroup()
                .addGroup(PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1421, Short.MAX_VALUE))
        );
        PartyLayout.setVerticalGroup(
            PartyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PartyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
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

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-button.png"))); // NOI18N
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

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash.png"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updates.png"))); // NOI18N
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

        candidateConstituency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR CONSTITUTENCIES ", "1. NA-128 (Lahore)", "2. NA-126 (Lahore)", "3. NA-129 (Lahore)", " ", "4. NA-247 (Karachi)", "5. NA-241 (Karachi)", "6. NA-238 (Karachi)", " ", "7. NA-47 (Islamabad)", "8. NA-48 (Islamabad)", "9. NA-49 (Islamabad)", " ", "10. NA-53 (Rawalpindi)", "11. NA-52 (Rawalpindi)", "12. NA-55 (Rawalpindi)", " " }));
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
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidateName, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidateCnic, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)))
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
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addGroup(CandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1402, Short.MAX_VALUE))
        );
        CandidateLayout.setVerticalGroup(
            CandidateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CandidateLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Parties", Candidate);

        reports.setBackground(new java.awt.Color(204, 255, 204));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/OIP (2).jpeg"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("General-Election-Reports 2025");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PARTY ", "SYMBOL", "CANDIDATES", "VOTES", "BEHIND BY", "STATUS"
            }
        ));
        jScrollPane4.setViewportView(resultTable);

        jButton12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        jButton12.setText("Refresh");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportsLayout = new javax.swing.GroupLayout(reports);
        reports.setLayout(reportsLayout);
        reportsLayout.setHorizontalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addGroup(reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reportsLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)))
                    .addGroup(reportsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton12)))
                .addContainerGap(1417, Short.MAX_VALUE))
        );
        reportsLayout.setVerticalGroup(
            reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton12)
                .addContainerGap(523, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Reports", reports);

        updateVoter.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Voter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12), new java.awt.Color(153, 153, 255))); // NOI18N

        constituencyField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT YOUR CONSTITUTENCIES ", "1. Lahore Gulshan Ravi NA-128", "2. Lahore Model Town NA-126", "3. Lahore Cantt NA-129", " ", "4. Karachi Saddar NA-247", "5. Karachi Korangi NA-241", "6. Karachi Malir NA-238", " ", "7. Islamabad G-10 NA-47", "8. Islamabad G-13 NA-48", "9. Islamabad I-8 NA-49", " ", "10. Rawalpindi Westridge NA-53", "11. Rawalpindi Chaklala NA-52", "12. Rawalpindi Dhoke Hassu NA-55" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Constitutency");

        cityField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cityField.setToolTipText("Enter Your City");
        cityField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("City");

        addressField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addressField.setToolTipText("Enter Your Address");
        addressField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Address");

        genderField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        genderField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        genderField.setToolTipText("Enter Your Gender");
        genderField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gender");

        ageField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageField.setToolTipText("Enter your Age");
        ageField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Age");

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setToolTipText("Enter your name ?");
        nameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Name");

        cnicField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cnicField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cnicField.setToolTipText("Enter Your CNIC");
        cnicField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        cnicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnicFieldActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CNIC");

        jButton8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/updates.png"))); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trash.png"))); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameField))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(addressField)
                                        .addGap(21, 21, 21))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(252, 252, 252)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(constituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnicField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(constituencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/people.png"))); // NOI18N
        jLabel17.setText("CHANGE IS GOOD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout updateVoterLayout = new javax.swing.GroupLayout(updateVoter);
        updateVoter.setLayout(updateVoterLayout);
        updateVoterLayout.setHorizontalGroup(
            updateVoterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateVoterLayout.createSequentialGroup()
                .addGroup(updateVoterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(updateVoterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1404, Short.MAX_VALUE))
        );
        updateVoterLayout.setVerticalGroup(
            updateVoterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateVoterLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Voter", updateVoter);

        EditResults.setBackground(new java.awt.Color(204, 255, 204));
        EditResults.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VOTER & CANDIDATE LISTINGS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 3, 12))); // NOI18N

        voterTablee.setBackground(new java.awt.Color(204, 255, 204));
        voterTablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CNIC", "NAME", "AGE", "GENDER", "ADDRESS", "CITY", "CONSTITUTENCY"
            }
        ));
        voterTable.setViewportView(voterTablee);

        candidateTable.setBackground(new java.awt.Color(204, 204, 204));
        candidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CNIC", "NAME", "PARTY", "SYMBOL", "CONSTITUTENCY"
            }
        ));
        jScrollPane6.setViewportView(candidateTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voterTable)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(voterTable, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        EditResults.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 244, 510, 590));

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/survey-results.png"))); // NOI18N
        jLabel21.setText("EMS-DATA");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        EditResults.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 510, 220));

        jTabbedPane1.addTab("Update Results", EditResults);

        corruption.setBackground(new java.awt.Color(204, 255, 204));

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/corruption.png"))); // NOI18N
        jLabel23.setText("MONEY-TALKS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETAILED-DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18))); // NOI18N

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        candidateResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CANDIDATE", "CONSTITUTENCY", "PARTY", "SYMBOL", "VOTES", "STATUS"
            }
        ));
        jScrollPane5.setViewportView(candidateResultTable);

        resultPartyTable.setBackground(new java.awt.Color(204, 204, 204));
        resultPartyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NAME", "SYMBOL", "SEATS "
            }
        ));
        jScrollPane1.setViewportView(resultPartyTable);

        voteHistoryTable.setBackground(new java.awt.Color(204, 255, 204));
        voteHistoryTable.setForeground(new java.awt.Color(0, 51, 51));
        voteHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VOTER", "VOTED", "PARTY", "TIME"
            }
        ));
        jScrollPane7.setViewportView(voteHistoryTable);

        partyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PARTY ID", "NAME", "SYMBOL"
            }
        ));
        jScrollPane8.setViewportView(partyTable);

        jButton10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh.png"))); // NOI18N
        jButton10.setText("Refresh");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/toxic.png"))); // NOI18N
        jButton11.setText("FORCE WIN");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton11)))
                .addGap(1436, 1436, 1436))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout corruptionLayout = new javax.swing.GroupLayout(corruption);
        corruption.setLayout(corruptionLayout);
        corruptionLayout.setHorizontalGroup(
            corruptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corruptionLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(corruptionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corruptionLayout.setVerticalGroup(
            corruptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corruptionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", corruption);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, -48, -1, 1230));

        setSize(new java.awt.Dimension(816, 847));
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
        loadPartiesIntoCandidateTable(); 
loadPartyTable();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
  this.setVisible(false);   
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
       jLabel7.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
       jLabel7.setBorder(null); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
       jLabel8.setBorder(new MatteBorder(0,0,2,0,Color.WHITE)); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
    jLabel8.setBorder(null); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed

    }//GEN-LAST:event_cityFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed

    }//GEN-LAST:event_addressFieldActionPerformed

    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFieldActionPerformed

    }//GEN-LAST:event_genderFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed

    }//GEN-LAST:event_ageFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

    }//GEN-LAST:event_nameFieldActionPerformed

    private void cnicFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnicFieldActionPerformed

    }//GEN-LAST:event_cnicFieldActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
updateVoter(); 
//loadVoterTableData();// TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
deleteVoter();
//loadVoterTableData();// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
          jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
      jLabel16.setBorder(new MatteBorder(0,0,2,0,Color.WHITE));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setBorder(null); 
    }//GEN-LAST:event_jLabel16MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   loadPartyTable();
    loadResultTableData();
    loadVoterTableData(); 
    loadCandidateTableData();
    loadCandidateResultTableData();
    loadPartyResultTableData();
    loadVoteHistoryTableData();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
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

private void updateVoter() {
    String cnic = cnicField.getText().trim();
    String name = nameField.getText().trim();
    String age = ageField.getText().trim();
    String gender = genderField.getText().trim();
    String address = addressField.getText().trim();
    String city = cityField.getText().trim();
    String selectedItem = (String) constituencyField.getSelectedItem();
    String constituencyId = selectedItem.split("\\.")[0].trim();

    if (!validateInput(cnic, name, age, gender, address, city, constituencyId)) {
        return;
    }

    try {
        if (!ClientSide.isConnected()) {
            ClientSide.connectToServer();
        }

        String data = String.join(",", cnic, name, age, gender, address, city, constituencyId);
        ClientSide.out.println("update;" + data);
        String response = ClientSide.in.readLine();
        JOptionPane.showMessageDialog(this, "Server: " + response);
        if (response != null && response.toLowerCase().contains("success")) {
            clearFields();
            loadVoterTableData();
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Communication error: " + ex.getMessage());
    }
}
private void deleteVoter() {
    String cnic = cnicField.getText().trim();

    if (cnic.isEmpty()) {
        JOptionPane.showMessageDialog(this, "CNIC is required to delete a voter.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        if (!ClientSide.isConnected()) {
            ClientSide.connectToServer();
        }

        ClientSide.out.println("delete;" + cnic);
        String response = ClientSide.in.readLine();
        JOptionPane.showMessageDialog(this, "Server: " + response);
        if (response != null && response.toLowerCase().contains("success")) {
            clearFields();
          loadVoterTableData();
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Communication error: " + ex.getMessage());
    }
}
private boolean validateInput(String cnic, String name, String age, String gender, String address, String city, String constituencyId) {
    List<String> errors = new ArrayList<>();
    if (cnic.isEmpty()) errors.add("CNIC is required");
    if (name.isEmpty()) errors.add("Name is required");
    if (age.isEmpty()) errors.add("Age is required");
    if (gender.isEmpty()) errors.add("Gender is required");
    if (address.isEmpty()) errors.add("Address is required");
    if (city.isEmpty()) errors.add("City is required");
    if (constituencyId == null || constituencyId.isEmpty()) errors.add("Constituency selection is required");

    if (!errors.isEmpty()) {
        JOptionPane.showMessageDialog(this, String.join("\n", errors), "Validation Error", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    try {
        int ageVal = Integer.parseInt(age);
        if (ageVal <= 0) {
            JOptionPane.showMessageDialog(this, "Age must be a positive integer.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Age must be a valid integer.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    return true;
}
private void clearFields() {
    cnicField.setText("");
    nameField.setText("");
    ageField.setText("");
    addressField.setText("");
    cityField.setText("");
    genderField.setText("");
    constituencyField.setSelectedIndex(-1); // clear combo box selection
}
private void loadVoterTableData() {
    voterTableModel.setRowCount(0); // Clear existing rows

    try {
        ClientSide.connectToServer();
        if (!ClientSide.isConnected()) {
            JOptionPane.showMessageDialog(this, "Unable to connect to server.");
            return;
        }

        ClientSide.out.println("getallvoters");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break; // Server signals end

            String[] parts = line.split(",");
            if (parts.length == 7) {
                Object[] row = new Object[7];
                for (int i = 0; i < 7; i++) {
                    row[i] = parts[i].trim();
                }
                voterTableModel.addRow(row);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "❌ Error loading voters: " + e.getMessage(),
            "Connection Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        ClientSide.closeConnection(); // Always close socket and streams
    }
}
private void loadResultTableData() {
    resultTableModel.setRowCount(0);  // Clear previous results

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getresults");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(";");
            if (parts.length == 6) {
                String partyName = parts[0].trim();
                String partySymbol = parts[1].trim();
                String numCandidates = parts[2].trim();
                String totalVotes = parts[3].trim();
                String votesBehind = parts[4].trim();
                String status = parts[5].trim();

                Object[] row = {partyName, partySymbol, numCandidates, totalVotes, votesBehind, status};
                resultTableModel.addRow(row);
            }
        }

        ClientSide.socket.close();  // Optional
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading election results: " + e.getMessage());
    }
}
private void loadCandidateTableData() {
    candidateTableModel.setRowCount(0);   // Clear first table
    // Clear second table

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getallcandidates");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(",");
            if (parts.length == 5) {
                String cnic = parts[0].trim();
                String name = parts[1].trim();
                String partyName = parts[2].trim();
                String symbol = parts[3].trim();
                String constituencyName = parts[4].trim();

                Object[] row = {cnic, name, partyName, symbol, constituencyName};
                candidateTableModel.addRow(row);    // Add to first table
                  // Add to second table
            }
        }

        ClientSide.socket.close(); // Optional
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading candidate data: " + e.getMessage());
    }
}
private void loadCandidateResultTableData() {
    candidateResultTableModel.setRowCount(0);  // Clear old data

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getcandidateresults");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(";");
            if (parts.length == 6) {
                String candidateName = parts[0].trim();
                String constituencyName = parts[1].trim();
                String partyName = parts[2].trim();
                String partySymbol = parts[3].trim();
                String votes = parts[4].trim();
                String status = parts[5].trim();

                Object[] row = {candidateName, constituencyName, partyName, partySymbol, votes, status};
                candidateResultTableModel.addRow(row);
            }
        }

        ClientSide.socket.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading candidate results: " + e.getMessage());
    }
}
private void loadPartyResultTableData() {
    resultPartyTableModel.setRowCount(0);  // Clear existing rows

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getpartyresults");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(";");
            if (parts.length == 3) {
                String partyName = parts[0].trim();
                String symbol = parts[1].trim();
                String seatsWon = parts[2].trim();

                resultPartyTableModel.addRow(new Object[]{partyName, symbol, seatsWon});
            }
        }

        ClientSide.socket.close(); // Optional
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading party results: " + e.getMessage());
    }
}
private void loadVoteHistoryTableData() {
    voteHistoryTableModel.setRowCount(0);  // Clear existing rows

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getvotehistory");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(";");
            if (parts.length == 4) {
                String voterName = parts[0].trim();
                String candidateName = parts[1].trim();
                String partyName = parts[2].trim();
                String voteTime = parts[3].trim();

                voteHistoryTableModel.addRow(new Object[]{voterName, candidateName, partyName, voteTime});
            }
        }

        ClientSide.socket.close(); // Optional
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading vote history: " + e.getMessage());
    }
}
private void loadPartyTable() {
    DefaultTableModel partyTableModel1 = (DefaultTableModel) partyTable.getModel();
    partyTableModel1.setRowCount(0);  // Clear existing rows

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("getallparties1");

        String line;
        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(";");
            if (parts.length == 3) {
                String partyId = parts[0].trim();     // ID first
                String partyName = parts[1].trim();   // Name
                String partySymbol = parts[2].trim(); // Symbol

                partyTableModel1.addRow(new Object[]{partyId, partyName, partySymbol});
            }
        }

        ClientSide.socket.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading parties: " + e.getMessage());
    }
}
        // TODO add your handling code here:
private void forceWinSelectedParty() {
    int selectedRow = partyTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a party from the table.");
        return;
    }

    String partyId = partyTableModel1.getValueAt(selectedRow, 0).toString(); // assuming ID is in column 0

    try {
        ClientSide.connectToServer();
        ClientSide.out.println("forcewin;" + partyId);

        String line;
        StringBuilder response = new StringBuilder();

        while ((line = ClientSide.in.readLine()) != null) {
            if (line.trim().isEmpty()) break;
            response.append(line).append("\n");
        }

        JOptionPane.showMessageDialog(this, response.toString().trim());

        ClientSide.socket.close();  // Optional, good practice
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error during force win: " + e.getMessage());
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Candidate;
    private javax.swing.JPanel EditResults;
    private javax.swing.JPanel Party;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JTextField candidateCnic;
    private javax.swing.JComboBox<String> candidateConstituency;
    private javax.swing.JTextField candidateName;
    private javax.swing.JTable candidateParty;
    private javax.swing.JTable candidateResultTable;
    private javax.swing.JTable candidateTable;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField cnicField;
    private javax.swing.JComboBox<String> constituencyField;
    private javax.swing.JPanel corruption;
    private javax.swing.JTextField genderField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField partyIdField;
    private javax.swing.JTextField partyNameField;
    private javax.swing.JTextField partySymbolField;
    private javax.swing.JTable partyTable;
    private javax.swing.JPanel reports;
    private javax.swing.JTable resultPartyTable;
    private javax.swing.JTable resultTable;
    private javax.swing.JPanel updateVoter;
    private javax.swing.JTable voteHistoryTable;
    private javax.swing.JScrollPane voterTable;
    private javax.swing.JTable voterTablee;
    // End of variables declaration//GEN-END:variables
}
