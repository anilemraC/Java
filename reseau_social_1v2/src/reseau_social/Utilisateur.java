/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

/**
 *
 * @author carmelina.napolitano
 */
public class Utilisateur {
    
    private String nom;
    private String prenom;
    private String birthDate;
   
  
public Utilisateur(){
        System.out.println("Nouvel utilisateur (sans param)");
        nom = "Enta";
        prenom = "Paul";
        birthDate = "44";
        
}

public Utilisateur(String npltn, String mel) {
       
    System.out.println("Nouvel utilisateur avec 2 paramètres"); 
    nom = npltn;
    prenom = mel;
}
    
public Utilisateur(String nm, String prnm, String brthDt){
       System.out.println("Nouvel utilisateur avec 3 paramètres"); 
       nom = nm;
       prenom = prnm;
       birthDate = brthDt;
       
}


    

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
    
}
