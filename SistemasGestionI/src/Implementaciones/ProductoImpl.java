/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Implementaciones;

import Interfaces.Producto;

/**
 *
 * @author malayo
 */
public class ProductoImpl implements Producto {
    
    private int OIDProdcuto;
    private int CodigoProducto;
    private String NombreProducto;
    private String DescripcionProducto;
    private boolean baja;

    public int getOIDProducto() {
        return OIDProdcuto;
    }

    public void setOIDProducto(int OIDProducto) {
        this.OIDProdcuto = OIDProducto;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto=CodigoProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String DescripcionProdcuto) {
        this.DescripcionProducto=DescripcionProdcuto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto=NombreProducto;
    }

    public boolean getbaja() {
     return baja;
    }

    public void setbaja(boolean baja) {
        this.baja = baja;
    }







}
