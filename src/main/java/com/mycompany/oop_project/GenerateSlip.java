/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.oop_project;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author VWPiseth
 */
public class GenerateSlip extends javax.swing.JFrame {

    /**
     * Creates new form GenerateSlip
     */
    public GenerateSlip() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeIDSlips = new javax.swing.JTextField();
        txtEmployeeNameSlips = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmployeeDepartmentSlips = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGenerateSlips = new javax.swing.JButton();
        btnBack2Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Generate Salary Slips");

        jLabel2.setText("Employee ID");

        jLabel3.setText("Name ");

        txtEmployeeIDSlips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDSlipsActionPerformed(evt);
            }
        });

        jLabel4.setText("Department");

        btnGenerateSlips.setText("Generate");
        btnGenerateSlips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateSlipsActionPerformed(evt);
            }
        });

        btnBack2Menu.setText("Back to Menu");
        btnBack2Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeIDSlips, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeNameSlips, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeDepartmentSlips, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack2Menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerateSlips)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeIDSlips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmployeeNameSlips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmployeeDepartmentSlips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerateSlips)
                    .addComponent(btnBack2Menu))
                .addGap(18, 18, 18))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIDSlipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDSlipsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDSlipsActionPerformed

    private void btnGenerateSlipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateSlipsActionPerformed
        ArrayList<Employee> employeelist = Employee.readEmployeeFromFile();
        boolean found = false;
        if(txtEmployeeIDSlips.getText().equals("")||txtEmployeeNameSlips.getText().equals("")||txtEmployeeDepartmentSlips.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Please Enter All Data!");
        }
        else{
            try {
                // TODO add your handling code here:
                FileWriter writer = new FileWriter("Salary Slips.doc",true);
                writer.write("\r\n");
                writer.write("Your Salary Slips");
                writer.write("\r\n");
                writer.write("\r\n");
                writer.write("NAME: ");
                writer.write(txtEmployeeNameSlips.getText());
                writer.write("\r\n");
                writer.write("ID: ");
                writer.write(txtEmployeeIDSlips.getText());
                writer.write("\r\n");
                writer.write("DEPARTMENT: ");
                writer.write(txtEmployeeDepartmentSlips.getText());
                writer.write("\r\n");
                writer.write("Salary amount:");
                for(Employee employee : employeelist){
                    if (employee.getId().equals(txtEmployeeIDSlips.getText())){
                        found = true;
                        double salary = employee.getSalary();
                        writer.write(Double.toString(salary));
                        writer.write("\r\n");
                        writer.write("Please print out the slips and confirm it with the Financial Department");
                        writer.write("\r\n");
                        writer.write("\r\n");
                        writer.write("Signature");
                        writer.write("\r\n");
                        writer.write("\r\n");
                        writer.write("\r\n");
                        writer.write("\r\n");
                        writer.write("__________");
                        writer.close();
                        txtEmployeeNameSlips.setText("");
                        txtEmployeeIDSlips.setText("");
                        txtEmployeeDepartmentSlips.setText("");
                        JOptionPane.showMessageDialog(this,"Generated Successfully. Please Check file Salary Slips.doc");
                    }
                }
                if (!found) {
                    txtEmployeeIDSlips.setText("");
                    txtEmployeeNameSlips.setText("");
                    txtEmployeeDepartmentSlips.setText("");
                    JOptionPane.showMessageDialog(null, "Employee ID not found!");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGenerateSlipsActionPerformed

    private void btnBack2MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2MenuActionPerformed
        // TODO add your handling code here:
        EmployeeMenu employeemenu = new EmployeeMenu();
        employeemenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBack2MenuActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateSlip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2Menu;
    private javax.swing.JButton btnGenerateSlips;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmployeeDepartmentSlips;
    private javax.swing.JTextField txtEmployeeIDSlips;
    private javax.swing.JTextField txtEmployeeNameSlips;
    // End of variables declaration//GEN-END:variables
}