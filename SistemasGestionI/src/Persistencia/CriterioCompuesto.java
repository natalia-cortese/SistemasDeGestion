/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class CriterioCompuesto extends Criterio {

    public final String AND = "AND";
    public final String OR = "OR";
    public final String XOR = "XOR";
    ArrayList<Criterio> criterio = null;
    ArrayList<String> operadores = null;

    public CriterioCompuesto() {
        criterio = new ArrayList<Criterio>();
        operadores = new ArrayList<String>();
    }

    public CriterioCompuesto(Criterio criterio1, String operador, Criterio criterio2) {
        criterio = new ArrayList<Criterio>();
        operadores = new ArrayList<String>();
        criterio.add(criterio1);
        operadores.add(operador);
        criterio.add(criterio2);
    }

    @Override
    public String toString() {
        String sql = "";
        for (int i = 0; i < criterio.size() - 1; i++) {
            sql += criterio.get(i).toString()+ " ";
            sql += operadores.get(i)+ " ";


        }
        sql += criterio.get(criterio.size() - 1).toString();
        return sql;
    }

    public void addCriterio(String atributo, String operador, String valor, String lasoProxima) {
        if (criterio == null) {
            criterio = new ArrayList<Criterio>();
        }
        Criterio temp = new Criterio();
        temp.setAtributo(atributo);
        temp.setOperador(operador);
        temp.setValor(valor);
        criterio.add(temp);
        operadores.add(lasoProxima);
    }
}
