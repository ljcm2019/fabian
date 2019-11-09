/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gráfico;

/**
 *
 * @author Familia
 */
public class Pension extends javax.swing.JInternalFrame {

    /**
     * Creates new form Pension
     */
    public Pension() {
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
        chocategoria = new javax.swing.JComboBox<>();
        txtpromedio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        vaciar = new javax.swing.JButton();
        proce = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Categoria");

        jLabel2.setText("Promedio");

        chocategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A", "B", "C", "D" }));

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        vaciar.setText("Vaciar");
        vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });

        proce.setText("Calcular");
        proce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chocategoria, 0, 135, Short.MAX_VALUE)
                                    .addComponent(txtpromedio)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(vaciar)
                        .addGap(18, 18, 18)
                        .addComponent(proce)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaciar)
                    .addComponent(proce))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceActionPerformed
    double promedio,descu=0,total=0;
    int categoria,m;
    categoria=chocategoria.getSelectedIndex();
    promedio=Double.parseDouble(txtpromedio.getText());
    Clases.Universidad opc=new Clases.Universidad (categoria,promedio);
    m=opc.getCategoria();
    promedio=opc.getPromedio();
    switch (m){
        case 0:
            txtarea.append("Seleccionar"); 
        break;   
        case 1:
        if (promedio>=0 && promedio<=2.9){
            txtarea.append("Usted no tiene descuento, así que el valor a pagar es: 550");
        }
        else if (promedio>=3 && promedio<=3.9){
            descu=550*0.1;
            total=550-descu;
            txtarea.append("Usted tiene un descuento de: "+descu+"\n"+ " así que el valor a pagar es: "+total);
        }
    else if (promedio>=4 && promedio<=4.5){
            descu=550*0.12;
            total=550-descu;
            txtarea.append("Usted tiene un descuento de: "+descu+"\n"+ " así que el valor a pagar es: "+total);
        }
    else if (promedio>=4.6 && promedio<=5){
            descu=550*0.15;
            total=550-descu;
        txtarea.append("Usted tiene un descuento de: "+descu+"\n"+ " así que el valor a pagar es: "+total);
        }
    break;
    case 2:
            if (promedio>=0 && promedio<=2.9){
            txtarea.append("Usted no tiene descuento, así que el valor a pagar es: 500");
        }
        else if (promedio>=3 && promedio<=3.9){
            descu=500*0.1;
            total=500-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+ " así que el valor a pagar es: "+total);
        }
    else if (promedio>=4 && promedio<=4.5){
            descu=500*0.12;
            total=500-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    else if (promedio>=4.6 && promedio<=5){
            descu=500*0.15;
            total=500-descu;
         txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    break;
    case 3:
            if (promedio>=0 && promedio<=2.9){
            txtarea.append("Usted no tiene descuento, así que el valor a pagar es: 460");
        }
        else if (promedio>=3 && promedio<=3.9){
            descu=460*0.1;
            total=460-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    else if (promedio>=4 && promedio<=4.5){
            descu=460*0.12;
            total=460-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    else if (promedio>=4.6 && promedio<=5){
            descu=460*0.15;
            total=460-descu;
         txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    break;
    case 4:
            if (promedio>=0 && promedio<=2.9){
            txtarea.append("Usted no tiene descuento, así que el valor a pagar es: 400");
        }
        else if (promedio>=3 && promedio<=3.9){
            descu=400*0.1;
            total=400-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    else if (promedio>=4 && promedio<=4.5){
            descu=400*0.12;
            total=400-descu;
             txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    else if (promedio>=4.6 && promedio<=5){
            descu=400*0.15;
            total=400-descu;
         txtarea.append("Usted tiene un descuento de: "+descu+"\n"+" así que el valor a pagar es: "+total);
        }
    break;
}        
    }//GEN-LAST:event_proceActionPerformed

    private void vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarActionPerformed
        String mensaje= " ";
        txtarea.setText(mensaje);
        txtpromedio.setText(mensaje);
    }//GEN-LAST:event_vaciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chocategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proce;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtpromedio;
    private javax.swing.JButton vaciar;
    // End of variables declaration//GEN-END:variables
}
