package Persistencia;

import java.util.HashMap;
import java.util.Map;
import Agentes.AgenteProducto;
import Implementaciones.ProductoImpl;

public class FabricaIntermediario {

    private static FabricaIntermediario instancia = null;
    private static Map<Class, IntermediarioPersistencia> mapaIntermediario = null;

    private static enum Intermediarios {

        Proveedor, AgenteProveedor, ProveedorImpl,
        Cliente, ClienteImpl, AgenteCliente,
        Producto, AgenteProducto, ProductoImpl
      
    }

    public FabricaIntermediario() {
        mapaIntermediario = new HashMap<Class, IntermediarioPersistencia>();
    }

    public static FabricaIntermediario getInstancia() {
        if (instancia == null) {
            instancia = new FabricaIntermediario();
        }
        return instancia;
    }

    public IntermediarioPersistencia fabricarIntermediario(Class c) {
        IntermediarioPersistencia obj = null;
        if (mapaIntermediario.containsKey(c)) {
            return mapaIntermediario.get(c);
        }

        switch (Intermediarios.valueOf(c.getSimpleName())) {
            case Proveedor:
            case AgenteProveedor:
            case ProveedorImpl:
                obj = new IntermediarioProveedor();
                break;
            case Cliente:
            case AgenteCliente:
            case ClienteImpl:
                obj = new IntermediarioCliente();
                break;
 case Producto:
            case AgenteProducto:
            case ProductoImpl:
                obj = new IntermediarioProducto();
                break;

            default:
                return null;

        }
        mapaIntermediario.put(c, obj);

        return obj;
    }
}
