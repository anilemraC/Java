/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profil;

import java.util.Scanner;

/**
 * @version 1
 * @author carmelina.napolitano
 */
public class Profil {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*String nom = "Napolitano";
      String prenom = "Carmelina";
      int anneeDeNaissance = 1974;
      System.out.println("Votre nom est " + nom + ", " + "votre prénom est " + prenom + ", " + "votre date de naissance est " + anneeDeNaissance); */
      
      /* Scanner sc = new Scanner(System.in);
      System.out.println("Veuillez saisir votre prénom:");
      String str = sc.nextLine();
      System.out.println("Bonjour " + str + " ,"+" quelle est votre date de naissance ?");
      int i = sc.nextInt();
      System.out.println( i + "...vous êtes jeune !!!");
      sc.nextLine(); */
      
      String nom;
      String prenom;
      String birthDate;
      char reponse = 'O';
      

        /**
         * @return 
         * 
         */
      Scanner sc = new Scanner(System.in);
      
      while (reponse == 'O')
      {
        System.out.println("Donnez votre nom : ");
        nom = sc.nextLine();
        System.out.println("Bonjour " + nom);
        
        System.out.println("Donnez votre prenom : ");
        prenom = sc.nextLine();
        
        System.out.println("Votre année de naissance : ");
        birthDate = sc.nextLine();
        
        System.out.println( birthDate + "...vous êtes jeune !!!");
        
        reponse = ' ';
      
        while(reponse  != 'N')
        {
    
            System.out.println("Voulez-vous réessayer ? (O/N)");
            reponse = sc.nextLine().charAt(0);
        }
      }
       System.out.println("Au revoir…");
    }
    
}
