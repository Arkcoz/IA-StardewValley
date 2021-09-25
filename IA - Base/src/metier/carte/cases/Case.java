/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte.cases;

import metier.carte.Coordonnee;
import metier.carte.objets.Objet;

/**
 *
 * @author lm178867
 */
public abstract class Case {
    private Coordonnee coordonnee;
    private Objet objet;
    
    public Case(Coordonnee coordonnee){
        this.coordonnee = coordonnee;
    }
    
    public abstract TypeCase getType();
    
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public Objet getObjet() {
        return objet;
    }

    public void setObjet(Objet objet) {
        this.objet = objet;
    }   
    
}
