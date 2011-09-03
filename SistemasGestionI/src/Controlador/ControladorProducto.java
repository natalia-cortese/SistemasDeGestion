/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Experto.ExpertoProducto;
import Experto.FabricaExperto;
import Pantalla.PantallaProducto;
import java.beans.PropertyVetoException;
//import Pantalla.PantallaCrearProducto;
//import Pantalla.PantallaModificarProducto;
//import Pantalla.PantallaEliminarProducto;

/**
 *
 * @author diego
 */
public class ControladorProducto {
  private final ControladorPrincipal controladorPrincipal;
   private final ExpertoProducto expertoProducto;
    private PantallaProducto pantallaProducto;
    //private PantallaCrearProducto pantallaCrearProducto;
   // private PantallaModificarProducto pantallaModificarProducto;
    //private PantallaEliminarProducto pantallaEliminarProducto;

    public ControladorProducto(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
        expertoProducto = (ExpertoProducto)FabricaExperto.getInstancia().FabricarExperto("ExpertoProducto");
        pantallaProducto = new PantallaProducto(this);
        pantallaProducto.setVisible(true);

    }
public void crearProducto(int codigoP, String nombreP, String DescripcionP){

    expertoProducto.crearProducto(codigoP, nombreP, DescripcionP);
}

    public void agregarProducto() {
         pantallaProducto.setVisible(true);
 controladorPrincipal.add(pantallaProducto);
    }

}


