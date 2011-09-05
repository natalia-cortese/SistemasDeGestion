package Persistencia;

import java.util.ArrayList;

public class Registro {
 private ArrayList<Campo> campo=null;

    public Registro(){
        campo = new ArrayList<Campo>();
    }

    public void addCampo(Campo campo){
        this.campo.add(campo);
    }

    public void addAllCampo(ArrayList<Campo> campo){
        this.campo.addAll(campo);
    }

    public ArrayList<Campo> getCampo(){
        return campo;
    }

    public Campo getCampo(String nombre){
        for(Campo c: campo)
            if(nombre.toUpperCase().equals(c.getNombre().toUpperCase()))
                return c;
        return null;
    }
}
