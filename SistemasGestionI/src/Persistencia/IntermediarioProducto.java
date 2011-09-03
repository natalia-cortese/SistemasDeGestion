package Persistencia;

import Agentes.AgenteProducto;
import Interfaces.Producto;
import java.util.ArrayList;
import java.util.List;

public class IntermediarioProducto extends IntermediarioRelacional {

    public IntermediarioProducto() {
    tabla = "Producto";
    oid = "OIDProducto";
    }


    @Override
    public Registro convertirObjetoRegistro(ObjetoPersistente objeto) {
        Registro rs = new Registro();
        AgenteProducto producto = (AgenteProducto) objeto;
        rs.addCampo(new Campo("OIDProducto", "'"+ producto.getoid() + "'"));
        rs.addCampo(new Campo("CodigoProducto", String.valueOf(producto.getCodigoProducto())));
        rs.addCampo(new Campo("NombreProducto", producto.getNombreProducto()));
        rs.addCampo(new Campo("DescripcionProducto", producto.getDescripcionProducto()));
        rs.addCampo(new Campo("baja", "'" + String.valueOf(producto.getbaja() + "'")));
//////Falta lo del OIDRelacionado
        return rs;

    }

    @Override
    public ArrayList convertirRegistroObjeto(List<Registro> rs) {
        ArrayList<Producto> producto = new ArrayList<Producto>();
        Agentes.AgenteProducto temp = null;
        try {
            for (Registro registro : rs) {
                temp = new Agentes.AgenteProducto();
                temp.setImpl(new Implementaciones.ProductoImpl());
                temp.setoid(registro.getCampo("OIDProducto").getValor());
                temp.setCodigoProducto((Integer)registro.getCampo("CodigoProducto").getValor(Integer.class));
                temp.setNombreProducto(registro.getCampo("NombreProducto").getValor());
                temp.setDescripcionProducto(registro.getCampo("DescripcionProducto").getValor());
                       temp.setbaja(Boolean.parseBoolean(registro.getCampo("baja").getValor()));
/////////falta lo del oid relaiconado
                producto.add(temp);
            }
        } catch (Exception ex) {
            System.out.println("Exploto el IntermediarioProducto");
        }

        return producto;

    }

}
