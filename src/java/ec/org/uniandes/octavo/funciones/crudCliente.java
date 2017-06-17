/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.funciones;

import ec.org.uniandes.octavo.accesodatos.AccesoDatos;
import ec.org.uniandes.octavo.accesodatos.ConjuntoResultado;
import ec.org.uniandes.octavo.accesodatos.Parametro;
import ec.org.uniandes.octavo.entidades.clsCliente;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author INTEL
 */
public class crudCliente {
       public static boolean save(clsCliente cliente){
        
        boolean resultado =false;
        
        String sql = "INSERT INTO public.cliente(ruc, nombre, direccion) VALUES(?,?,?)";
        
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getRuc()));
        lstPar.add(new Parametro(2, cliente.getNombre()));
        lstPar.add(new Parametro(3, cliente.getDireccion()));
        
             
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
            
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
        return resultado;
        
        
    } 
       
        public boolean Eliminar(clsCliente cliente) {
        boolean res = false;
        String sql = "DELETE FROM public.cliente " + "WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getId()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
        
        public boolean Actualizar(clsCliente cliente) {
        boolean res = false;
        
        String sql = "UPDATE public.cliente "
                + "SET ruc=?,nombre=?,direccion=?" + " WHERE " + "id=?";

        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getRuc()));
        lstPar.add(new Parametro(2, cliente.getNombre()));
        lstPar.add(new Parametro(3, cliente.getDireccion()));
        lstPar.add(new Parametro(4, cliente.getId()));

        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
        
         public static List<clsCliente> findbyAll() {
        ArrayList<clsCliente> listaClientes = new ArrayList<>();
        String sql = "SELECT id,ruc,nombre,direccion FROM public.cliente";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsCliente cliente = null;
            while (cres.next()) 
            {
                cliente = new clsCliente();
                cliente.setId(cres.getInt("id"));
                cliente.setRuc(cres.getString("ruc"));
                cliente.setNombre(cres.getString("nombre"));
                cliente.setDireccion(cres.getString("direccion"));
               
                listaClientes.add((cliente));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaClientes;
    }

         public static clsCliente findbyId(clsCliente cli) {
        clsCliente cliente = null;
        String sql = "SELECT id, ruc, nombre, direccion "+
                "FROM public.cliente WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getId()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                cliente = new clsCliente();
                cliente.setId(cres.getInt("id"));
                  cliente.setRuc(cres.getString("ruc"));
                cliente.setNombre(cres.getString("nombre"));
                cliente.setDireccion(cres.getString("direccion"));
               
              
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cliente;
    }
         
          public static clsCliente findbyId(int id) {
        clsCliente cliente = null;
        String sql = "SELECT id,ruc, nombres, direccion "+
                "FROM public.cliente WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, id));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                cliente = new clsCliente();
                cliente.setId(cres.getInt("id"));
                cliente.setRuc(cres.getString("ruc"));
                cliente.setNombre(cres.getString("nombre"));
                cliente.setDireccion(cres.getString("direccion"));
           
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cliente;
    }
}
