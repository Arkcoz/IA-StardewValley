/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte.cases;

import metier.carte.Coordonnee;

/**
 *
 * @author lm178867
 */
public class CaseEau extends Case {
    
    public CaseEau(Coordonnee coordonnee) {
        super(coordonnee);
    }
    
    @Override
    public TypeCase getType(){
        TypeCase res = TypeCase.valueOf("Eau");
        return res;
    }
}
