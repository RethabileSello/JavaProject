
import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class VoiceOverClassesWithMissHems extends javax.swing.JFrame {

    
    int gcombo = 0;
    int gcheckbox = 0;
    int gradio = 0;
    
    
    
    
    
    int gtotalPrice = 0;
    public VoiceOverClassesWithMissHems() {
        initComponents();
        this.jComboBox1.addItem("Select");
        jComboBox1.addItem("Bronze");
        jComboBox1.addItem("Silver");
        jComboBox1.addItem("Gold");
        jComboBox1.addItem("Platinum");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNameSur = new javax.swing.JTextField();
        txtPhoneNr = new javax.swing.JTextField();
        txtPackagePrice = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtTypeVoAmt = new javax.swing.JTextField();
        chkRadio = new javax.swing.JCheckBox();
        chkCommercials = new javax.swing.JCheckBox();
        chkInternet = new javax.swing.JCheckBox();
        chkCorporate = new javax.swing.JCheckBox();
        chkCharAnim = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtRadPrice = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTotalAmt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Name & Surname:\n");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Phone numbers:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Choose your package:");

        txtNameSur.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNameSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSurActionPerformed(evt);
            }
        });
        txtNameSur.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameSurKeyPressed(evt);
            }
        });

        txtPhoneNr.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhoneNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNrActionPerformed(evt);
            }
        });
        txtPhoneNr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNrKeyPressed(evt);
            }
        });

        txtPackagePrice.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Type of Voice-Over:");

        txtTypeVoAmt.setText("0");
        txtTypeVoAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeVoAmtActionPerformed(evt);
            }
        });

        chkRadio.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkRadio.setText("Radio");
        chkRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRadioActionPerformed(evt);
            }
        });

        chkCommercials.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkCommercials.setText("Commercials");
        chkCommercials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCommercialsActionPerformed(evt);
            }
        });

        chkInternet.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkInternet.setText("Internet");
        chkInternet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkInternetActionPerformed(evt);
            }
        });

        chkCorporate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkCorporate.setText("Corporate");
        chkCorporate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCorporateActionPerformed(evt);
            }
        });

        chkCharAnim.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkCharAnim.setText("Character/Animation");
        chkCharAnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCharAnimActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Preferred method of correspondence:");

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRadioButton1.setText("Virtual");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jRadioButton2.setText("Contact");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Age:");

        txtAge.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel17.setText("Discount:");

        txtDiscount.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtDiscount.setText("0");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bronze");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("<html>3 months<br>5 sessions<br>Certification<br>R7500<br>");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Silver");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("<html>6 months<br>11 sessions<br>Certification<br>R10000<br>");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Gold");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("<html> 8 months<br>17 sessions<br>Certification<br> Yamaha Equipment\n <br>R16000<br>");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Platinum");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("<html>12 months<br>23 sessions<br>Certification<br>Yamaha Equipment<br>Agency sign-up<br>3 weeks coaching in LA<br>R27000");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel9.setText("Packages we offer:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(81, 81, 81)))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 51, 255));
        jLabel15.setText("<html>Voice-Over Acting Classes<br> With Miss Hems<br>");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setText("(Note: Age will be verified during registration)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameSur, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNr, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2)
                                .addGap(33, 33, 33)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalAmt))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txtPackagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13)
                        .addGap(36, 36, 36)
                        .addComponent(chkRadio)
                        .addGap(10, 10, 10)
                        .addComponent(chkCommercials)
                        .addGap(10, 10, 10)
                        .addComponent(chkInternet))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(chkCorporate)
                        .addGap(18, 18, 18)
                        .addComponent(chkCharAnim))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(txtTypeVoAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jRadioButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(txtRadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel16)
                        .addGap(44, 44, 44)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNameSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(txtPhoneNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(txtPackagePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel13))
                            .addComponent(chkRadio)
                            .addComponent(chkCommercials)
                            .addComponent(chkInternet))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCorporate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkCharAnim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(txtTypeVoAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14))
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addGap(18, 18, 18)
                        .addComponent(txtRadPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalAmt, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(52, 52, 52))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imgae2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        if(jComboBox1.getSelectedItem().equals("Bronze")){
            txtPackagePrice.setText("7500");
            gcombo = 7500;
     }
        else if(jComboBox1.getSelectedItem().equals("Silver")){
            txtPackagePrice.setText("10100");
            gcombo = 10000;
        }
        else if(jComboBox1.getSelectedItem().equals("Gold")){
            txtPackagePrice.setText("16000");
            gcombo = 16000;
        }
        else if(jComboBox1.getSelectedItem().equals("Platinum")){
            txtPackagePrice.setText("27000");
            gcombo = 270000;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void chkRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRadioActionPerformed
        
        int ExtraPrice = Integer.parseInt(txtTypeVoAmt.getText());
        int RadioPrice = 7000;
        if(chkRadio.isSelected()){
            ExtraPrice = ExtraPrice + RadioPrice;
        }
        else{
            ExtraPrice = ExtraPrice - RadioPrice;
        }
        txtTypeVoAmt.setText(Integer.toString(ExtraPrice));
        gcheckbox = ExtraPrice;
    }//GEN-LAST:event_chkRadioActionPerformed

    private void chkCharAnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCharAnimActionPerformed
        // TODO add your handling code here:
        int ExtraPrice = Integer.parseInt(txtTypeVoAmt.getText());
        int CharAnimPrice = 10000;
        if(chkCharAnim.isSelected()){
            ExtraPrice = ExtraPrice + CharAnimPrice;
            
        }
        else{ ExtraPrice = ExtraPrice - CharAnimPrice;
        
        }
        txtTypeVoAmt.setText(Integer.toString(ExtraPrice));
        gcheckbox = ExtraPrice;
    }//GEN-LAST:event_chkCharAnimActionPerformed

    private void chkCommercialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCommercialsActionPerformed
        
        int ExtraPrice = Integer.parseInt(txtTypeVoAmt.getText());
        int CommercialsPrice = 5000;
        if(chkCommercials.isSelected()) {
            ExtraPrice = ExtraPrice + CommercialsPrice;
        }
        else{
            ExtraPrice = ExtraPrice - CommercialsPrice;
        }
        txtTypeVoAmt.setText(Integer.toString(ExtraPrice));
        gcheckbox = ExtraPrice;
    }//GEN-LAST:event_chkCommercialsActionPerformed

    private void chkInternetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkInternetActionPerformed
        
        int ExtraPrice = Integer.parseInt(txtTypeVoAmt.getText());
        int InternetPrice = 8000;
        if(chkInternet.isSelected()){
            ExtraPrice = ExtraPrice + InternetPrice;
        }
        else{ ExtraPrice = ExtraPrice - InternetPrice;
        
        }
        txtTypeVoAmt.setText(Integer.toString(ExtraPrice));
        gcheckbox = ExtraPrice;
    }//GEN-LAST:event_chkInternetActionPerformed

    private void chkCorporateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCorporateActionPerformed
       
        int ExtraPrice = Integer.parseInt(txtTypeVoAmt.getText());
        int CorporatePrice = 12000;
        if(chkCorporate.isSelected()){
            ExtraPrice = ExtraPrice + CorporatePrice;
        }
        else{
            ExtraPrice = ExtraPrice - CorporatePrice;
        }
        txtTypeVoAmt.setText(Integer.toString(ExtraPrice));
        gcheckbox = ExtraPrice;
    }//GEN-LAST:event_chkCorporateActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        int Virtual = 500;
        
        if(jRadioButton1.isSelected())
            this.jRadioButton2.setSelected(false);
        { 
           this.txtRadPrice.setText(Integer.toString(Virtual));
           gradio = Virtual;
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
        int Contact = 1000;
        
        if (jRadioButton2.isSelected()) {
            this.jRadioButton1.setSelected(false);
            this.txtRadPrice.setText(Integer.toString(Contact));
            gradio = Contact;
        }
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtTypeVoAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeVoAmtActionPerformed
        
    }//GEN-LAST:event_txtTypeVoAmtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int Price1=Integer.parseInt(txtPackagePrice.getText());
         int Price2=Integer.parseInt(txtTypeVoAmt.getText());
         int Price3=Integer.parseInt(txtRadPrice.getText());
         int Price4=Integer.parseInt(txtDiscount.getText());
         
         int gtotalPrice=0;
         gtotalPrice=(Price1+Price2+Price3-Price4);
         
         
        
        this.txtTotalAmt.setText(txtNameSur.getText()+", amount to pay is: "+ txtTotalAmt.getText()+" "+" "+gtotalPrice+".");
        
        int Discount;
        int Age=Integer.parseInt(this.txtAge.getText());
        
        if(Age<=18){
            Discount=250;
            this.txtDiscount.setText(Integer.toString(Discount));
        }
        else if(Age<=25){
            Discount=200;
            this.txtDiscount.setText(Integer.toString(Discount));
        }
        else if(Age<=35){
                Discount=150;
            this.txtDiscount.setText(Integer.toString(Discount));
        }
        else{
            Discount=100;
            this.txtDiscount.setText(Integer.toString(Discount));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        txtNameSur.setText(" ");
        txtPhoneNr.setText(" ");
        jComboBox1.setSelectedIndex(0);
        chkRadio.setSelected(false);
        chkCommercials.setSelected(false);
        chkInternet.setSelected(false);
        chkCorporate.setSelected(false);
        chkCharAnim.setSelected(false);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        txtPackagePrice.setText(" ");
        txtAge.setText(" ");
        txtTypeVoAmt.setText(" ");
        txtRadPrice.setText(" ");
        txtDiscount.setText(" ");
        txtTotalAmt.setText(" ");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNameSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSurActionPerformed
       
        
    
    }//GEN-LAST:event_txtNameSurActionPerformed

    private void txtNameSurKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSurKeyPressed
        
       char c =evt.getKeyChar();
       
       if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
           txtNameSur.setEditable(true);
       }else{
           txtNameSur.setEditable(false);
       }
    }//GEN-LAST:event_txtNameSurKeyPressed

    private void txtPhoneNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNrActionPerformed
        
    }//GEN-LAST:event_txtPhoneNrActionPerformed

    private void txtPhoneNrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNrKeyPressed
        
        String phoneNumber = txtPhoneNr.getText();
       int length = phoneNumber.length();
       
       char c = evt.getKeyChar();
       
       if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
           if(length<10){
               txtPhoneNr.setEditable(true);
           }else{
               txtPhoneNr.setEditable(false);
           }
       }else{
           if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
             txtPhoneNr.setEditable(true);
               
           }else{
              txtPhoneNr.setEditable(false); 
           }
               
               
               }
        
    }//GEN-LAST:event_txtPhoneNrKeyPressed

    
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
            java.util.logging.Logger.getLogger(VoiceOverClassesWithMissHems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoiceOverClassesWithMissHems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoiceOverClassesWithMissHems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoiceOverClassesWithMissHems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoiceOverClassesWithMissHems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkCharAnim;
    private javax.swing.JCheckBox chkCommercials;
    private javax.swing.JCheckBox chkCorporate;
    private javax.swing.JCheckBox chkInternet;
    private javax.swing.JCheckBox chkRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtNameSur;
    private javax.swing.JTextField txtPackagePrice;
    private javax.swing.JTextField txtPhoneNr;
    private javax.swing.JTextField txtRadPrice;
    private javax.swing.JTextField txtTotalAmt;
    private javax.swing.JTextField txtTypeVoAmt;
    // End of variables declaration//GEN-END:variables
}
