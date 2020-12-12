/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

/**
 *
 * @author ashle
 */
public class MontoIngredientes {
    String piña;
    String olores;
    String chile;
    String bordeRelleno;
    
    public MontoIngredientes(){
        
    }
    
    public MontoIngredientes(String piña, String olores, String chile, String bordeRelleno){
        this.bordeRelleno = bordeRelleno;
        this.chile = chile;
        this.olores = olores;
        this.piña = piña;
        
    }

    @Override
    public String toString() {
        return "MontoIngredientes{" + "pi\u00f1a=" + piña + ", olores=" + olores + ", chile=" + chile + ", bordeRelleno=" + bordeRelleno + '}';
    }

    public String getPiña() {
        return piña;
    }

    public String getOlores() {
        return olores;
    }

    public String getChile() {
        return chile;
    }

    public String getBordeRelleno() {
        return bordeRelleno;
    }
    
}
