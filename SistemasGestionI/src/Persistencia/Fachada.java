package Persistencia;

import java.util.ArrayList;

public class Fachada {

    private static Fachada instancia = null;

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public ArrayList buscar(Class clase, Criterio criterio) {
        return FachadaInterna.getInstancia().buscar(clase, criterio);
    }

    public ArrayList buscarAll(Class clase){
        return null;
    }
   public ArrayList buscar_todo(Class clase){
        return FachadaInterna.getInstancia().buscar_todos(clase);
    }
    public Criterio crearCriterio(String atributo, String operador, Object valor) {
        return FabricaCriterio.getInstancia().crearCriterio(atributo, operador, valor);
    }

    public Criterio crearCriterioCompuesto(Criterio criterio1, String operador, Criterio criterio2) {
        return FabricaCriterio.getInstancia().crearCriterioCompuesto(criterio1, operador, criterio2);
    }

    public boolean guardar(ObjetoPersistente objeto) {
        return FachadaInterna.getInstancia().guardar(objeto);
      }
}
