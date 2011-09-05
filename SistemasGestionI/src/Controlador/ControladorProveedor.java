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
import Pantalla.GUI_AgregarProveedor;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duende
 */
public class ControladorProveedor {

    private final ControladorPrincipal controladorPrincipal;
    private final ExpertoProveedor expertoproveedor;
    private final PantallaProveedor pantalla;
    private GUI_AgregarProveedor PantallaAddProveedor;

    public ControladorProveedor(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
        pantalla = new PantallaProveedor();
        expertoproveedor = (ExpertoProveedor) FabricaExperto.getInstancia().FabricarExperto("ExpertoProveedor");

        //método lanzado al hacer click en 'Buscar'
        pantalla.getBuscar().addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            buscarProveedor(pantalla.getTextBuscar());
                        } catch (NoProveedorExcepcion ex) {
                            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        });
        
        //método lanzado al hacer click en 'Listar'
        pantalla.getListar().addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            ListarProveedores();
                        } catch (NoProveedorExcepcion ex) {
                            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    
        });
        
        //método lanzado al clickear en 'Agregar'
        
        pantalla.getAgregar().addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        try {
                            agregarProveedor();
                        } catch (NoProveedorExcepcion ex) {
                            Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
        });
        
        //método lanzado al clickear en 'Eliminar'
    }

public void agregarProveedor() throws NoProveedorExcepcion{
    PantallaAddProveedor = new GUI_AgregarProveedor();
    PantallaAddProveedor.setVisible(true);        
    controladorPrincipal.add(PantallaAddProveedor);      
    PantallaAddProveedor.toFront();        
    PantallaAddProveedor.getAgregar().addActionListener(
            new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                        nuevoProveedor();
                    } catch (NoProveedorExcepcion ex) {
                        Logger.getLogger(ControladorProveedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

    private void nuevoProveedor() throws NoProveedorExcepcion {
        DTOProveedor mula = new DTOProveedor();
        boolean ok;
        try{
            mula.setNombreProveedor(PantallaAddProveedor.getTxNombre().getText());
            mula.setCUIT(PantallaAddProveedor.getTxCUIT().getText());
            mula.setDireccion(PantallaAddProveedor.getTxDir().getText());
            mula.setTelefono(PantallaAddProveedor.getTxFono().getText());
            mula.setEmail(PantallaAddProveedor.getTxEmail().getText());
            ok=expertoproveedor.nuevoProveedor(mula);
            if(ok){                                        
                buscarProveedor(mula.getNombreProveedor());
            }
        } catch (NullPointerException e) {
            System.out.println("Excepcion controlador buscar proveedor método nuevoProveedor(): \n" + e.toString());
            throw new NoProveedorExcepcion();
        } 
    }

    });
}
    
    //busca un único proveedor por nombre
private void buscarProveedor(String busca) throws NoProveedorExcepcion {
    ArrayList<Proveedor> Proveedores = new ArrayList<Proveedor>();
    try {        
        Proveedores = expertoproveedor.buscarProveedor(busca);
        DibujarTabla(Proveedores);             
      } catch (NullPointerException e) {
        System.out.println("Excepcion controlador buscar proveedor método buscar proveedor: \n" + e.toString());
        throw new NoProveedorExcepcion();
   }  
}
   
// lista todos los proveedores en la base de datos
private void ListarProveedores() throws NoProveedorExcepcion {
    ArrayList<Proveedor> Proveedores = new ArrayList<Proveedor>();    
    try {
        Proveedores = expertoproveedor.ListarProveedor();
        DibujarTabla(Proveedores);
    } catch (NullPointerException e) {
        System.out.println("Excepcion controlador Listar proveedores: \n" + e.toString());
        throw new NoProveedorExcepcion();
    }

}

void AdministrarProveedor() {
    pantalla.setVisible(true);        
    controladorPrincipal.add(pantalla);
}

//este método agrega el resultado de la búsqueda a la tabla
private void DibujarTabla(ArrayList<Proveedor> Proveedores){
        DefaultTableModel resulset = new DefaultTableModel(); 
        int i=0;
        resulset.addColumn("Codigo_Proveedor");
        resulset.addColumn("Nombre");
        resulset.addColumn("Direccion");
        resulset.addColumn("Telefono");
        resulset.addColumn("CUIT");
        resulset.addColumn("email");
        while (Proveedores.size() != i) {
            Object[] ﬁla = new Object[6];
            ﬁla[0] = Proveedores.get(i).getCodigo_proveedor();
            ﬁla[1] = Proveedores.get(i).getNombre();
            ﬁla[2] = Proveedores.get(i).getDireccion();
            ﬁla[3] = Proveedores.get(i).getTelefono();
            ﬁla[4] = Proveedores.get(i).getCUIT();
            ﬁla[5] = Proveedores.get(i).getEmail();
            i++;
            resulset.addRow(ﬁla);
        }                            
        pantalla.setTabProveedores(resulset);
}

}
