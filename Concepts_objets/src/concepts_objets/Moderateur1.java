/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concepts_objets;

/**
 *
 * @author carmelina.napolitano
 */
public class Moderateur1 extends Utilisateurs {
    // Attributs
    
    // Constructeurs
    public Moderateur1( String nom, String prenom, String anneeDeNaissance ) throws anneeDeNaissanceException {
       
            super(nom, prenom, anneeDeNaissance);
    }
    public Moderateur1( String nom, String prenom) {
       
            super(nom, prenom);
    }
    
    // Méthodes
    public void ModifyMessage(Utilisateurs util) {
       System.out.println("Supprimer un message d'utilisateur");
       /* Exactement pareil que la ligne en dessous 
       ArrayList<Messages> Message_De_Util = util.getListeMessages(); 
       int nbreMessages = Message_De_Util.size();
       int index_LastMessage = nbreMessages - 1; */
       int index_LastMessage = util.getListeMessages().size() - 1;
       util.getListeMessages().remove(index_LastMessage);
    }
    
}

     