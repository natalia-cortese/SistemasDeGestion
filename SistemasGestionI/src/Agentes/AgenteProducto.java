/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Agentes;

import Implementaciones.ProductoImpl;
import Interfaces.Producto;
import Persistencia.ObjetoPersistente;

/**
 *
 * @author malayo
 */
public class AgenteProducto implements Producto, ObjetoPersistente {

private ProductoImpl impl;
private String OIDProducto;

    public ProductoImpl getImpl() {
        return impl;
    }

    public void setImpl(ProductoImpl impl) {
        this.impl = impl;
    }


    public int getCodigoProducto() {
        return impl.getCodigoProducto();
    }

    public void setCodigoProducto(int CodigoProducto) {
        impl.setCodigoProducto(CodigoProducto);
    }

    public String getDescripcionProducto() {
        return impl.getDescripcionProducto();
    }

    public void setDescripcionProducto(String DescripcionProdcuto) {
       impl.setDescripcionProducto(DescripcionProdcuto);
    }

    public String getNombreProducto() {
       return impl.getNombreProducto();
    }

    public void setNombreProducto(String NombreProducto) {
        impl.setNombreProducto(NombreProducto);
    }

    public void setoid(String oid) {
        this.OIDProducto = oid;
    }

    public String getoid() {
       return OIDProducto;
    }

    public boolean getbaja() {
       return impl.getbaja();
    }

    public void setbaja(boolean baja) {
        this.setbaja(baja);
    }

}
