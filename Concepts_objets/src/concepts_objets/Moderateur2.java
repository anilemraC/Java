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
public class Moderateur2 extends Moderateur1{
    
    // Constructeurs
    public Moderateur2(String nom, String prenom, String anneeDeNaissance) throws anneeDeNaissanceException {
        super(nom, prenom, anneeDeNaissance);
    }
    
    // Méthodes
    public void DeleteUtil(Utilisateurs util) {
       System.out.println("Supprimer un utilisateur");
       /* Exactement pareil que la ligne en dessous 
       ArrayList<Utilisateurs> = util.listeMessages(); 
       int nbreMessages = Message_De_Util.size();
       int index_LastMessage = nbreMessages - 1; */
       int index_LastMessage = util.getListeMessages().size() - 1;
       util.getListeMessages().remove(index_LastMessage);
    }
    public String toString(){
        return "Je suis un Modérateur2";
    }
}
