package Pantalla;

import Controlador.ControladorPrincipal;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;

public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal(ControladorPrincipal controladorPrincipal) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de Gestion 1");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jDesktopPane1, gridBagConstraints);

        jMenu1.setText("Sistema");

        MenuCliente.setText("Cliente");
        jMenu1.add(MenuCliente);

        MenuProducto.setText("Producto");
        jMenu1.add(MenuProducto);

        MenuProveedor.setText("Proveedor");
        jMenu1.add(MenuProveedor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Acerca de..");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuProducto;
    private javax.swing.JMenuItem MenuProveedor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getItemCliente() {
        return MenuCliente;
    }

    public void setMenuCliente(JMenuItem MenuCliente) {
        this.MenuCliente = MenuCliente;
    }

    public JMenuItem getItemProducto() {
        return MenuProducto;
    }
    public void setMenuProducto(JMenuItem MenuProducto) {
        this.MenuProducto = MenuProducto;
    }

        public JMenuItem getItemProveedor() {
        return MenuProveedor;
    }

    public void setMenuProveedor(JMenuItem MenuProveedor) {
        this.MenuProveedor = MenuProveedor;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }
}
