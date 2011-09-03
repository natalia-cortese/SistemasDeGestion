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
 * @author Matias
 */
public class ClienteImpl implements Cliente {

    private String Nombre;
    private String Apellido;
    private String dni;
    private String CUIT;
    private String Direccion;
    private String Telefono_Fijo;
    private String Celular;
    private String email;
    private boolean baja;
    private List<Proveedor> proveedores;

    public ClienteImpl() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        this.dni =dni;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono_Fijo() {
        return Telefono_Fijo;
    }

    public void setTelefono_Fijo(String Telefono_Fijo) {
        this.Telefono_Fijo = Telefono_Fijo;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public boolean getbaja() {
        return baja;
    }

    public void setbaja(boolean baja) {
        this.baja = baja;
    }

    public List<Proveedor> getProveedors() {
        return proveedores;
    }

    public void setProveedors(List<Proveedor> proveedor) {
        if (proveedores == null) {
            proveedores = new ArrayList<Proveedor>();
        }
        proveedores.addAll(proveedor);
    }

    public void setProveedor(Proveedor proveedor) {
        if (proveedores == null) {
            proveedores = new ArrayList<Proveedor>();
        }
        proveedores.add(proveedor);
    }
}
