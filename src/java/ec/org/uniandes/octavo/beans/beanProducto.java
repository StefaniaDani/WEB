/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.beans;

import ec.org.uniandes.octavo.entidades.clsProducto;
import ec.org.uniandes.octavo.funciones.crudProducto;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named(value ="cFactura")
@ViewScoped

public class beanProducto {
    private clsProducto newProducto;
     private clsProducto selectedProducto;
     private List<clsProducto> lista;

    public beanProducto() {
         newProducto= new clsProducto();
     cargarDatos();
    }
    
    private void cargarDatos(){
     lista=crudProducto.findbyAll();
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

    public List<clsProducto> getLista() {
        return lista;
    }

    public void setLista(List<clsProducto> lista) {
        this.lista = lista;
    }
    
    
     
     
     
}
