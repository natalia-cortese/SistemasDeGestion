/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia;

/**
 *
 * @author diego
 */
public class FabricaCriterio {
    private static FabricaCriterio instancia;
    public static FabricaCriterio getInstancia(){
        if(instancia==null)
            instancia = new FabricaCriterio();
        return instancia;
    }
    public Criterio crearCriterio(String atributo, String operador, Object valor){
        return new Criterio(atributo, operador, valor);
    }
    public Criterio crearCriterioCompuesto(Criterio criterio1, String operador, Criterio criterio2){
        //hacer algo
        return new CriterioCompuesto(criterio1, operador, criterio2);
    }

    public Criterio crearCriterio(){
        return new Criterio();
    }
}
