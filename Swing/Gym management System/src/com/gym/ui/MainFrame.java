
package com.gym.ui;

import com.gym.dao.MemberDAO;
import com.gym.model.Member;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mjnas
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSearchId = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        lblDays = new javax.swing.JLabel();
        btnCheckIn = new javax.swing.JButton();
        lblMemberImage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        txtSearchId.setBackground(new java.awt.Color(102, 0, 51));
        txtSearchId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtSearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIdActionPerformed(evt);
            }
        });
        txtSearchId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchIdKeyPressed(evt);
            }
        });

        lblStatus.setBackground(new java.awt.Color(102, 0, 51));
        lblStatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "صلاحية الاشتراك ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        lblStatus.setOpaque(true);

        lblDays.setBackground(new java.awt.Color(102, 0, 51));
        lblDays.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lblDays.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, " الأيام المتبقيه ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18)))); // NOI18N
        lblDays.setOpaque(true);

        btnCheckIn.setBackground(new java.awt.Color(0, 102, 102));
        btnCheckIn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_check_35dp_E3E3E3_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        btnCheckIn.setText("Check-in");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        lblMemberImage.setBackground(new java.awt.Color(0, 102, 102));
        lblMemberImage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "You Are Beautiful", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N
        lblMemberImage.setOpaque(true);

        lblName.setBackground(new java.awt.Color(102, 0, 51));
        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "اللاسم", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 24))); // NOI18N
        lblName.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person_add_35dp_E3E3E3_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        jLabel1.setText("  ADD  Member");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/manage_accounts_35dp_E3E3E3_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        jLabel2.setText("Manage Member");
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 0, 51));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login_35dp_E3E3E3_FILL0_wght400_GRAD0_opsz40.png"))); // NOI18N
        jLabel6.setText("    LOGIN");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearchId)
                        .addGap(107, 107, 107)
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMemberImage, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(359, 359, 359))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addComponent(lblMemberImage, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDays, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel6)))
                .addGap(0, 181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchIdActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        String pid = txtSearchId.getText().trim();
        txtSearchId.setText("");
        if (pid.isEmpty()) {
            return;
        }

        MemberDAO dao = new MemberDAO();
        Member m = dao.getMemberByPersonalId(pid);

        if (m == null) {
            JOptionPane.showMessageDialog(this, "هذا العضو غير موجود!", "خطأ", JOptionPane.ERROR_MESSAGE);
            return;
        }

        lblName.setText(m.getFullName());

        //هاض الكود عشان شكل الصوره مايطلع بمقايس مش حلوه 
        if (m.getImagePath() != null && !m.getImagePath().isEmpty()) {
            try {
                ImageIcon imageIcon = new ImageIcon(m.getImagePath());
                Image image = imageIcon.getImage();

                Image newimg = image.getScaledInstance(700, 700, Image.SCALE_SMOOTH);
                lblMemberImage.setIcon(new ImageIcon(newimg));
            } catch (Exception e) {
                lblMemberImage.setText("No Image");
            }
        }

// حساب الأيام المتبقية وحالة الاشتراك
 
        Date today = new Date();
        Date joinDate = m.getJoinDate();

        int durationDays = 0;
        if (m.getMembershipType().equals("Monthly")) {
            durationDays = 30;
        } else if (m.getMembershipType().equals("Quarterly")) {
            durationDays = 90;
        } else if (m.getMembershipType().equals("Yearly")) {
            durationDays = 365;
        }

// حساب تاريخ الانتهاء  
        Calendar cal = Calendar.getInstance();
        cal.setTime(joinDate);
        cal.add(Calendar.DAY_OF_MONTH, durationDays);
        Date expiryDate = cal.getTime();

// الفرق بين اليوم وتاريخ الانتهاء
        long diff = expiryDate.getTime() - today.getTime();
        long daysLeft = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        lblDays.setText("" + daysLeft);

        if (daysLeft > 0) {
            lblStatus.setText("اشتراك ساري ");
            lblStatus.setForeground(Color.GREEN);
            jPanel1.setBackground(Color.GREEN);

        } else {
            lblStatus.setText("اشتراك منتهي");
            lblStatus.setForeground(Color.RED);
            jPanel1.setBackground(Color.RED);

            JOptionPane.showMessageDialog(this, "تنبيه: اشتراك هذا اللاعب منتهي!", "تنبيه", JOptionPane.WARNING_MESSAGE);
        }

        if (!m.getDiseases().isEmpty() && !m.getDiseases().equals("لا يوجد")) {
            JOptionPane.showMessageDialog(this, "انتبه! اللاعب يعاني من: " + m.getDiseases(), "تحذير طبي", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void txtSearchIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchIdKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCheckIn.doClick();
        }
    }//GEN-LAST:event_txtSearchIdKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        AddMemberFrame add = new AddMemberFrame();
        add.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ManageMembersFrame man = new ManageMembersFrame();
        man.setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        LoginFrame lo = new LoginFrame();
        lo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDays;
    private javax.swing.JLabel lblMemberImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtSearchId;
    // End of variables declaration//GEN-END:variables
}
