package concepts_objets;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carmelina.napolitano
 */
public class Utilisateurs {

    // Je déclare mes attributs
    private String nom; // Tous les utilisateurs ont un nom
    private String prenom; // Tous les utilisateurs ont un prenom
    private String anneeDeNaissance; // Tous les utilisateurs ont une année de naissance
    private ArrayList<Messages> listeMessages ;
    private ArrayList<Utilisateurs> listeAmi;
    
    // Je déclare mes constructeurs
    public Utilisateurs(String nom, String prenom, String anneeDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeDeNaissance = anneeDeNaissance;
        this.listeMessages = new ArrayList<>();
        this.listeAmi = new ArrayList<>();
    }

    public ArrayList<Utilisateurs> getListeAmi() {
        return listeAmi;
    }

    public void setListeAmi(ArrayList<Utilisateurs> listeAmi) {
        this.listeAmi = listeAmi;
    }
    
    
    // Je déclare mes méthodes
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Messages> getListeMessages() {
        return listeMessages;
    }

    public void setListeMessages(ArrayList<Messages> listeMessages) {
        this.listeMessages = listeMessages;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAnneeDeNaissance() {
        return anneeDeNaissance;
    }

    public void setAnneeDeNaissance(String anneeDeNaissance) {
        this.anneeDeNaissance = anneeDeNaissance;
    }
}
