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
        // TODO code application logic here
        // J'initialise un scanner ici
        Scanner sc = new Scanner(System.in);
        
        // Je crée des variables 
        String nvNom;
        String nvPrenom;
        String nvlleAnneeNaissance;
        ArrayList<Utilisateurs>listeNvUtil = new ArrayList<>();
        String reponse = "o";
        int i= -1;
        String codeChiffre = "0";
        Utilisateurs utilSelectionne;
        String codeMenu;
        String nvNomProfil;
        String nvPrenomProfil;
        String nvllAnneeProfil;
        String nvDestinataire;
        String nvTitre;
        String nvContenu;
        Messages messageSelectionne;
        
        
        while(reponse.equals("o") || reponse.equals("O") ){
        
        // Je donne des valeurs à ces variables
        System.out.println("Prénom : ");
        nvPrenom = sc.nextLine();
        System.out.println("Nom : ");
        nvNom = sc.nextLine();
        System.out.println("Année de naissance : ");
        nvlleAnneeNaissance = sc.nextLine();
        
        // Le nouvel utilisateur est créé et on reprend les infos saisies
        Utilisateurs utilConnecte = new Utilisateurs(nvNom, nvPrenom, nvlleAnneeNaissance);
        System.out.println("Vous êtes "+utilConnecte.getPrenom()+" et votre nom est "+utilConnecte.getNom() );
        listeNvUtil.add(utilConnecte);
        
        
        System.out.println("Voulez-vous créer un nouvel utilisateur ? O/N");
        reponse = sc.nextLine();
        
    }    
        
        System.out.println("Sélectionner un utilisateur");
        
        // Affiche la liste des nouveaux utilisateurs saisis séparemment
        for (Utilisateurs NvUtil : listeNvUtil){
        i ++ ;
        System.out.println("\n ----------------------- \n"+ i + " Votre prénom est "+NvUtil.getPrenom()+" et votre nom est "+NvUtil.getNom() );    
        }
        
        System.out.println("Sélectionner le code chiffre de votre utilisateur");
        codeChiffre = sc.nextLine();
        // Transforme la String codeChiffre en integer codeChiffre2
        int codeChiffre2 =  Integer.decode(codeChiffre);
        // L'utilisateur sélectionné correspond au nouvel utilisateur sélectionné dans la liste en fonction de son codeChiffre
        utilSelectionne = listeNvUtil.get(codeChiffre2);
       
        // --------------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("Que voulez-vous faire ?\n--------------------------------- \n1/Afficher votre profil\n--------------------------------- \n2/Modifier vos infos personnelles\n--------------------------------- \n3/Ecrire un message\n--------------------------------- \n4/Afficher un message\n--------------------------------- \n5/Supprimer un message\n--------------------------------- \n6/Ajouter un ami\n--------------------------------- \n7/Afficher le nom d'un ami\n--------------------------------- \n8/Changer d'utilisateur\n--------------------------------- \n9/Quitter" );
        codeMenu = sc.nextLine(); 
       
        switch(codeMenu){
            case "1":
                System.out.println("Prénom "+utilSelectionne.getPrenom()+" Nom "+utilSelectionne.getNom()+" Année de naissance "+utilSelectionne.getAnneeDeNaissance());
                break;
            case "2":
                System.out.println("Modifier vos infos personnelles"); // J'affiche "Modifier vos infos personnelles"
                System.out.println("Prénom :");
                nvPrenomProfil = sc.nextLine();
                utilSelectionne.setPrenom(nvPrenomProfil);
                System.out.println("Bonjour " +utilSelectionne.getPrenom());
                
                System.out.println("Nom :");
                nvNomProfil = sc.nextLine();  // Je mets dans une variable la saisie de l'utilisateur
                utilSelectionne.setNom(nvNomProfil); // Je mets dans l'objet utilSelectionne le contenu de la variable nvNomProfil grâce à setNom
                System.out.println(utilSelectionne.getNom()); // J'affiche le nom de l'objet utilSelectionne
        
                System.out.println("Année de naissance :");
                nvllAnneeProfil = sc.nextLine();
                utilSelectionne.setAnneeDeNaissance(nvllAnneeProfil);
                System.out.println(utilSelectionne.getAnneeDeNaissance());
                break;
                
            case "3":
                System.out.println("Ecrire un message");
                System.out.println("Destinataire :");
                nvDestinataire = sc.nextLine();
                
                System.out.println("Titre :");
                nvTitre = sc.nextLine();
                
                System.out.println("Contenu :");
                nvContenu = sc.nextLine();
                
                messageSelectionne = new Messages(nvDestinataire, nvTitre, nvContenu);
                System.out.println("Destinataire "+messageSelectionne.getDestinataire()+" Titre "+messageSelectionne.getTitre()+" Contenu "+messageSelectionne.getContenu());
                utilSelectionne.getListeMessages().add(messageSelectionne); // Je récupère la liste de messages de l'utilisateur sélectionné et j'ajoute le message qu'il vient de saisir 
                System.out.println(utilSelectionne.getListeMessages());
                
                break;
                
                
            case "4":
                messageSelectionne = new Messages("nvDestinataire", "nvTitre", "nvContenu");
                utilSelectionne.getListeMessages().add(messageSelectionne);
                //------------------------------------------------
                System.out.println("Entrer un numéro de message");
                String choixMessage = sc.nextLine();
                int chiffreChoixMessage =  Integer.decode(choixMessage);
                // System.out.println((utilSelectionne.getListeMessages()).get(chiffreChoixMessage));// Affiche le message sous forme d'objet
                System.out.println(utilSelectionne.getListeMessages().get(chiffreChoixMessage).getContenu());
                break;
                
            case "5":
                System.out.println("Supprimer un message");
                break;
                
            case "6":
                System.out.println("Prénom : ");
                nvPrenom = sc.nextLine();
                System.out.println("Nom : ");
                nvNom = sc.nextLine();
                System.out.println("Année de naissance : ");
                nvlleAnneeNaissance = sc.nextLine();
        
                // Le nouvel utilisateur est créé et on reprend les infos saisies
                Utilisateurs utilAmi = new Utilisateurs(nvNom, nvPrenom, nvlleAnneeNaissance);
                System.out.println("Votre ami "+utilAmi.getPrenom()+" "+utilAmi.getNom() );
                listeNvUtil.add(utilAmi);
                utilSelectionne.getListeAmi().add(utilAmi);
                break;
                
            case "7":
                System.out.println("Sélectionner votre ami"); 
                String amiSelectionne = sc.nextLine();
                int chiffreChoixAmi =  Integer.decode(amiSelectionne);
                System.out.println(utilSelectionne.getListeAmi().get(chiffreChoixAmi).getNom()+" "+utilSelectionne.getListeAmi().get(chiffreChoixAmi).getPrenom()+" "+utilSelectionne.getListeAmi().get(chiffreChoixAmi).getAnneeDeNaissance());
                
                
                break;
            case "8":
                break;
            case "9":
                break;
            default:
        }
    }
    
}
