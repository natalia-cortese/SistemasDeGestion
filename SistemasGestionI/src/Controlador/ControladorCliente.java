/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Excepciones.NoClienteExcepcion;
import Experto.ExpertoCliente;
import Experto.FabricaExperto;
import Pantalla.PantallaClientes;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class ControladorCliente {

    private ControladorPrincipal controladorPrincipal;
    private ExpertoCliente expertocliente;
    private PantallaClientes pantallaClientes;

    public ControladorCliente(ControladorPrincipal controladorPrincipal) throws PropertyVetoException {
        this.controladorPrincipal = controladorPrincipal;
        expertocliente = (ExpertoCliente) FabricaExperto.getInstancia().FabricarExperto("ExpertoCliente");
        pantallaClientes = new PantallaClientes();
        pantallaClientes.columnasize();
        pantallaClientes.getjButton1().addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    buscarCliente("Diego");
                } catch (NoClienteExcepcion ex) {
                    Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private ArrayList<DTOCliente> buscarCliente(String nombre) throws NoClienteExcepcion {
        ArrayList<DTOCliente> VectorClientes = new ArrayList<DTOCliente>();
            VectorClientes = expertocliente.buscarCliente(nombre);

        return VectorClientes;
  
    }

    public void agregarCliente() {

        pantallaClientes.setVisible(true);
        controladorPrincipal.add(pantallaClientes);
    }
}
