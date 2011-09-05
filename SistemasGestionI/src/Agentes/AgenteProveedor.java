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

    public AgenteProveedor() {
        impl = new ProveedorImpl();
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

    public int getCodigo_proveedor() {
        return impl.getCodigo_proveedor();
    }

    public void setCodigo_proveedor(int codigo_proveedor) {
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

    public String getoid(){
        return OIDProveedor;
    }

    public boolean getbaja() {
        return impl.getbaja();
    }

    public void setbaja(boolean baja) {
        impl.setbaja(baja);
    }
    
}
