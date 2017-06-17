/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.controlador;

import ec.org.uniandes.octavo.entidades.clsCliente;
import ec.org.uniandes.octavo.funciones.crudCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean

public class cCliente {
  private List <clsCliente> lista;
  private clsCliente newCliente;
 private clsCliente selectedCliente;

    public cCliente() {
        newCliente = new clsCliente();
        cargarDatos();
    }

    public cCliente(List<clsCliente> lista, clsCliente newCliente, clsCliente selectedCliente) {
        this.lista = lista;
        this.newCliente = newCliente;
        this.selectedCliente = selectedCliente;
    }

    public clsCliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(clsCliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public List <clsCliente> getLista() {
        return lista;
    }

    public void setLista(List <clsCliente> lista) {
        this.lista = lista;
    }

    public clsCliente getNewCliente() {
        return newCliente;
    }

    public void setNewCliente(clsCliente newCliente) {
        this.newCliente = newCliente;
    }

   private void insertar()
    {
        if (crudCliente.save(newCliente)){//esta linea guarda el cliente nuevo
            newCliente = new clsCliente(); //prepara el constructor para un nuevo cliente
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
     lista= crudCliente.findbyAll();
    }
 
}
