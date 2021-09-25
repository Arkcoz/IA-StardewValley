/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.carte;

import java.util.HashMap;
import metier.carte.cases.Case;
import metier.carte.cases.FabriqueCase;
import static metier.carte.cases.TypeCase.HERBE;
import static metier.carte.cases.TypeCase.TERRE;
import static metier.carte.objets.TypeObjet.ARBRE;
import static metier.carte.objets.TypeObjet.DEPART;
import static metier.carte.objets.TypeObjet.ESCALIER;
import static metier.carte.objets.TypeObjet.MAISON;

/**
 *
 * @author lm178867
 */
public class Carte {
    private int taille;
    HashMap <Coordonnee,Case> cases;
    
    public Carte(String messageRecu){
        this.cases = new HashMap<>();
        this.taille = (int) Math.sqrt(messageRecu.length());
        for(int i=0;i<this.taille;i++){
            for(int j=0; j < this.taille; j++) {
                this.ajouterCase(new Coordonnee(i,j),messageRecu.charAt(j+this.taille*i));
            }
        }        
    }
    
    private void ajouterCase(Coordonnee coordonnee, Character lettre){
        Case caseAjouter = FabriqueCase.creer(coordonnee,lettre);
        cases.put(coordonnee,caseAjouter);
    }
    
    public HashMap<Coordonnee, Case> getCases() {
        return cases;
    }

    public void setCases(HashMap<Coordonnee, Case> cases) {
        this.cases = cases;
    }


    public int getTaille() {
        return taille;
    }
    
    public void afficheConsole(){
        for (int i=0; i <this.taille;i++){
            for (int j=0; j<this.taille;j++){
                String affichage = "E";
                Case caseEnCours = this.cases.get(new Coordonnee(i,j));
                if(caseEnCours.getType()== HERBE ){
                    if(caseEnCours.getObjet()== null){
                        affichage = "H";
                    }
                    else{
                        switch (caseEnCours.getObjet().getType()){
                            case ARBRE : affichage = "A"; break;
                            case MAISON : affichage = "M"; break;
                            case ESCALIER : affichage = "S"; break;
                            case DEPART : affichage = "D"; break;
                        }
                    }
                }
                else if(caseEnCours.getType() == TERRE){
                    affichage = "T";
                }
                System.out.println(affichage);
            }
            
            System.out.println("");
        }
    }   
}
