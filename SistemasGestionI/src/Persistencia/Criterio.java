package Persistencia;

import java.util.Date;

public class Criterio {

    private String atributo;
    private String operador;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Object getValor() {
        return valor;
    }

    public final void setValor(Object valor) {
        if (valor instanceof String || valor instanceof Date) {
            valor = "UCASE('" + valor + "')";
            atributo = "UCASE(" + atributo + ")";

        } else if (valor instanceof ObjetoPersistente) {
            atributo = "OID" + valor.getClass().getSimpleName().replaceAll("Agente", "");
            setValor(((ObjetoPersistente)valor).getoid());
            return;
        }
        this.valor = valor;
    }
    private Object valor;

    public Criterio(String atributo, String operador, Object valor) {
        this.atributo = atributo;
        this.operador = operador;
        setValor(valor);
    }

    public Criterio() {
        atributo = "1";
        operador = "=";
        valor = "1";
    }

    @Override
    public String toString() {
        return atributo + " " + operador + " " + valor;
    }
}
