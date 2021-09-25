/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte.objets;

import metier.carte.cases.Case;

/**
 *
 * @author lm178867
 */
public abstract class Objet {
    private Case position;
    
    public Objet (Case position){
        this.position = position;
    }
    
    public abstract TypeObjet getType();
}
