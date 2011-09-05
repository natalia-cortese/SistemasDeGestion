package Persistencia;

import java.util.Date;

public class Campo {

    private String nombre;
    private String valor;

    public Campo(String nomb, String val) {
        nombre = nomb;
        valor = val;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    private enum clases {

        Integer, Date, Time
    };

    public Object getValor(Class c) {
        try {
            switch (clases.valueOf(c.getSimpleName())) {
                case Integer:
                    if (valor == null) {
                        return 0;
                    }
                    return Integer.valueOf(valor);
                case Date:
                       if (valor == null) {
                           System.out.println("Devolvio una fecha NULL");
                    return new Date("1111-11-11");
                    }
                    return ConvertirFechas.stringAFecha(valor);
                case Time:
                    if (valor == null) {
                           System.out.println("Devolvio una Hora NULL");
                    return new Date("11:11");
                    }
                    return ConvertirFechas.stringAHora(valor);
                default:
                    return valor;
            }
        } catch (Exception exception) {
            return null;
        }
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
