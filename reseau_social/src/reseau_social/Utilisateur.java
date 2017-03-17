/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

/**
 * @version 1
 * @author carmelina.napolitano
 */
// Arguments
public class Utilisateur {
    
    private String nom;
    private String prenom;
    private int birthDate;
   
// Constructeurs  
    /**
     * Création d'un nouvel utilisateur sans paramètre
     * @author carmelina.napolitano
     */
public Utilisateur(){
        System.out.println("Nouvel utilisateur (sans param)");
        nom = "Ymorphisme";
        prenom = "Paul";
        birthDate = 44;
        
}
     /**
     * Création d'un nouvel utilisateur 
     * @author carmelina.napolitano
     */
public Utilisateur(String npltn, String mel) {
       
    System.out.println("Nouvel utilisateur avec 2 paramètres"); 
    nom = npltn;
    prenom = mel;
}
    
      /**
     * Création d'un nouvel utilisateur qui entre ses paramètres
     * @param nm
     *          Le nom du nouvel utilisateur
     * @param prnm
     *          Le prénom du nouvel utilisateur
     * @param brthDt
     *          L'année de naissance du nouvel utilisateur
     * @author carmelina.napolitano
     */
public Utilisateur(String nm, String prnm, int brthDt){
       System.out.println("Nouvel utilisateur avec 3 paramètres"); 
       nom = nm;
       prenom = prnm;
       birthDate = brthDt;
       
}
// Méthodes


    
// Getter et setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
