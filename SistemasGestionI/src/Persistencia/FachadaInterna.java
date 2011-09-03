package Persistencia;

import java.util.ArrayList;

public class FachadaInterna {

    private static FachadaInterna instancia = null;

    public static FachadaInterna getInstancia() {
        if (instancia == null) {
            instancia = new FachadaInterna();
        }
        return instancia;
    }

    public void iniciatTX() {
        AdministradorTx.getInstance().iniciarTX();
    }

    public void finalizarTX() {
        AdministradorTx.getInstance().finalizarTx();
    }

    public ArrayList buscar(Class clase, Criterio criterio) {
        return FabricaIntermediario.getInstancia().fabricarIntermediario(clase).buscar(criterio);
    }

    public Object buscarOID(Class clase, String oid) {
        return FabricaIntermediario.getInstancia().fabricarIntermediario(clase).buscar(oid);
    }

    public Criterio crearCriterio(String atributo, String operador, Object valor) {
        return FabricaCriterio.getInstancia().crearCriterio(atributo, operador, valor);
    }

    public Criterio crearCriterioCompuesto(Criterio criterio1, String operador, Criterio criterio2) {
        return FabricaCriterio.getInstancia().crearCriterioCompuesto(criterio1, operador, criterio2);
    }

    public boolean  guardar(ObjetoPersistente objeto) {
        try{
        return FabricaIntermediario.getInstancia().fabricarIntermediario(objeto.getClass()).guardar(objeto);
        }catch(Exception ex){
            AdministradorTx.getInstance().Rollback();
            return false;
        }
    }

  public ArrayList buscar_todos(Class clase) {
        return FabricaIntermediario.getInstancia().fabricarIntermediario(clase).buscarTodo();
    }
}
