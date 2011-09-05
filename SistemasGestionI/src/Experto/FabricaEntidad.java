package Experto;

import Agentes.AgenteCliente;
import Agentes.AgenteProducto;
import Agentes.AgenteProveedor;
import Implementaciones.ClienteImpl;
import Implementaciones.ProductoImpl;
import Implementaciones.ProveedorImpl;
import Persistencia.ObjetoPersistente;

public class FabricaEntidad {

    private static FabricaEntidad instancia = null;

    private static enum Entidades {

        Cliente, Producto, Proveedor
    }

    public static FabricaEntidad getInstancia() {
        if (instancia == null) {
            instancia = new FabricaEntidad();
        }
        return instancia;
    }

    public Object FabricarEntidad(Class c) {
        ObjetoPersistente obj = null;


        switch (Entidades.valueOf(c.getSimpleName())) {
            case Cliente:
                obj = new AgenteCliente();
                ((AgenteCliente) obj).setImpl(new ClienteImpl());
                return obj;
            case Proveedor:
                obj = new AgenteProveedor();
                ((AgenteProveedor) obj).setImpl(new ProveedorImpl());
                return obj;
            case Producto:
                obj = new AgenteProducto();
                ((AgenteProducto) obj).setImpl(new ProductoImpl());
                return obj;
            default:
                return null;

        }

    }
}
