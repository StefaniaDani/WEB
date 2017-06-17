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
public class clsCliente {
    
    private int _id;
    private String _ruc;
    private String _nombre;
    private String _direccion;

    public clsCliente() {
    }

    public clsCliente(int _id, String _ruc, String _nombre, String _direccion) {
        this._id = _id;
        this._ruc = _ruc;
        this._nombre = _nombre;
        this._direccion = _direccion;
    }

    public int getId() {
        return _id;
    }

    public String getRuc() {
        return _ruc;
    }

    public String getNombre() {
        return _nombre;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setRuc(String _ruc) {
        this._ruc = _ruc;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    @Override
    public String toString() {
        return "clsClientes{" + "_id=" + _id + ", _ruc=" + _ruc + ", _nombre=" + _nombre + ", _direccion=" + _direccion + '}';
    }
    
    
}
