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
public class Messages {
    // Je déclare mes attributs
    private String destinataire;
    private String titre;
    private String contenu;
    
    // Je déclare mes constructeurs
    public Messages(String destinataire, String titre, String contenu) {
        this.destinataire = destinataire;
        this.titre = titre;
        this.contenu = contenu;
    }
    
    
    // Je déclare mes méthodes
    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    
    
    
    
}
