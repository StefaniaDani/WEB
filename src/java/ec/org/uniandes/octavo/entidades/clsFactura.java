/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.entidades;

import java.util.Date;

/**
 *
 * @author INTEL
 */
public class clsFactura {
    private int _no;
    private clsCliente cliente;
    private Date _fecha;
     private double _subtotal;
     private double _iva;
    private double _total;

    public clsFactura() {
    }

    public clsFactura(int _no, clsCliente cliente, Date _fecha, double _subtotal, double _iva, double _total) {
        this._no = _no;
        this.cliente = cliente;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
    }
    
    
    public int getNo() {
        return _no;
    }

    public clsCliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return _fecha;
    }

    public double getSubtotal() {
        return _subtotal;
    }

    public double getIva() {
        return _iva;
    }

    public double getTotal() {
        return _total;
    }

    public void setNo(int _no) {
        this._no = _no;
    }

    public void setCliente(clsCliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public void setSubtotal(double _subtotal) {
        this._subtotal = _subtotal;
    }

    public void setIva(double _iva) {
        this._iva = _iva;
    }

    public void setTotal(double _total) {
        this._total = _total;
    }

    @Override
    public String toString() {
        return "clsFactura{" + "_no=" + _no + ", cliente=" + cliente + ", _fecha=" + _fecha + ", _subtotal=" + _subtotal + ", _iva=" + _iva + ", _total=" + _total + '}';
    }

   
  
    
}
