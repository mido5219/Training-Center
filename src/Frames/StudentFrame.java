/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Actors.*;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BinLaden
 */
public class StudentFrame extends javax.swing.JFrame {

    Student Student;

    public StudentFrame() {
        initComponents();
    }

    public StudentFrame(Student Student) {
        initComponents();
        this.Student = Student;
        WelcomeMessage.setText("Study Well " + this.Student.getFullName() + "!");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddCoursePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListCoursesPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DeleteCoursePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ContainerCard = new javax.swing.JPanel();
        WelcomeCard = new javax.swing.JPanel();
        WelcomeMessage = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        AddCourseCard = new javax.swing.JPanel();
        sAddCourseListBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnAddCourse = new javax.swing.JButton();
        ListCoursesCard = new javax.swing.JPanel();
        DeleteCourseCard = new javax.swing.JPanel();
        sDeleteCourseListBox = new javax.swing.JComboBox<>();
        btnDeleteCourse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 58, 73));
        jPanel2.setMinimumSize(new java.awt.Dimension(260, 460));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddCoursePanel.setBackground(new java.awt.Color(30, 36, 45));
        AddCoursePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddCoursePanel.setPreferredSize(new java.awt.Dimension(0, 0));
        AddCoursePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCoursePanelMouseClicked(evt);
            }
        });
        AddCoursePanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Plus_Math_15px_2.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(45, 15));
        AddCoursePanel.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Course");
        AddCoursePanel.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(AddCoursePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 50));

        ListCoursesPanel.setBackground(new java.awt.Color(30, 36, 45));
        ListCoursesPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListCoursesPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        ListCoursesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListCoursesPanelMouseClicked(evt);
            }
        });
        ListCoursesPanel.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_List_15px.png"))); // NOI18N
        jLabel9.setPreferredSize(new java.awt.Dimension(45, 15));
        ListCoursesPanel.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jLabel10.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("List Courses");
        ListCoursesPanel.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel2.add(ListCoursesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 290, 50));

        DeleteCoursePanel.setBackground(new java.awt.Color(30, 36, 45));
        DeleteCoursePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteCoursePanel.setPreferredSize(new java.awt.Dimension(0, 0));
        DeleteCoursePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCoursePanelMouseClicked(evt);
            }
        });
        DeleteCoursePanel.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Delete_15px.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(45, 15));
        DeleteCoursePanel.add(jLabel7, java.awt.BorderLayout.LINE_START);

        jLabel8.setFont(new java.awt.Font("Futura Bk BT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Delete Course");
        DeleteCoursePanel.add(jLabel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(DeleteCoursePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 290, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 690));

        ContainerCard.setBackground(new java.awt.Color(110, 89, 222));
        ContainerCard.setPreferredSize(new java.awt.Dimension(0, 0));
        ContainerCard.setLayout(new java.awt.CardLayout());

        WelcomeCard.setBackground(new java.awt.Color(255, 0, 51));
        WelcomeCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomeMessage.setFont(new java.awt.Font("Futura Md BT", 0, 24)); // NOI18N
        WelcomeMessage.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeCard.add(WelcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 560, 170));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_Teenager_Male_100px.png"))); // NOI18N
        WelcomeCard.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 100, 170));

        ContainerCard.add(WelcomeCard, "card2");

        AddCourseCard.setBackground(new java.awt.Color(236, 240, 241));
        AddCourseCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sAddCourseListBox.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        sAddCourseListBox.setBorder(null);
        sAddCourseListBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sAddCourseListBoxActionPerformed(evt);
            }
        });
        AddCourseCard.add(sAddCourseListBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 206, 373, -1));

        jLabel3.setText("after the user chooses a course from the list you display that course with all its info before he confirms adding");
        AddCourseCard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 670, 200));

        btnAddCourse.setBackground(new java.awt.Color(0, 204, 204));
        btnAddCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCourse.setText("Add Course");
        btnAddCourse.setActionCommand("");
        btnAddCourse.setBorder(null);
        btnAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCourseActionPerformed(evt);
            }
        });
        AddCourseCard.add(btnAddCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 600, 390, 50));

        ContainerCard.add(AddCourseCard, "card2");

        ListCoursesCard.setBackground(new java.awt.Color(236, 240, 241));
        ListCoursesCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ContainerCard.add(ListCoursesCard, "card2");

        DeleteCourseCard.setBackground(new java.awt.Color(236, 240, 241));
        DeleteCourseCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sDeleteCourseListBox.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        sDeleteCourseListBox.setToolTipText("");
        sDeleteCourseListBox.setBorder(null);
        DeleteCourseCard.add(sDeleteCourseListBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 390, 60));

        btnDeleteCourse.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCourse.setText("Delete Course");
        btnDeleteCourse.setBorder(null);
        btnDeleteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCourseActionPerformed(evt);
            }
        });
        DeleteCourseCard.add(btnDeleteCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 390, 50));

        ContainerCard.add(DeleteCourseCard, "card2");

        jPanel1.add(ContainerCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 0, 780, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteCoursePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCoursePanelMouseClicked
        // TODO add your handling code here:
        ContainerCard.removeAll();
        ContainerCard.repaint();
        ContainerCard.revalidate();
        ContainerCard.add(DeleteCourseCard);
        ContainerCard.repaint();
        ContainerCard.revalidate();
        AddCoursePanel.setBackground(new Color(30, 36, 45));
        ListCoursesPanel.setBackground(new Color(30, 36, 45));
        DeleteCoursePanel.setBackground(new Color(255, 51, 102));
        try {
            // TODO add your handling code here:
            ArrayList<Courses> CoursesList = this.Student.ListCourse();
            sDeleteCourseListBox.removeAllItems();
            for (int i = 0; i < CoursesList.size(); i++) {
                sDeleteCourseListBox.addItem(CoursesList.get(i).getCourseName());
            }
        } catch (IOException | ClassNotFoundException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No Courses Yet");
        }

    }//GEN-LAST:event_DeleteCoursePanelMouseClicked

    private void ListCoursesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListCoursesPanelMouseClicked
        // TODO add your handling code here:
        ContainerCard.removeAll();
        ContainerCard.repaint();
        ContainerCard.revalidate();
        ContainerCard.add(ListCoursesCard);
        ContainerCard.repaint();
        ContainerCard.revalidate();
        AddCoursePanel.setBackground(new Color(30, 36, 45));
        DeleteCoursePanel.setBackground(new Color(30, 36, 45));
        ListCoursesPanel.setBackground(new Color(255, 51, 102));
    }//GEN-LAST:event_ListCoursesPanelMouseClicked

    private void AddCoursePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCoursePanelMouseClicked
        ContainerCard.removeAll();
        ContainerCard.repaint();
        ContainerCard.revalidate();
        ContainerCard.add(AddCourseCard);
        ContainerCard.repaint();
        ContainerCard.revalidate();
        ListCoursesPanel.setBackground(new Color(30, 36, 45));
        DeleteCoursePanel.setBackground(new Color(30, 36, 45));
        AddCoursePanel.setBackground(new Color(255, 51, 102));
        try {
            // TODO add your handling code here:
            Courses c = new Courses();
            ArrayList<Courses> CoursesList = c.loadcourse();
            sAddCourseListBox.removeAllItems();
            for (int i = 0; i < CoursesList.size(); i++) {
                sAddCourseListBox.addItem(CoursesList.get(i).getCourseName());
            }
        } catch (IOException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No Courses Yet");
        }

    }//GEN-LAST:event_AddCoursePanelMouseClicked

    private void btnDeleteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCourseActionPerformed
        // TODO add your handling code here:

        try {
            this.Student.DeleteCourse(sDeleteCourseListBox.getSelectedItem().toString());
            ArrayList<Courses> CoursesList = this.Student.ListCourse();
            sDeleteCourseListBox.removeAllItems();
            for (int i = 0; i < CoursesList.size(); i++) {
                sDeleteCourseListBox.addItem(CoursesList.get(i).getCourseName());
            }
        } catch (IOException | ClassNotFoundException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "No Courses Yet");
        }
    }//GEN-LAST:event_btnDeleteCourseActionPerformed

    private void btnAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCourseActionPerformed
        try {
            // TODO add your handling code here:
            this.Student.AddCourse(sAddCourseListBox.getSelectedItem().toString());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Can't find listed course");
        }
    }//GEN-LAST:event_btnAddCourseActionPerformed

    private void sAddCourseListBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sAddCourseListBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sAddCourseListBoxActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddCourseCard;
    private javax.swing.JPanel AddCoursePanel;
    private javax.swing.JPanel ContainerCard;
    private javax.swing.JPanel DeleteCourseCard;
    private javax.swing.JPanel DeleteCoursePanel;
    private javax.swing.JPanel ListCoursesCard;
    private javax.swing.JPanel ListCoursesPanel;
    private javax.swing.JPanel WelcomeCard;
    private javax.swing.JLabel WelcomeMessage;
    private javax.swing.JButton btnAddCourse;
    private javax.swing.JButton btnDeleteCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> sAddCourseListBox;
    private javax.swing.JComboBox<String> sDeleteCourseListBox;
    // End of variables declaration//GEN-END:variables
}
