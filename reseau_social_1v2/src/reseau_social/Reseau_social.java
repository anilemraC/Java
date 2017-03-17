/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author carmelina.napolitano
 */
public class Reseau_social {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        
      Utilisateur nouvelUtilisateur = new Utilisateur();
      Utilisateur moi = new Utilisateur("npltn", "mel");
      System.out.println(nouvelUtilisateur.getPrenom() + nouvelUtilisateur.getNom() + " " + nouvelUtilisateur.getBirthDate());
      System.out.println(moi.getPrenom() + " " + moi.getNom());
      String nom;
      String prenom;
      String birthDate;
      String message;
      String ami;
      ArrayList<String> messages = new ArrayList<String>();
      ArrayList<String> amis = new ArrayList<String>();
      
      char reponse = 'O';
      Scanner sc = new Scanner(System.in);
      
      while (reponse == 'O')
      {
        System.out.println("Nom : ");
        nom = sc.nextLine();
        System.out.println("Bonjour " + nom);
        
        System.out.println("Prenom : ");
        prenom = sc.nextLine();
        
        System.out.println("Année de naissance : ");
        birthDate = sc.nextLine();
        
        System.out.println( birthDate + "...vous êtes jeune !!!");
        
        reponse = ' ';

      
       while(reponse != 'N')
        {
            System.out.println("Quitter le menu : N ");
            System.out.println("Afficher votre profil : 1 ");
            System.out.println("Modifier vos infos personnelles : 2 ");
            System.out.println("Ecrire un message : 3 ");
            System.out.println("Afficher un message : 4 ");
            System.out.println("Ajouter un ami : 5 ");
            System.out.println("Afficher le nom d'un ami : 6 ");
            String choix = sc.nextLine();
            System.out.println(choix);
            
            switch (choix)
            {
                  case "1":
                    System.out.println("Je suis " + prenom + " " + nom +
                    " et je suis né(e) en " + birthDate + ".");
                    break;      
                    
                  case "2":
                    System.out.println("Nom : ");
                    nom = sc.nextLine();
                    System.out.println("Bonjour " + nom);

                    System.out.println("Prenom : ");
                    prenom = sc.nextLine();

                    System.out.println("Année de naissance : ");
                    birthDate = sc.nextLine();

                    System.out.println( birthDate + "...vous êtes jeune !!!");
                    break;
                    
                  case "3":
                    System.out.println("Saisissez votre message ici: ");
                    message = sc.nextLine();
                    System.out.println(message);
                    messages.add(message);
                    break;
                    
                  case "4":
                      for (int i = 0; i < messages.size(); i++) {
                         System.out.println( messages.get(i) ); 
                      }
                   break;
                    
                  case "5":
                    System.out.println("Ajouter un ami: ");
                    ami = sc.nextLine();
                    System.out.println(ami);
                    amis.add(ami);
                    
                    break;
                    
                  case "6":
                    for (int i = 0; i < amis.size(); i++) {
                        System.out.println( amis.get(i) ); 
                      }
                    break; 
                   
                  default:
                    System.out.println("Choix inconnu, veuillez réessayer");
             }
        }
      }
       System.out.println("Au revoir…");
    }

}
    

