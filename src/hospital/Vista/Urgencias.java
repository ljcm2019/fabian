/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Vista;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author sala
 */
public class Urgencias extends javax.swing.JInternalFrame {
 public static final String URL = "jdbc:mysql://localhost:3306/hospital";
public static final String USERNAME="root";
public static final String PASSWORD="";
PreparedStatement ps;
ResultSet rs;
public static Connection getConection(){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection(URL , USERNAME, PASSWORD);
        JOptionPane.showMessageDialog(null,"Conexion exitosa");
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    return con;
    }
    /**
     * Creates new form Urgencias
     */
    public Urgencias() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Eme = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Urg = new javax.swing.JButton();
        Urgnv = new javax.swing.JButton();
        Consext = new javax.swing.JButton();
        Prio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel3.setText("Urgencia no vital");

        jLabel4.setText("Prioritaria");

        jLabel5.setText("Consulta externa");

        jLabel6.setText("Emergencia");

        Eme.setText("Continuar");
        Eme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmeMouseClicked(evt);
            }
        });
        Eme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmeActionPerformed(evt);
            }
        });

        jLabel7.setText("Menu de urgencias");

        Urg.setText("Continuar");
        Urg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrgActionPerformed(evt);
            }
        });

        Urgnv.setText("Continuar");
        Urgnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrgnvActionPerformed(evt);
            }
        });

        Consext.setText("Continuar");
        Consext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsextActionPerformed(evt);
            }
        });

        Prio.setText("Continuar");
        Prio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrioActionPerformed(evt);
            }
        });

        jLabel2.setText("Urgencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Urg)
                                .addComponent(Eme)
                                .addComponent(Urgnv)
                                .addComponent(Prio)
                                .addComponent(Consext)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel7)))
                    .addContainerGap(86, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Eme)
                        .addComponent(jLabel6))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Urg)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Urgnv)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Prio)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Consext)
                        .addComponent(jLabel5))
                    .addGap(31, 31, 31)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmeMouseClicked

    }//GEN-LAST:event_EmeMouseClicked

    private void EmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmeActionPerformed
     Persona vent=new Persona();
     HospitalV.Escritorios.add(vent);
     vent.toFront();
     vent.setVisible(true);
    }//GEN-LAST:event_EmeActionPerformed

    private void UrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrgActionPerformed
        JOptionPane.showMessageDialog(null,"Su atencion sera en 1 hora. Pasada esa hora dirijase al consultorio Unidad de urgencias");
        int yesValue= JOptionPane.showConfirmDialog(null,"¿Desea ingresar un nuevo paciente?");

    }//GEN-LAST:event_UrgActionPerformed

    private void UrgnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrgnvActionPerformed
        JOptionPane.showMessageDialog(null,"Su atencion sera dentro de 3 horas. Pasado ese tiempo dirijase al consultorio Unidad de urgencias");
        int yesValue= JOptionPane.showConfirmDialog(null,"¿Desea ingresar un nuevo paciente?");

    }//GEN-LAST:event_UrgnvActionPerformed

    private void ConsextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsextActionPerformed
        JOptionPane.showMessageDialog(null,"Su atencion sera dentro de 72 horas. Pasado ese tiempo dirijase a Consulta externa Unidad de atencion basica asignada. Si su condicion lo amerita puede solicitar una cita prioritaria");
        int yesValue= JOptionPane.showConfirmDialog(null,"¿Desea ingresar un nuevo paciente?");

    }//GEN-LAST:event_ConsextActionPerformed

    private void PrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrioActionPerformed
        JOptionPane.showMessageDialog(null,"Su atencion sera dentro de 6 horas. Pasado ese tiempo dirijase al consultorio Unidad de urgencias");
        int yesValue= JOptionPane.showConfirmDialog(null,"¿Desea ingresar un nuevo paciente?");

    }//GEN-LAST:event_PrioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Consext;
    public javax.swing.JButton Eme;
    public javax.swing.JButton Prio;
    public javax.swing.JButton Urg;
    public javax.swing.JButton Urgnv;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
