/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

/**
 *
 * @author diego
 */
public class Cache {
    private static Cache instancia;
    public static Cache getInstancia(){
        if(instancia==null)
            instancia= new Cache();
        return instancia;
    }
    public Object agregar(int oid, Object objeto){
        return objeto;
    }
    /*public Object buscar(int oid){
        //Hacer algo para que devuelva el Objeto
        return objecto;
    }*/
    public void eliminar(int oid){

    }

}
