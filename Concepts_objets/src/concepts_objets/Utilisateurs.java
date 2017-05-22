package concepts_objets;

import java.util.ArrayList;
import java.util.Scanner;

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
    public Utilisateurs(String pNom, String pPrenom, String pAnneeDeNaissance) 
        throws anneeDeNaissanceException
        {
            if( "2017".equals(pAnneeDeNaissance) )
                throw new anneeDeNaissanceException();
            else
            {
        this.nom = pNom;
        this.prenom = pPrenom;
        this.anneeDeNaissance = pAnneeDeNaissance;
        this.listeMessages = new ArrayList<>();
        this.listeAmi = new ArrayList<>();
        
            }
        }
    public Utilisateurs(String pNom, String pPrenom){
        
        this.nom = pNom;
        this.prenom = pPrenom;
        this.anneeDeNaissance = "1111";
        this.listeMessages = new ArrayList<>();
        this.listeAmi = new ArrayList<>();
        
            
        }
    
    
    // Methodes
    public void showInfos(){
        System.out.println("Prénom "+ this.prenom + 
                           " Nom "+ this.nom +
                           " Année de naissance "+ this.anneeDeNaissance );
    }
    
    
    
    public void changeInfos() {
        System.out.println("Modifier vos infos personnelles"); // J'affiche "Modifier vos infos personnelles"
        System.out.println("Prénom :");
        Scanner sc = new Scanner (System.in);
        String nvPrenomProfil = sc.nextLine();
        this.prenom = nvPrenomProfil;
        System.out.println("Nom :");
        String nvNomProfil = sc.nextLine();  // Je mets dans une variable la saisie de l'utilisateur
        this.nom = nvNomProfil; // Je mets dans l'objet utilSelectionne le contenu de la variable nvNomProfil grâce à setNom
        System.out.println("Année de naissance :");
        String nvllAnneeProfil = sc.nextLine();
        this.anneeDeNaissance = nvllAnneeProfil;
        
        System.out.println("Vos informations ont bien été modifiées :");
        System.out.println("Votre nouvelle date de naissance est : " +this.anneeDeNaissance);   
        System.out.println("Votre nouveau prénom est :  " +this.prenom);
        System.out.println("Votre nouveau nom est : "+this.nom); // J'affiche le nom de l'objet utilSelectionne
    }
    
    
    public void writeMessage() {
         System.out.println("Ecrire un message");
                System.out.println("Destinataire :");
                Scanner sc = new Scanner (System.in);
                String nvDestinataire = sc.nextLine();
                
                System.out.println("Titre :");
                String nvTitre = sc.nextLine();
                
                System.out.println("Contenu :");
                String nvContenu = sc.nextLine();
                
                Messages message = new Messages(nvDestinataire, nvTitre, nvContenu);
                System.out.println("Destinataire "+ message.getDestinataire()+
                                   " Titre "+message.getTitre()+
                                   " Contenu "+message.getContenu());
                
                this.listeMessages.add(message); // Je récupère la liste de messages de l'utilisateur sélectionné et j'ajoute le message qu'il vient de saisir 
                System.out.println (this.listeMessages);
    }
    
    public void showMessage() {
        System.out.println("Voici votre dernier message");
        int index_LastMessage = this.listeMessages.size() -1;     
        Messages lastMessage = this.listeMessages.get(index_LastMessage);
        System.out.println("Destinataire du message : "+ lastMessage.getDestinataire()+
                           " Titre du message : " + lastMessage.getTitre()+
                           " Contenu du message :"+ lastMessage.getContenu());
        
    }
    
    public void deleteMessage() {
        System.out.println("Supprimer votre dernier message");
        int index_LastMessage = this.listeMessages.size() -1;
        this.listeMessages.remove(index_LastMessage);
        System.out.println("Vous avez supprimé votre dernier message");
    }
    
    public void deleteAllMessage() {
        this.listeMessages = new ArrayList<Messages>();  
    }
    
    public void addFriend() {
        System.out.println("Ajouter un ami");
               System.out.println("Prénom du nouvel ami :");
               Scanner sc = new Scanner (System.in);
               String nvPrenom = sc.nextLine();
               
               System.out.println("Nom du nouvel ami :");
               String nvNom = sc.nextLine();
                
               System.out.println("Année de naissance du nouvel ami :");
               String nvAnneeDeNaissance = sc.nextLine();
                try {
                   Utilisateurs utilAmi = new Utilisateurs(nvPrenom, nvNom, nvAnneeDeNaissance);
                System.out.println("Prénom nouvel ami: "+ utilAmi.getPrenom()+
                                   " Nom nouvel ami: "+utilAmi.getNom()+
                                   " Anné de naissance nouvel ami: "+utilAmi.getAnneeDeNaissance()); 
                this.listeAmi.add(utilAmi); 
                System.out.println (this.listeAmi);
                }
                catch (anneeDeNaissanceException e){
                    System.out.println("erreur");
                }
                
                
                
    }
    
    public void showFriendName() {
        System.out.println("Afficher le nom de votre ami");
        int index_LastFriend = this.listeAmi.size() -1;     
        Utilisateurs lastFriend = this.listeAmi.get(index_LastFriend);
        System.out.println("Votre nouvel ami s'appelle : "+ lastFriend.getNom());
    }
    
    public ArrayList<Utilisateurs> getListeAmi() {
        return listeAmi;
    }

    public void setListeAmi(ArrayList<Utilisateurs> listeAmi) {
        this.listeAmi = listeAmi;
    }
    
        
    public static Utilisateurs CreateUser(ArrayList<Utilisateurs> listeUtil,Scanner scan) {
        // Je déclare mes variables
        String nvNom;
        String nvPrenom;
        String nvlleAnneeNaissance;
        Utilisateurs user;
        char reponse = 'O';
        Scanner sc = new Scanner (System.in);

        
        // Je donne des valeurs à mes variables
        System.out.println("Etes-vous modérateur ? O/N ");
        reponse = sc.nextLine().charAt(0);
        System.out.println("Prénom : ");
        nvPrenom = scan.nextLine();
        System.out.println("Nom : ");
        nvNom = scan.nextLine();
        System.out.println("Année de naissance : ");
        nvlleAnneeNaissance = scan.nextLine();
        
        try {
                   user = new Moderateur1(nvPrenom, nvNom, nvlleAnneeNaissance);
                }
                catch (anneeDeNaissanceException e){
                    System.out.println("erreur");
                    user = new Moderateur1(nvPrenom, nvNom);
                }
     
        
        if (reponse == 'O'){
            System.out.println("Vous avez accès aux données des utilisateurs");
            
            
        }else{
            System.out.println("Vous n'êtes pas modérateur !");
        } 
        
        // Le nouvel utilisateur est créé et on reprend les infos saisies
        // !!!!!! à finir !!!!!
        System.out.println("Vous êtes "+user.getPrenom()+" et votre nom est "+user.getNom() );
        listeUtil.add(user);
        return user;
    }
    
    public static Utilisateurs SelectUser(ArrayList<Utilisateurs> listeUtil,Scanner scan) {
        String codeChiffre = "0";
        int i= -1;
        System.out.println("Sélectionnez un utilisateur");
    
    // Affiche la liste des nouveaux utilisateurs saisis séparemment
       
        // Pour chaque nouvel utilisateur de type Utilisateurs présent dans la liste nouvel utilisateur
        for (Utilisateurs NvUtil : listeUtil){ 
        i = i+1 ;
        System.out.println("\n ----------------------- \n"+ i + " Votre prénom est "+NvUtil.getPrenom()+" et votre nom est "+NvUtil.getNom() );    
        }
        
        System.out.println("Sélectionnez le code chiffre de votre utilisateur");
        codeChiffre = scan.nextLine();
        // Transforme la String codeChiffre en integer codeChiffre2
        int codeChiffre2 =  Integer.decode(codeChiffre);
        // L'utilisateur sélectionné correspond au nouvel utilisateur sélectionné dans la liste en fonction de son codeChiffre
        Utilisateurs utilSelectionne = listeUtil.get(codeChiffre2);
       
        return utilSelectionne;
    }       
            
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
