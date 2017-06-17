/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.funciones;

import ec.org.uniandes.octavo.accesodatos.AccesoDatos;
import ec.org.uniandes.octavo.accesodatos.ConjuntoResultado;
import ec.org.uniandes.octavo.accesodatos.Parametro;
import ec.org.uniandes.octavo.entidades.clsDetalleFacturaPro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INTEL
 */
public class crudDetalleFacturaProd {
    
    public static boolean save(clsDetalleFacturaPro defa){
        
        boolean resultado =false;
        
        String sql = "INSERT INTO public.defa(id,nofactura,idproducto,cantidad, subtotal) VALUES(?,?,?,?,?)";
        
        ArrayList<Parametro> lstPar = new ArrayList<>();
         lstPar.add(new Parametro(1,defa.getId()));
        lstPar.add(new Parametro(2, defa.getFactura().getNo()));
        lstPar.add(new Parametro(3, defa.getProducto().getId()));
          lstPar.add(new Parametro (4, defa.getCantidad()));
          lstPar.add(new Parametro (5, defa.getSubtotal()));
          
             
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        return resultado;
        
        
    } 
    
     public boolean Eliminar(clsDetalleFacturaPro defa) {
        boolean res = false;
        String sql = "DELETE FROM public.defa " + "WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, defa.getId()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
     
      public boolean Actualizar(clsDetalleFacturaPro defa) {
        boolean res = false;
        //clsCliente micliente=(clsCliente)(cliente);
        String sql = "UPDATE public.defa "
                + "SET id=?,nofactura=?,idproducto=?,cantidad=?,subtotal=?" + " WHERE " + "id=?";

        ArrayList<Parametro> lstPar = new ArrayList<>();
          lstPar.add(new Parametro(1,defa.getFactura().getNo()));
        lstPar.add(new Parametro(2,defa.getProducto().getId()));
        lstPar.add(new Parametro(3, defa.getCantidad()));
        lstPar.add(new Parametro(4, defa.getSubtotal()));
        lstPar.add(new Parametro(5, defa.getId()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
      
       public List<clsDetalleFacturaPro> findbyAll() {
        ArrayList<clsDetalleFacturaPro> listadefa = new ArrayList<>();
        String sql = "SELECT id,nofactura,idproducto,cantidad,subtotal " + "FROM public.defa";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsDetalleFacturaPro defa = null;
            while (cres.next()) 
            {
                defa = new clsDetalleFacturaPro();
                defa.setId(cres.getInt("id"));
                defa.getFactura().setNo(cres.getInt("nofactura"));
                defa.getProducto().setId(cres.getInt("idproducto"));
                defa.setCantidad(cres.getInt("cantidad"));
                defa.setSubtotal(cres.getdouble("subtotal"));
                listadefa.add((defa));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listadefa;
    }
       
       public clsDetalleFacturaPro findbyId(clsDetalleFacturaPro detfa) {
        clsDetalleFacturaPro defa = null;
        String sql = "SELECT id, cantidad, subtotal "+
                "FROM public.defa WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, detfa.getId()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                defa = new clsDetalleFacturaPro();
                defa.setId(cres.getInt("id"));
                defa.setSubtotal(cres.getdouble("subtotal"));
              
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return defa;
    }
       
        public static clsDetalleFacturaPro findbyId(int id) {
        clsDetalleFacturaPro defa = null;
        String sql = "SELECT id, nofactura, idproducto, cantidad, subtotal "+
                "FROM public.defa WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, id));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                defa = new clsDetalleFacturaPro();
                defa.setId(cres.getInt("id"));
                  defa.getFactura().setNo(cres.getInt("idfactura"));
                defa.getProducto().setId(cres.getInt("idproducto"));
                defa.setCantidad(cres.getInt("cantidad"));
                defa.setSubtotal(cres.getdouble("subtotal"));
              
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return defa;
    }
}
