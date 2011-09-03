package Persistencia;

import java.util.ArrayList;

public abstract class IntermediarioPersistencia {

    public Object buscar(String oid) {
        return materializar(oid);
    }

    public ArrayList buscar(Criterio criterio) {
        return materializar(criterio);
    }

    public boolean guardar(ObjetoPersistente objeto) {
        return desmaterializar(objeto);

    }

    public abstract ObjetoPersistente materializar(String oid);

    public abstract ArrayList materializar(Criterio criterio);

     public abstract ArrayList materializar();

    public abstract boolean desmaterializar(ObjetoPersistente objeto);

    public abstract String generarOID();

     public ArrayList  buscarTodo(){
        return materializar();
    }


}
