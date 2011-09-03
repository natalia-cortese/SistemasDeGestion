/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementaciones;

import Interfaces.Cliente;
import Interfaces.Proveedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duende
 */
public class ProveedorImpl implements Proveedor {

    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String CUIT;
    private String codigo_proveedor;
    private String email;
    private boolean baja;
    private List<Cliente> clientes;

    public ProveedorImpl() {
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodigo_proveedor() {
        return codigo_proveedor;
    }

    public void setCodigo_proveedor(String codigo_proveedor) {
        this.codigo_proveedor = codigo_proveedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public boolean getbaja() {
        return baja;
    }

    public void setbaja(boolean baja) {
        this.baja = baja;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> cliente) {
        if (clientes == null) {
            clientes = new ArrayList<Cliente>();
        }
        clientes.addAll(cliente);
    }

    public void setCliente(Cliente cliente) {
        if (clientes == null) {
            clientes = new ArrayList<Cliente>();
        }
        clientes.add(cliente);
    }
}
