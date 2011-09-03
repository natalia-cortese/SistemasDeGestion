package Pantalla;

import Controlador.ControladorPrincipal;

public class PantallaConexcionBD extends javax.swing.JFrame{
    ControladorPrincipal controladorPrincipal;
        
    public PantallaConexcionBD(ControladorPrincipal controladorPrincipal){
        this.controladorPrincipal = controladorPrincipal;
        initComponents();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuarioArea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passArea = new javax.swing.JTextField();
        conectarBoton = new javax.swing.JButton();
        salidBoton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dirArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Ingrese los datos de conexion:");

        jLabel3.setText("Usuario:");

        usuarioArea.setText("root");

        jLabel4.setText("Contraseña:");

        conectarBoton.setText("Conectar");
        conectarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarBotonActionPerformed(evt);
            }
        });

        salidBoton.setText("Salir");
        salidBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidBotonActionPerformed(evt);
            }
        });

        jLabel5.setText("Dirección de la base de datos:");

        dirArea.setText("//localhost:3306/disenio");

        jLabel6.setText("Por ejemplo: //ipBaseDato/nombreBaseDato");

        jLabel7.setText("Por ejemplo://localhost:nroPuesto/nombreBaseDato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conectarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passArea, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(usuarioArea, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(dirArea, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(salidBoton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dirArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usuarioArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(conectarBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(salidBoton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void conectarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarBotonActionPerformed
        if (!dirArea.getText().equals("")){
            if (!usuarioArea.getText().equals("")){
                if (!passArea.getText().equals("")){
                    controladorPrincipal.crearConexion(dirArea.getText(), usuarioArea.getText(), passArea.getText());
                    }
                }
            }
    }//GEN-LAST:event_conectarBotonActionPerformed

    private void salidBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidBotonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidBotonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conectarBoton;
    private javax.swing.JTextField dirArea;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField passArea;
    private javax.swing.JButton salidBoton;
    private javax.swing.JTextField usuarioArea;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
        dirArea.setText("");
        usuarioArea.setText("");
        passArea.setText("");
    }
}
