/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Experto;

import Excepciones.NoClienteExcepcion;
import Persistencia.FachadaInterna;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class DecoradorCliente extends ExpertoCliente{
    @Override
public ArrayList buscarCliente(String nombre) throws NoClienteExcepcion {
        FachadaInterna.getInstancia().iniciatTX();
        return super.buscarCliente(nombre);
        }
    @Override
    public boolean confirmar(){
        boolean confirmado = super.confirmar();
        FachadaInterna.getInstancia().finalizarTX();
        return confirmado;
        }
}
