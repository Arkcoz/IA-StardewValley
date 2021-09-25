/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte;

import ia.base.metier.TypeMouvement;

/**
 *
 * @author lm178867
 */
public class Coordonnee {
    private int ligne;
    private int colonne;
    
    public Coordonnee(int ligne, int colonne){
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordonnee other = (Coordonnee) obj;
        if (this.ligne != other.ligne) {
            return false;
        }
        if (this.colonne != other.colonne) {
            return false;
        }
        return true;
    }
    
    public Coordonnee getVoisin(TypeMouvement mouvement){
        Coordonnee res = null;
        res.ligne = getLigne();
        res.colonne = getColonne();
        switch (mouvement){
            case BOTTOM : 
                res.colonne -= 1;
                break;
            
            case TOP :
                res.colonne += 1;
                break;
                
            case LEFT :
                res.ligne -= 1;
                break;
             
            case RIGHT :
                res.ligne += 1;
                break;                
        }
        return res;
    }
    
    public TypeMouvement getMouvementPourAller (Coordonnee destination){
        TypeMouvement res; 
        
        Coordonnee Act = null;
        Act.ligne = getLigne();
        Act.colonne = getColonne();
        
        if ((Act.ligne == destination.ligne)&&(Act.colonne == destination.colonne+ 1)){
            res= TypeMouvement.RIGHT;
        }
        else if ((Act.ligne == destination.ligne)&&(Act.colonne == destination.colonne - 1)){
            res= TypeMouvement.LEFT;
        }
        else if ((Act.ligne == destination.ligne + 1)&&(Act.colonne == destination.colonne)){
            res= TypeMouvement.TOP;
        }
        else if ((Act.ligne == destination.ligne - 1)&&(Act.colonne == destination.colonne)){
            res= TypeMouvement.BOTTOM;
        }
        else{
            res = null;
        }
        
        return res;
        
    }
}
