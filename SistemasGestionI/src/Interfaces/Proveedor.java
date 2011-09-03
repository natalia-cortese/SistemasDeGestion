/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;

/**
 *
 * @author duende
 */
public interface Proveedor {

    public String getDireccion();

    public void setDireccion(String Direccion);

    public String getCUIT();

    public void setCUIT(String CUIT);

    public String getNombre();

    public void setNombre(String Nombre);

    public String getTelefono();

    public void setTelefono(String Telefono);

    public String getCodigo_proveedor();

    public void setCodigo_proveedor(String codigo_proveedor);

    public String getEmail();

    public void setEmail(String email);

    public boolean getbaja();

    public void setbaja(boolean baja);

    public List<Cliente> getClientes();

    public void setClientes(List<Cliente> cliente);

    public void setCliente(Cliente cliente);
}
