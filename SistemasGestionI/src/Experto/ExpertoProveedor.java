/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Experto;

import Interfaces.Proveedor;
import Persistencia.Criterio;
import Persistencia.Fachada;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class ExpertoProveedor implements Experto{
    private static ArrayList<Proveedor> VecProveedores = new ArrayList<Proveedor>();

    public static ArrayList<Proveedor> buscarProveedor(String busca) {
        ArrayList<Proveedor> resultado = new ArrayList<Proveedor>();
        int i = 0;
        Criterio c2 = Fachada.getInstancia().crearCriterio("Nombre","like %", busca);
        System.out.print(c2);//muestro que busco
        resultado = Fachada.getInstancia().buscar(Proveedor.class, c2);  
        while (!resultado.isEmpty()){
            VecProveedores.add(resultado.get(i));
            i++;
        }
        return VecProveedores;        
    }
    
    public static ArrayList<Proveedor> ListarProveedor() {
        ArrayList<Proveedor> resultado = new ArrayList<Proveedor>();
        int i = 0;        
        resultado = Fachada.getInstancia().buscar_todo(Proveedor.class);
        while (resultado.size()!= i){
            VecProveedores.add(resultado.get(i));
            i++;
        }
        return VecProveedores;        
    }

}
