/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Implementaciones.ProveedorImpl;
import Interfaces.Cliente;
import Interfaces.Proveedor;
import Persistencia.FachadaInterna;
import Persistencia.ObjetoPersistente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duende
 */
public class AgenteProveedor implements Proveedor, ObjetoPersistente {

    private ProveedorImpl impl;
    private String OIDProveedor;
    private List<String> clientesrelacionados;

    public List<String> getClientesrelacionados() {
        return clientesrelacionados;
    }

    public void setClientesrelacionados(List<String> clientesrelacionados) {
        this.clientesrelacionados = clientesrelacionados;
    }

    public AgenteProveedor() {
    }

    public ProveedorImpl getImpl() {
        return impl;
    }

    public void setImpl(ProveedorImpl impl) {
        this.impl = impl;
    }

    public String getCUIT() {
        return impl.getCUIT();
    }

    public void setCUIT(String CUIT) {
        impl.setCUIT(CUIT);
    }

    public String getNombre() {
        return impl.getNombre();
    }

    public void setNombre(String Nombre) {
        impl.setNombre(Nombre);
    }

    public String getTelefono() {
        return impl.getTelefono();
    }

    public void setTelefono(String Telefono) {
        impl.setTelefono(Telefono);
    }

    public String getCodigo_proveedor() {
        return impl.getCodigo_proveedor();
    }

    public void setCodigo_proveedor(String codigo_proveedor) {
        impl.setCodigo_proveedor(codigo_proveedor);
    }

    public String getEmail() {
        return impl.getEmail();
    }

    public void setEmail(String email) {
        impl.setEmail(email);
    }

    public String getDireccion() {
        return impl.getDireccion();
    }

    public void setDireccion(String Direccion) {
        impl.setDireccion(Direccion);
    }

    public void setoid(String oid) {
        this.OIDProveedor = oid;
    }

    public String getoid() {
        return OIDProveedor;
    }

    public boolean getbaja() {
        return impl.getbaja();
    }

    public void setbaja(boolean baja) {
        this.setbaja(baja);
    }

    public void addOIDCliente(String OIDCliente) {
        if (clientesrelacionados == null) {
            clientesrelacionados = new ArrayList<String>();
        }
        clientesrelacionados.add(OIDCliente);
    }

    public List<Cliente> getClientes() {
        if (impl.getClientes() == null) {
            for (String OIDCliente : clientesrelacionados) {
                setCliente((Cliente) FachadaInterna.getInstancia().buscarOID(Proveedor.class, OIDCliente));
            }
        }
        return impl.getClientes();
    }

    public void setClientes(List<Cliente> cliente) {
        impl.setClientes(cliente);
    }

    public void setCliente(Cliente cliente) {
        impl.setCliente(cliente);
    }
}
