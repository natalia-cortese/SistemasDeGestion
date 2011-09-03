/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Agentes;

import Implementaciones.ClienteImpl;
import Interfaces.Cliente;
import Interfaces.Proveedor;
import Persistencia.FachadaInterna;
import Persistencia.ObjetoPersistente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matias
 */
public class AgenteCliente implements Cliente, ObjetoPersistente {

    private ClienteImpl impl;
    private String OIDCliente;
    private List<String> proveedorrelacionados;

    public List<String> getProveedorrelacionados() {
        return proveedorrelacionados;
    }

    public void setProveedorrelacionados(List<String> proveedorrelacionados) {
        this.proveedorrelacionados = proveedorrelacionados;
    }

    public AgenteCliente() {
    }

    public void addOIDProveedor(String OIDProveedor) {
        if (proveedorrelacionados == null) {
            proveedorrelacionados = new ArrayList<String>();
        }
        proveedorrelacionados.add(OIDProveedor);
    }

    public ClienteImpl getImpl() {
        return impl;
    }

    public void setImpl(ClienteImpl impl) {
        this.impl = impl;
    }

    public String getNombre() {
        return impl.getNombre();
    }

    public void setNombre(String Nombre) {
        impl.setNombre(Nombre);
    }

    public String getApellido() {
        return impl.getApellido();
    }

    public void setApellido(String Apellido) {
        impl.setApellido(Apellido);
    }

    public String getdni() {
        return impl.getdni();
    }

    public void setdni(String dni) {
        impl.setdni(dni);
    }

    public String getCUIT() {
        return impl.getCUIT();
    }

    public void setCUIT(String CUIT) {
        impl.setCUIT(CUIT);
    }

    public String getDireccion() {
        return impl.getDireccion();
    }

    public void setDireccion(String Direccion) {
        impl.setDireccion(Direccion);
    }

    public String getTelefono_Fijo() {
        return impl.getDireccion();
    }

    public void setTelefono_Fijo(String Telefono_Fijo) {
        impl.setTelefono_Fijo(Telefono_Fijo);
    }

    public String getCelular() {
        return impl.getCelular();
    }

    public void setCelular(String Celular) {
        impl.setCelular(Celular);
    }

    public String getemail() {
        return impl.getemail();
    }

    public void setemail(String email) {
        impl.setemail(email);
    }

    public void setoid(String oid) {
        this.OIDCliente = oid;
    }

    public String getoid() {
        return OIDCliente;
    }

    public boolean getbaja() {
        return impl.getbaja();
    }

    public void setbaja(boolean baja) {
        impl.setbaja(baja);
    }

    public void setProveedors(List<Proveedor> proveedor) {
        impl.setProveedors(proveedor);

    }

    public void setProveedor(Proveedor proveedor) {
        impl.setProveedor(proveedor);
    }

    public List<Proveedor> getProveedors() {
        if(impl.getProveedors() == null) {
           for (String OIDProveedor : proveedorrelacionados) {
            setProveedor((Proveedor) FachadaInterna.getInstancia().buscarOID(Proveedor.class, OIDProveedor));
        }
       }
       return impl.getProveedors();
    }
     public String toString() {
        return "AgenteCliente [Oid = " + getoid() + " | Nombre = " + getNombre();
    }

}
