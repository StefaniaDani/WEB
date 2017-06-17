/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.uniandes.octavo.beans;

import ec.org.uniandes.octavo.entidades.clsFactura;
import ec.org.uniandes.octavo.funciones.crudFactura;
import java.util.List;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named(value ="cFactura")
@ViewScoped

public class beanFactura {
      private clsFactura newFactura;
      private clsFactura selectedFactura;
      private List<clsFactura> lista;

    public beanFactura() {
        newFactura= new clsFactura();
     cargarDatos();
    }
    
     private void cargarDatos(){
     lista=crudFactura.findbyAll();
 }

    public clsFactura getNewFactura() {
        return newFactura;
    }

    public void setNewFactura(clsFactura newFactura) {
        this.newFactura = newFactura;
    }

    public clsFactura getSelectedFactura() {
        return selectedFactura;
    }

    public void setSelectedFactura(clsFactura selectedFactura) {
        this.selectedFactura = selectedFactura;
    }

    public List<clsFactura> getLista() {
        return lista;
    }

    public void setLista(List<clsFactura> lista) {
        this.lista = lista;
    }
      
}
