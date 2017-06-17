/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.testing;

import ec.org.uniandes.octavo.entidades.clsCliente;
import ec.org.uniandes.octavo.funciones.crudCliente;

/**
 *
 * @author INTEL
 */
public class test {
     public static void main(String[] args){
         
    clsCliente c =new clsCliente(4,"1667876545","Maria","Puyo"); 
    
       crudCliente ac = new crudCliente();

    
               if (ac.save(c)) {
            System.out.println("exito");
        }else{
            System.out.println("error");
        }
     }
}