/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Experto;

import Agentes.AgenteProveedor;
import Controlador.DTOProveedor;
import Interfaces.Proveedor;
import Persistencia.Criterio;
import Persistencia.Fachada;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author duende
 */
public class ExpertoProveedor implements Experto{
    private static ArrayList<Proveedor> VecProveedores = new ArrayList<Proveedor>();

    public static ArrayList<Proveedor> buscarProveedor(String busca) {
        ArrayList<Proveedor> resultado = new ArrayList<Proveedor>();
        int i = 0;
        Criterio c2 = Fachada.getInstancia().crearCriterio("Nombre","like",'%'+busca+'%');
        System.out.print(c2);//muestro que busco
        resultado = Fachada.getInstancia().buscar(Proveedor.class, c2);  
        while (resultado.size()!= i){
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

    public boolean nuevoProveedor(DTOProveedor proveedor) {
        AgenteProveedor nuevo = new AgenteProveedor();
        int codigo_proveedor =3;        
        //deberia buscar el ultimo y sumarle 1, aunque si es autonumerico en la base no corremos riesgo de colición
        nuevo.setCodigo_proveedor(codigo_proveedor);
        nuevo.setNombre(proveedor.getNombreProveedor());
        nuevo.setCUIT(proveedor.getCUIT());
        nuevo.setDireccion(proveedor.getDireccion());
        nuevo.setTelefono(proveedor.getTelefono());
        nuevo.setEmail(proveedor.getEmail());
        nuevo.setbaja(false);//nunca uno nuevo esta dado de baja?
        boolean guardar = Fachada.getInstancia().guardar(nuevo);
        return guardar;
    }

}
