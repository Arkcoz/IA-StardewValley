/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte.cases;

import metier.carte.Coordonnee;
import metier.carte.objets.FabriqueObjet;

/**
 *
 * @author lm178867
 */
public class FabriqueCase {
    public static Case creer(Coordonnee coordonnee, Character lettre){

        Case res;
        switch(lettre){
            case 'H' : 
                res = new CaseHerbe(coordonnee);
            break;
            
            case 'T' : 
                res = new CaseTerre(coordonnee);
            break;
            
            case 'E' : 
                res = new CaseEau(coordonnee);
            break;
            
            default : res = null;
        }
        if (res!= null)
            res.setObjet(FabriqueObjet.creer(res, lettre));
        return res;
    }

}
