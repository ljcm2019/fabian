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
public class Stock extends javax.swing.JInternalFrame {

    /**
     * Creates new form Stock
     */
    public Stock() {
        initComponents();
    }
    int stockf=2000,capacidad=3500,deposito,retiro,mayord,menord,mayorr,menorr,depositc,retirc;

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
        operacion = new javax.swing.JComboBox<>();
        opera = new javax.swing.JButton();
        cantidad = new javax.swing.JTextField();
        borra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Operación");

        jLabel2.setText("Cantidad");

        operacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Depositar ", "Retirar" }));
        operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionActionPerformed(evt);
            }
        });

        opera.setText("Operar");
        opera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operaActionPerformed(evt);
            }
        });

        borra.setText("Borrar");
        borra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borraActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(operacion, 0, 176, Short.MAX_VALUE)
                            .addComponent(cantidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borra))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void operaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operaActionPerformed
    int canti, opera,getcanti,cantif=0;   
    canti=Integer.valueOf(cantidad.getText());
    opera=operacion.getSelectedIndex();
    Clases.Stock opc=new Clases.Stock(opera,canti);
    getcanti=opc.getCantidad();
    switch(opera){
        case 0:
            area.append("Seleccione una opción");
               break;
        case 1: 
            deposito=deposito+getcanti;
            depositc++;
            if (depositc==1){
                mayord=getcanti;
                menord=getcanti;
            }   
            else if(getcanti>menord){
                mayord=getcanti;
            }
            else {
                menord=getcanti;
            }
            stockf=stockf+getcanti;
            cantif=capacidad-stockf;
            break;
        case 2:
            retiro=retiro+getcanti;
            retirc++;
            if (retirc==1){
                mayorr=getcanti;
                menorr=getcanti;
            }   
            else if(getcanti>menorr){
                mayorr=getcanti;
            }
            else {
                menorr=getcanti;
            }
            stockf=stockf-getcanti;
            cantif=capacidad-stockf;
            break;
                 
    }
    
            String mensaje="";
            area.setText(mensaje);
            area.append("Stock actual del almacen: "+stockf+"\n");
            area.append("Capacidad libre: "+cantif+"\n");
            area.append("Numero de depositos efectuados: "+depositc+"\n");
            area.append("Numero de retiros efectuados: "+retirc+"\n");
            area.append("Cantidad de bolsas depositadas: "+deposito+"\n");
            area.append("Cantidad de bolsas retiradas: "+retiro+"\n");
            area.append("Cantidad maxima de bolsas depositadas: "+mayord+"\n");
            area.append("Cantidad minima de bolsas depositadas: "+menord+"\n");
            area.append("Cantidad maxima de bolsas retiradas: "+mayorr+"\n");
            area.append("Cantidad minima de bolsas retiradas: "+menorr+"\n");
            
    }//GEN-LAST:event_operaActionPerformed

    private void operacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operacionActionPerformed

    private void borraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borraActionPerformed
       String mensaje=" ";
       area.setText(mensaje);
    }//GEN-LAST:event_borraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton borra;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton opera;
    private javax.swing.JComboBox<String> operacion;
    // End of variables declaration//GEN-END:variables
}
