package ia.base.modules;

import ia.base.IA;
import metier.carte.Carte;

/**
 * Module en charge de la mémorisation et de la restitution des informations obtenues
 * @author Matthieu
 */
public class Module_Memoire extends Module  {
    
    private Carte carte;
    
    /**
     * Constructeur
     * @param ia l'IA dont ce module fait partie
     */
    public Module_Memoire(IA ia) {
        super(ia);
    }
    
    public void genererCarte(String messageRecu){
        carte = new Carte(messageRecu);
    }
    
    public boolean hasCarte(){
        boolean res = false;
        if (this.carte != null)
            res = true;
        return res;
    }
}
