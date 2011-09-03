package Persistencia;

import Agentes.AgenteCliente;
import Interfaces.Cliente;
import java.util.ArrayList;
import java.util.List;

public class IntermediarioCliente extends IntermediarioRelacional {

    public IntermediarioCliente() {
        tabla = "Cliente";
        oid = "OIDCliente";
    }
    @Override
        public String generarSQLOID(String oid) {
        return "SELECT * FROM " + tabla + " WHERE OIDCliente = " + oid;

    }
        private void busquedaoidquenoexisten(AgenteCliente cliente) {
        String consulta = "SELECT * FROM Cliente_Proveedor WHERE  OIDCliente =" + cliente.getoid();

        List<Registro> registros = ejecutarSQLB(consulta);
        for (Registro registro : registros) {
            cliente.addOIDProveedor(registro.getCampo("OIDProveedor").getValor());

        }
    }

    @Override
    public Registro convertirObjetoRegistro(ObjetoPersistente objeto) {
        Registro rs = new Registro();
        Agentes.AgenteCliente cliente = (AgenteCliente) objeto;
        rs.addCampo(new Campo(oid, "'" + cliente.getoid() + "'"));
        rs.addCampo(new Campo("Nombre", "'" + cliente.getNombre() + "'"));
        rs.addCampo(new Campo("Apellido", "'" + cliente.getApellido() + "'"));
        rs.addCampo(new Campo("dni", "'" + cliente.getdni() + "'"));
        rs.addCampo(new Campo("Direccion", "'" + cliente.getDireccion() + "'"));
        rs.addCampo(new Campo("Telefono_Fijo", cliente.getTelefono_Fijo()));
        rs.addCampo(new Campo("Celular", cliente.getCelular()));
        rs.addCampo(new Campo("email", "'" + cliente.getemail() + "'"));
        rs.addCampo(new Campo("baja", "'" + String.valueOf(cliente.getbaja() + "'")));
        return rs;
    }

    @Override
    public ArrayList convertirRegistroObjeto(List<Registro> rs) {
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        Agentes.AgenteCliente temp = null;
        try {
            for (Registro registro : rs) {
                temp = new Agentes.AgenteCliente();
                temp.setImpl(new Implementaciones.ClienteImpl());
                temp.setoid(registro.getCampo(oid).getValor());
                temp.setNombre(registro.getCampo("Nombre").getValor());
                temp.setApellido(registro.getCampo("Apellido").getValor());
                temp.setdni(registro.getCampo("dni").getValor());
                temp.setCUIT(registro.getCampo("CUIT").getValor());
                temp.setDireccion(registro.getCampo("Direccion").getValor());
                temp.setTelefono_Fijo(registro.getCampo("Telefono_Fijo").getValor());
                temp.setCelular(registro.getCampo("Celular").getValor());
                temp.setemail(registro.getCampo("email").getValor());
                temp.setbaja(Boolean.parseBoolean(registro.getCampo("baja").getValor()));
                cliente.add(temp);
            }
        } catch (Exception ex) {
            System.out.println("Exploto el IntermediarioCliente");
        }
        return cliente;
    }

    @Override
    public ArrayList materializar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
