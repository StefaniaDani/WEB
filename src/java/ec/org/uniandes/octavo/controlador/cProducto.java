/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.controlador;

import ec.org.uniandes.octavo.entidades.clsProducto;
import ec.org.uniandes.octavo.funciones.crudProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean

public class cProducto {
     private List <clsProducto> lista;
  private clsProducto newProducto;
 private clsProducto selectedProducto;

    public cProducto() {
        newProducto = new clsProducto();
        cargarDatos();
    }

    public cProducto(List<clsProducto> lista, clsProducto newProducto, clsProducto selectedProducto) {
        this.lista = lista;
        this.newProducto = newProducto;
        this.selectedProducto = selectedProducto;
    }

    public List <clsProducto> getLista() {
        return lista;
    }

    public void setLista(List <clsProducto> lista) {
        this.lista = lista;
    }

    public clsProducto getNewProducto() {
        return newProducto;
    }

    public void setNewProducto(clsProducto newProducto) {
        this.newProducto = newProducto;
    }

    public clsProducto getSelectedProducto() {
        return selectedProducto;
    }

    public void setSelectedProducto(clsProducto selectedProducto) {
        this.selectedProducto = selectedProducto;
    }

     private void insertar()
    {
        if (crudProducto.save(newProducto)){//esta linea guarda el cliente nuevo
            newProducto = new clsProducto(); //prepara el constructor para un nuevo cliente
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
     lista= crudProducto.findbyAll();
    }
 
 
 
 
}

