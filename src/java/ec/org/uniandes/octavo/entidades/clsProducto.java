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
public class clsProducto {
    
    private int _id;
    private String _nombre;
    private int _stock;
    private double _precioVenta;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, int _stock, double _precioVenta) {
        this._id = _id;
        this._nombre = _nombre;
        this._stock = _stock;
        this._precioVenta = _precioVenta;
    }
    
    

    public int getId() {
        return _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public int getStock() {
        return _stock;
    }

    public double getPrecioVenta() {
        return _precioVenta;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setStock(int _stock) {
        this._stock = _stock;
    }

    public void setPrecioVenta(double _precioVenta) {
        this._precioVenta = _precioVenta;
    }

    @Override
    public String toString() {
        return "clsProducto{" + "_id=" + _id + ", _nombre=" + _nombre + ", _stock=" + _stock + ", _precioVenta=" + _precioVenta + '}';
    }
    
    
    
}
