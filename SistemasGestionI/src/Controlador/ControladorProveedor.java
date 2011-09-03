/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Experto.ExpertoProveedor;
import Experto.FabricaExperto;
import Pantalla.PantallaProveedor;
import Excepciones.NoProveedorExcepcion;
import Interfaces.Proveedor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duende
 */
public class ControladorProveedor {

    private final ControladorPrincipal controladorPrincipal;
    private final ExpertoProveedor expertoproveedor;
    private final PantallaProveedor pantalla;

    public ControladorProveedor(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
        pantalla = new PantallaProveedor();
        expertoproveedor = (ExpertoProveedor) FabricaExperto.getInstancia().FabricarExperto("ExpertoProveedor");

        pantalla.getBuscar().addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            buscarProveedor(pantalla.getTextBuscar());

                        } catch (NoProveedorExcepcion ex) {
                            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    private ArrayList<Proveedor> buscarProveedor(String busca) throws NoProveedorExcepcion {
                        ArrayList<Proveedor> Proveedores = new ArrayList<Proveedor>();
                        DefaultTableModel resulset = new DefaultTableModel();
                        try {
                            int i = 0;
                            Proveedores = expertoproveedor.buscarProveedor(busca);
                            while (Proveedores.size() != 0) {
                                Object[] ﬁla = new Object[19];
                                ﬁla[0] = Proveedores.get(i);
                                resulset.addRow(ﬁla);
                                i++;
                            }
                            pantalla.setTabProveedores(resulset);
                        } catch (NullPointerException e) {
                            System.out.println("Excepcion controlador buscar proveedor: \n" + e.toString());
                            throw new NoProveedorExcepcion();
                        }
                        return Proveedores;
                    }
                });
        pantalla.getListar().addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            ListarProveedores();
                        } catch (NoProveedorExcepcion ex) {
                            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    private void ListarProveedores() throws NoProveedorExcepcion {
                        ArrayList<Proveedor> Proveedores = new ArrayList<Proveedor>();
                        DefaultTableModel resulset = new DefaultTableModel();
                        int i = 0;
                        try {
                            Proveedores = expertoproveedor.ListarProveedor();
                            System.out.print(Proveedores);
                            resulset.addColumn("Codigo_Proveedor");
                            resulset.addColumn("Nombre");
                            resulset.addColumn("Direccion");
                            resulset.addColumn("Telefono");
                            resulset.addColumn("CUIT");
                            resulset.addColumn("email");
                            while (Proveedores.size() != i) {
                                Object[] ﬁla = new Object[6];
                                ﬁla[i] = Proveedores.get(i).getCodigo_proveedor();
                                ﬁla[i] = Proveedores.get(i).getNombre();
                                ﬁla[i] = Proveedores.get(i).getDireccion();
                                ﬁla[i] = Proveedores.get(i).getTelefono();
                                ﬁla[i] = Proveedores.get(i).getCUIT();
                                ﬁla[i] = Proveedores.get(i).getEmail();
//                    ﬁla[i] = Proveedores.get(i).getCodigo_proveedor();
                                resulset.addRow(ﬁla);
                                i++;
                            }
                            pantalla.setTabProveedores(resulset);
                        } catch (NullPointerException e) {
                            System.out.println("Excepcion controlador Listar proveedores: \n" + e.toString());
                            throw new NoProveedorExcepcion();
                        }

                    }
                });
    }

    public void agregarProveedor() {

        pantalla.setVisible(true);
        controladorPrincipal.add(pantalla);
    }
}
