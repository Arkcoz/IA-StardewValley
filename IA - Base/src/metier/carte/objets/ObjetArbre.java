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
public class ObjetArbre extends Objet {
        
    public ObjetArbre(Case position) {
        super(position);
    }

    @Override
    public TypeObjet getType() {
        TypeObjet res =  TypeObjet.valueOf("ARBRE");
        return res;
    }
    
}
