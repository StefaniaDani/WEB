/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.controlador;

import ec.org.uniandes.octavo.entidades.clsFactura;
import ec.org.uniandes.octavo.funciones.crudFactura;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean

public class cFactura {
       private List <clsFactura> lista;
   private clsFactura newFactura;
  private clsFactura selectedFactura;

    public cFactura() {
        newFactura = new clsFactura();
        cargarDatos();
    }

    public cFactura(List<clsFactura> lista, clsFactura newFactura, clsFactura selectedFactura) {
        this.lista = lista;
        this.newFactura = newFactura;
        this.selectedFactura = selectedFactura;
    }

    public clsFactura getSelectedFactura() {
        return selectedFactura;
    }

    public void setSelectedFactura(clsFactura selectedFactura) {
        this.selectedFactura = selectedFactura;
    }

    public List <clsFactura> getLista() {
        return lista;
    }

    public void setLista(List <clsFactura> lista) {
        this.lista = lista;
    }

    public clsFactura getNewFactura() {
        return newFactura;
    }

    public void setNewFactura(clsFactura newFactura) {
        this.newFactura = newFactura;
    }
   private void insertar()
    {
        if (crudFactura.save(newFactura)){//esta linea guarda el cliente nuevo
            newFactura = new clsFactura(); //prepara el constructor para un nuevo cliente
                  cargarDatos();//refresca el datagriv con los cambios
           
        }
        else
        {
            //mostrarr mensaje de no guardado
    }
        
        
                
    }
   
//    private void eliminar();
//    
//    {
//        if (CrudCliente.delete(selectedCliente)) {
//            
//        }else{
//        
//        
//        }
//    }
    

    private void cargarDatos() {
     lista= crudFactura.findbyAll();
    }
 
  
}
