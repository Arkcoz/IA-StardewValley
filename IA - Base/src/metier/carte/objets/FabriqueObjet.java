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
public class FabriqueObjet {
    public static Objet creer(Case position, Character lettre){
        Objet res;
        switch(lettre){
            case 'A' : 
                res = new ObjetArbre(position);
            break;
            
            case 'M' : 
                res = new ObjetMaison(position);
            break;
            
            case 'E' : 
                res = new ObjetEscalier(position);
            break;    
            
            case 'D' : 
                res = new ObjetDepart(position);
            break;
            
            default : res = null;
        }
        return res;
    }

}
