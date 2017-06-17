/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.entidades;

/**
 *
 * @author INTEL
 */
public class clsDetalleFacturaPro {
    
    private int _id;
    private clsFactura _factura;
    private clsProducto _producto;
    private double _cantidad;
    private double _subtotal;

    public clsDetalleFacturaPro() {
    }

    public clsDetalleFacturaPro(int _id, clsFactura _factura, clsProducto _producto, double _cantidad, double _subtotal) {
        this._id = _id;
        this._factura = _factura;
        this._producto = _producto;
        this._cantidad = _cantidad;
        this._subtotal = _subtotal;
    }

    public int getId() {
        return _id;
    }

    public clsFactura getFactura() {
        return _factura;
    }

    public clsProducto getProducto() {
        return _producto;
    }

    public double getCantidad() {
        return _cantidad;
    }

    public double getSubtotal() {
        return _subtotal;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setFactura(clsFactura _factura) {
        this._factura = _factura;
    }

    public void setProducto(clsProducto _producto) {
        this._producto = _producto;
    }

    public void setCantidad(double _cantidad) {
        this._cantidad = _cantidad;
    }

    public void setSubtotal(double _subtotal) {
        this._subtotal = _subtotal;
    }

    @Override
    public String toString() {
        return "clsDetalleFacturaPro{" + "_id=" + _id + ", _factura=" + _factura + ", _producto=" + _producto + ", _cantidad=" + _cantidad + ", _subtotal=" + _subtotal + '}';
    }
    
    
}
