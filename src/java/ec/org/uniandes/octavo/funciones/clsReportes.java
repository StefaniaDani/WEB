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

/**
 *
 * @author INTEL
 */
public class clsReportes {
    
    //listado de todos los clienes con comoras mayores a mil
    //mostrar el numero,fecha,total,y el cliente factura y el nombre del ciente
    
   
     public static ArrayList<clsFactura> clienteFacturaMayorMil() {
        ArrayList<clsFactura> listado = new ArrayList<>();
        String sql = "SELECT "+
                "factura.fecha,"+ 
                "cliente.ruc," +
                "cliente.nombre,"+
                "factura.numerofac,"+
                " factura.total,"+
                "FROM "+
                "public.cliente, INNER JOIN"+
                "public.factura"+
                "ON"+
                "cliente.id = factura.id_cliente"+
                "ORDER BY"+
                "cliente.nombre DESC";

                         
            
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsFactura factura = null;
            while (cres.next())
            {
                factura = new clsFactura();
                factura.setNo(cres.getInt("id"));
                factura.setFecha(cres.getDate("fecha"));
                factura.setTotal(cres.getdouble("total"));
                //dfactura.setGenero(cres.getString("genero"));
               // dfactura.setIdpropietario(crudPropietario.findbyId(cres.getInt("idpropietario")));
                listado.add((factura));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
    

    
}
