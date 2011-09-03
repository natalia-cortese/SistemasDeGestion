package Controlador;

import Pantalla.*;
import Persistencia.AdministradorTx;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class ControladorPrincipal {

    private PantallaPrincipal pantallaPrincipal;

    public ControladorPrincipal() {
        pantallaPrincipal = new PantallaPrincipal(this);
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        crearConexion("jdbc:mysql://localhost:3306/sg1", "root", "24241");


        pantallaPrincipal.getItemCliente().addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    agregarCliente();
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    
        pantallaPrincipal.getItemProducto().addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    agregarProducto();
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    

     pantallaPrincipal.getItemProveedor().addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    agregarProveedor();
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
}
        public void crearConexion(String dir, String usuario, String pass){
        try{
            AdministradorTx.getInstance().crearConexion(dir, usuario, pass);
            }
        catch (Exception e){
            e.printStackTrace();
            }

        }

    private void agregarCliente() throws PropertyVetoException {
        new ControladorCliente(this).agregarCliente();
    }

        private void agregarProducto() throws PropertyVetoException {
        new ControladorProducto(this).agregarProducto();
    }

        private void agregarProveedor() throws PropertyVetoException {
        new ControladorProveedor(this).agregarProveedor();
    }

    public void add(JInternalFrame jInternalFrame) {
        System.out.println("AGREGA");
        pantallaPrincipal.getjDesktopPane1().add(jInternalFrame);
    }

    public void error() {
        pantallaPrincipal.setVisible(true);
    }
}
