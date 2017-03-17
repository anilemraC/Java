/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_social;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @version 1
 * @author carmelina.napolitano
 */
public class Reseau_social {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        
      //Utilisateur nouvelUtilisateur = new Utilisateur();
      
      Utilisateur moi = new Utilisateur("Npltn", "Mel");
      //System.out.println(nouvelUtilisateur.getPrenom() + " " + nouvelUtilisateur.getNom() + " " + nouvelUtilisateur.getBirthDate());
      //System.out.println(moi.getPrenom() + " " + moi.getNom());
      System.out.println(moi.getPrenom() + " " + moi.getNom() + " " + moi.getBirthDate());
      
      /* Mini projet 1
      Manipulation syntaxe de base */
      // Je déclare mes variables
      String nvnom;
      String nvprenom;
      int nvllbirthDate;
      String message;
      String ami;
      ArrayList<String> messages = new ArrayList<String>();
      ArrayList<String> amis = new ArrayList<String>();
      
      char reponse = 'O';
      Scanner sc = new Scanner(System.in);
      // La boucle qui permet d'afficher les informations de l'utilisateur
      while (reponse == 'O')
      {
        System.out.println("Nom : ");
        nvnom = sc.nextLine();
        System.out.println("Bonjour " + nvnom);
        
        System.out.println("Prenom : ");
        nvprenom = sc.nextLine();
        
        System.out.println("Année de naissance : ");
        nvllbirthDate = sc.nextInt();
        sc.nextLine();
        
        System.out.println( nvllbirthDate + "...vous êtes jeune !!!");
        
        reponse = 'N';
      }
       // La boucle qui propose des choix d'actions jusqu'à quitter le programme
       while(reponse == 'N')
        {
            System.out.println("Afficher votre profil : 1 ");
            System.out.println("Modifier vos infos personnelles : 2 ");
            System.out.println("Ecrire un message : 3 ");
            System.out.println("Afficher un message : 4 ");
            System.out.println("Ajouter un ami : 5 ");
            System.out.println("Afficher le nom d'un ami : 6 ");
            System.out.println("Quitter le menu : 7 ");
            String choix = sc.nextLine();
            System.out.println(choix);
            
            switch (choix)
            {
                  case "1":
                    System.out.println("Je suis " + moi.getPrenom() + " " + moi.getNom() +
                    " et je suis né(e) en " + moi.getBirthDate() + ".");
                    break;      
                    
                  case "2":
                    System.out.println("Nom : "); // J'affiche "Nom :"
                    nvnom = sc.nextLine(); // Je mets dans une variable la saisie de l'utilisateur
                    moi.setNom(nvnom); // Je mets dans l'objet moi le contenu de la variable nvnom grâce à setNom
                    System.out.println("Bonjour " + moi.getNom()); // J'affiche le nom de l'objet moi

                    System.out.println("Prenom : ");
                    nvprenom = sc.nextLine();
                    moi.setPrenom(nvprenom);
                    

                    System.out.println("Année de naissance : ");
                    nvllbirthDate = sc.nextInt();
                    sc.nextLine();
                    moi.setBirthDate(nvllbirthDate);

                    System.out.println(moi.getBirthDate() + "...vous êtes jeune !!!");
                    
                    
                    System.out.println("Maintenant je suis " + moi.getPrenom() + " " + moi.getNom() +
                    " et je suis né(e) en " + moi.getBirthDate() + ".");
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
                    
                  case "7":
                      reponse = ' ';
                      
                      break;
                   
                  default:
                    System.out.println("Choix inconnu, veuillez réessayer");
                    
                    
               
             }
        }
      
      System.out.println("Au revoir…");
    }

}
    

