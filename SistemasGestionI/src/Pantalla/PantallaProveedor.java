/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GUI_Proveedor.java
 *
 * Created on 25-ago-2011, 18:17:30
 */

package Pantalla;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duende
 */
public class PantallaProveedor extends javax.swing.JInternalFrame {

    /** Creates new form GUI_Proveedor */
    public PantallaProveedor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabProveedores = new javax.swing.JTable();
        Listar = new javax.swing.JButton();
        textEliminar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Proveedores"));
        jPanel1.setAutoscrolls(true);

        jLabel1.setText("Proveedor");

        Buscar.setText("Buscar");
        Buscar.setName("Buscar"); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.setName("AddProv"); // NOI18N

        Modificar.setText("Modificar");
        Modificar.setName("UpdateProv"); // NOI18N

        Eliminar.setText("Eliminar");
        Eliminar.setName("DeleteProv"); // NOI18N

        TabProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo_Proveedor", "Nombre Fantasía", "Dirección", "Telefóno", "Email", "CUIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabProveedores.setName("TablaProveedores"); // NOI18N
        jScrollPane1.setViewportView(TabProveedores);

        Listar.setText("Listar");
        Listar.setName("Buscar"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(Modificar)
                        .addGap(266, 266, 266)
                        .addComponent(textEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(Eliminar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)
                    .addComponent(Listar))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(textEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Buscar.getAccessibleContext().setAccessibleDescription("Busca o selecciona proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTable TabProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textEliminar;
    // End of variables declaration//GEN-END:variables

    public JButton getAgregar() {
        return Agregar;
    }

    public void setAgregar(JButton Agregar) {
        this.Agregar = Agregar;
    }

    public JButton getBuscar() {
        return Buscar;
    }

    public void setBuscar(JButton Buscar) {
        this.Buscar = Buscar;
    }

    public JButton getEliminar() {
        return Eliminar;
    }

    public void setEliminar(JButton Eliminar) {
        this.Eliminar = Eliminar;
    }

    public JButton getListar() {
        return Listar;
    }

    public void setListar(JButton Listar) {
        this.Listar = Listar;
    }

    public JButton getModificar() {
        return Modificar;
    }

    public void setModificar(JButton Modificar) {
        this.Modificar = Modificar;
    }

    public String getTextBuscar() {
        return textBuscar.getText();//le pido el valor no el objeto
    }

    public void setTextBuscar(JTextField textBuscar) {
        this.textBuscar = textBuscar;
    }

    public String getTextEliminar() {
        return textEliminar.getText();
    }

    public void setTextEliminar(JTextField textEliminar) {
        this.textEliminar = textEliminar;
    }

    public JTable getTabProveedores() {
        return TabProveedores;
    }

    public void setTabProveedores(DefaultTableModel TabProveedores) {
        this.TabProveedores.setModel(TabProveedores);                
    }
    
    

}