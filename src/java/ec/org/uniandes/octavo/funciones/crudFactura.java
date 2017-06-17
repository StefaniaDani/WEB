/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.funciones;

import ec.org.uniandes.octavo.accesodatos.AccesoDatos;
import ec.org.uniandes.octavo.accesodatos.ConjuntoResultado;
import ec.org.uniandes.octavo.accesodatos.Parametro;
import ec.org.uniandes.octavo.entidades.clsFactura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INTEL
 */
public class crudFactura {
    
     public static boolean save(clsFactura factura){
        
        boolean resultado =false;
        
        String sql = "INSERT INTO public.factura(fecha, subtotal, iva, total) VALUES(?,?,?,?)";
        
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, factura.getFecha()));
        lstPar.add(new Parametro(2, factura.getSubtotal()));
        lstPar.add(new Parametro(3, factura.getIva()));
        lstPar.add(new Parametro(4, factura.getTotal()));
      
        
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        return resultado;
     }
     
      public boolean Eliminar(clsFactura factura) {
        boolean res = false;
        String sql = "DELETE FROM public.factura " + "WHERE no=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, factura.getNo()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
      
      public boolean Actualizar(clsFactura factura) {
        boolean res = false;
        //clsCliente micliente=(clsCliente)(cliente);
        String sql = "UPDATE public.factura "
                + "SET fecha=?,subtotal=?,iva=?,total=?" + " WHERE " + "no=?";

        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, factura.getFecha()));
        lstPar.add(new Parametro(2, factura.getSubtotal()));
        lstPar.add(new Parametro(3, factura.getIva()));
        lstPar.add(new Parametro(4, factura.getTotal()));
        lstPar.add(new Parametro(8, factura.getNo()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
      
      public static List<clsFactura> findbyAll() {
        ArrayList<clsFactura> listaFacturas = new ArrayList<>();
        String sql = "SELECT no,fecha,subtotal,iva,total " + "FROM public.factura";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsFactura factura = null;
            while (cres.next()) 
            {
                factura = new clsFactura();
                factura.setNo(cres.getInt("no"));
                factura.setFecha(cres.getDate("fecha"));
                factura.setSubtotal(cres.getInt("subtotal"));
                factura.setIva(cres.getInt("iva"));
                factura.setTotal(cres.getInt("total"));
                listaFacturas.add((factura));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaFacturas;
    }
      
       public clsFactura findbyId(clsFactura fac) {
        clsFactura factura = null;
        String sql = "SELECT no, fecha, subtotal, iva, total "+
                "FROM public.factura WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, fac.getNo()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                factura = new clsFactura();
                factura.setNo(cres.getInt("no"));
                factura.setFecha(cres.getDate("fecha"));
                factura.setSubtotal(cres.getInt("subtotal"));
                factura.setIva(cres.getInt("iva"));
                factura.setTotal(cres.getInt("total"));
                           
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return factura;
    }
       
        public static clsFactura findbyId(int no) {
        clsFactura factura = null;
        String sql = "SELECT no, fecha, subtotal, iva, total "+
                "FROM public.factura WHERE no=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, no));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                factura = new clsFactura();
                factura.setNo(cres.getInt("no"));
                factura.setFecha(cres.getDate("fecha"));
                factura.setSubtotal(cres.getInt("subtotal"));
                factura.setIva(cres.getInt("iva"));
                factura.setTotal(cres.getInt("total"));
               
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return factura;
    }
}
