/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concepts_objets;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author carmelina.napolitano
 */
public class Menu {
    // Je déclare mes attributs
    
    // Je déclare mes constructeurs
      
    // Je déclare mes méthodes
    // Ma méthode peut être appelée (static) 
    // sans être instanciée (sans objet) et elle ne retourne rien (void)
    public void AfficherMenu() { 
        System.out.println("\n \n \n \nQue voulez-vous faire ?");
        System.out.println("1. Afficher mon profil");
        System.out.println("2. Modifier mes infos personnelles");
        System.out.println("3. Ecrire un message");
        System.out.println("4. Afficher un message");
        System.out.println("5. Supprimer un message");
        System.out.println("6. Supprimer tous les messages");
        System.out.println("7. Ajouter un ami");
        System.out.println("8. Afficher le nom d'un ami");
        System.out.println("9. Modifier le message d'autre utilisateur");
        System.out.println("10. Supprimer un utilisateur");
        System.out.println("11. Quitter");
    }
    
    /* public void AfficherMenu(Moderateur1 mod) { 
        System.out.println("\n \n \n \nQue voulez-vous faire ?");
        System.out.println("1. Afficher mon profil");
        System.out.println("2. Modifier mes infos personnelles");
        System.out.println("3. Ecrire un message");
        System.out.println("4. Afficher un message");
        System.out.println("5. Supprimer un message");
        System.out.println("6. Supprimer tous les messages");
        System.out.println("7. Ajouter un ami");
        System.out.println("8. Afficher le nom d'un ami");
        System.out.println("9. Modifier le message d'autre utilisateur");
        System.out.println("9. Supprimer un utilisateur");
        System.out.println("10. Quitter");
    } */
    
    public String getAnswer(){    
        // J'initialise un scanner ici
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }
    
    public void obeyUser(String answer, Utilisateurs utilSelectionne){
        switch(answer) {
                case "1": // Afficher profil 
                    utilSelectionne.showInfos();
                    break;
                    
                case "2": // Modifier infos personnelles
                    utilSelectionne.changeInfos(); 
                    break;
                    
                case "3": // Ecrire un message
                    utilSelectionne.writeMessage();
                    break;
                    
                case "4": // Afficher un message
                    utilSelectionne.showMessage();
                    break;
                    
                case "5": // Supprimer un message
                    utilSelectionne.deleteMessage();
                    break;
                    
                case "6": // Supprimer tous les messages
                    utilSelectionne.deleteAllMessage();
                    break;
                    
                case "7": // Ajouter un ami
                    utilSelectionne.addFriend();
                    break;
                    
                case "8": // Afficher le nom d'un ami
                    utilSelectionne.showFriendName();
                    break;
                    
                case "9": // Quitter le programme
                    System.out.println("Au revoir");
                    break;
        }
    }
    
    
    
    
     public void obeyUser(String answer, Moderateur1 mod, Utilisateurs util){
        switch(answer) {
                case "1": // Afficher profil 
                    mod.showInfos();
                    break;
                    
                case "2": // Modifier infos personnelles
                    mod.changeInfos(); 
                    break;
                    
                case "3": // Ecrire un message
                    mod.writeMessage();
                    break;
                    
                case "4": // Afficher un message
                    mod.showMessage();
                    break;
                    
                case "5": // Supprimer un message
                    mod.deleteMessage();
                    break;
                    
                case "6": // Supprimer tous les messages
                    mod.deleteAllMessage();
                    break;
                    
                case "7": // Ajouter un ami
                    mod.addFriend();
                    break;
                    
                case "8": // Afficher le nom d'un ami
                    mod.showFriendName();
                    break;
                    
                case "9": // Modifier le message d un autre utilisateur 
                    mod.ModifyMessage(util);
                    break;
                    
                case "10": // Quitter le programme
                    System.out.println("Au revoir");
                    break;
        }
    }
    
        /*
        int rester = 1;
        while(rester == 1) {
            switch() {


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

                case "10":
                    rester = 0;
                    System.out.println("Vous avez quitté");
                    break;

                default:
                    break;
            }
        }
        */
}
