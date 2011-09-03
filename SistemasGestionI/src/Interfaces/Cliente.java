/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;

/**
 *
 * @author diego
 */
public interface Cliente {

    public String getNombre();

    public void setNombre(String Nombre);

    public String getApellido();

    public void setApellido(String Apellido);

    public String getdni();

    public void setdni(String dni);

    public String getCUIT();

    public void setCUIT(String CUIT);

    public String getDireccion();

    public void setDireccion(String Direccion);

    public String getTelefono_Fijo();

    public void setTelefono_Fijo(String Telefono_Fijo);

    public String getCelular();

    public void setCelular(String Celular);

    public String getemail();

    public void setemail(String email);
    
    public List<Proveedor> getProveedors();

    public void setProveedors(List<Proveedor> proveedor);
    
    public void setProveedor(Proveedor proveedor);
    
    public boolean getbaja();
    
    public void setbaja(boolean baja);
}
