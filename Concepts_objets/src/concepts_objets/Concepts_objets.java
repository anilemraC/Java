/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concepts_objets;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author carmelina.napolitano
 */
public class Concepts_objets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try {
            Utilisateurs u = null;
        u = new Utilisateurs("N", "Crmln", "1111");
        System.out.println(u.toString());
        }
        catch (anneeDeNaissanceException e) {}
        System.out.println("ça ne marche pas !!!");*/
        // Attributs : je crée des variables 
        Scanner sc = new Scanner(System.in); // J'initialise un scanner ici
        String reponse = "";
        String codeMenu = "";
        // Je crée ma liste
        ArrayList<Utilisateurs> listeNvUtil = new ArrayList<>();
        String choiceMenu = "1";
        
        
        //String codeMenu;
        
        // Programme principal ici :

        // Je déclare une variable qui contient la fonction CreateUser
        // La fonction CreateUser est déclarée sur la class Utilisateurs, 
        // je ne peux pas le faire sur un objet de ma class, 
        // elle n'en a pas car cette fonction crée l'objet
            Utilisateurs util = Utilisateurs.CreateUser(listeNvUtil,sc);
        

            Menu myMenu = new Menu();
   
                
            while(!choiceMenu.equals("9")){
                myMenu.AfficherMenu();
                choiceMenu = myMenu.getAnswer();
                myMenu.obeyUser(choiceMenu, util);
            }

        
        while(reponse.equals("o") || reponse.equals("O") ){
            // Je déclare une variable qui contient la fonction CreateUser
            // La fonction CreateUser est déclarée sur la class Utilisateurs, 
            // je ne peux pas le faire sur un objet de ma class, 
            // elle n'en a pas car cette fonction crée l'objet
            // Utilisateurs util = Utilisateurs.CreateUser(listeNvUtil,sc);
       
            System.out.println("Voulez-vous créer un nouvel utilisateur ? O/N");
            reponse = sc.nextLine();
        
        }    
        Utilisateurs utilSel = Utilisateurs.SelectUser(listeNvUtil,sc);
        
       
        // --------------------------------------------------------------------------------------------------------------------------------------
        //Menu.AfficherMenu();
        /* ici*/
        
        
        System.out.println("Que voulez-vous faire ?\n--------------------------------- \n1/Afficher votre profil\n--------------------------------- \n2/Modifier vos infos personnelles\n--------------------------------- \n3/Ecrire un message\n--------------------------------- \n4/Afficher un message\n--------------------------------- \n5/Supprimer un message\n--------------------------------- \n6/Ajouter un ami\n--------------------------------- \n7/Afficher le nom d'un ami\n--------------------------------- \n8/Changer d'utilisateur\n--------------------------------- \n9/Quitter" );
        codeMenu = sc.nextLine(); 
       
        switch(codeMenu){
            case "1":
                
                break;
            case "2":
                
                break;
                
            case "3":
                
                
                break;
                
                
            case "4":
                
                break;
                
            case "5":
                
                break;
                
            case "6":
               
                break;
                
            case "7":
                
                
                
                break;
            case "8":
                break;
            case "9":
                break;
            default:
        }
        /*ici*/
    }
    
}
