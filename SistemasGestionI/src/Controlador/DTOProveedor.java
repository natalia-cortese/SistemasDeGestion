/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author duende
 */
public class DTOProveedor {
    private String nombreProveedor;
    private String telefono;
    private String direccion;
    private String CUIT;
    private String Email;
    private double costoEmision;
    private int tiempoR;
    private int periodoActual;

    private String codProveedor;

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    public String getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }    

    public void setEmail(String text) {
        this.Email = text;
    }
    
    public String getEmail(){
        return this.Email;
    }

    public double getCostoEmision() {
        return costoEmision;
    }

    public void setCostoEmision(double costoEmision) {
        this.costoEmision = costoEmision;
    }
    
/*
    public int getTiempoR() {
        return tiempoR;
    }

    public void setTiempoR(int tiempoR) {
        this.tiempoR = tiempoR;
    }

    public int getPeriodoActual() {
        return periodoActual;
    }

    public void setPeriodoActual(int periodoActual) {
        this.periodoActual = periodoActual;
    }*/
}
