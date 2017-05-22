/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/**
 *
 * @author carmelina.napolitano
 */
public class JDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        // Création d'un nouvel utilisateur
        // (Saisie des données via Scanner)
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom :");
        String nomUser = sc.nextLine();
        System.out.println("Entrez votre prénom :");
        String prenomUser = sc.nextLine();
        System.out.println("Entrez votre date de naissance :");
        String dateNaissanceUser = sc.nextLine();
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost/jdbc";
            String user = "root";
            String passwd = "root";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            String expression;
            //On autorise la mise à jour des données 
            //Et la mise à jour de l'affichage 
            
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            expression = " INSERT INTO user (last_name, first_name, birth_date)";
            expression += "VALUES (?, ?, ?)"; 
            PreparedStatement prepare = conn.prepareStatement(expression);

            //On va chercher une ligne dans la base de données
            String query = "SELECT last_name, first_name, birth_date FROM user";

            //On exécute la requête
            ResultSet res = state.executeQuery(query);
            System.out.println("\n\tDONNEES D'ORIGINE : ");
            System.out.println("\t-------------------");
            while(res.next()){;
            //On affiche
            System.out.println("Nom : "+ res.getString("last_name")+" - Prenom : "+ res.getString("first_name")+" - Date de naissance"+ res.getString("birth_date"));
            }
            //On paramètre notre requête préparée
            prepare.setString(1, nomUser);
            prepare.setString(2, prenomUser);
            prepare.setString(3, dateNaissanceUser);
            //On exécute
            prepare.executeUpdate();
            
            res = state.executeQuery(query);
            
            System.out.println("\n\tDONNEES MODIFIEES : ");
            System.out.println("\t-------------------");
            while(res.next()){;
            //On affiche
            System.out.println("Nom : "+ res.getString("last_name")+" - Prenom : "+ res.getString("first_name")+" - Date de naissance"+ res.getString("birth_date"));
            }
            
            
            prepare.close();
            res.close();
            state.close(); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
} */    
        
        // Afficher les infos de profil
        // d'un utilisateur donné
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver O.K.");

            String url = "jdbc:mysql://localhost/jdbc";
            String user = "root";
            String passwd = "root";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !"); 
            
            //On va chercher une ligne dans la base de données
            String query = "SELECT last_name, first_name, birth_date FROM user";
            
            //On exécute la requête
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            System.out.println("\n\tDONNEES D'ORIGINE : ");
            System.out.println("\t-------------------");
            
            while(res.next()){
            //On affiche
                System.out.println("Nom : "+ res.getString("last_name")+" - Prenom : "+ res.getString("first_name")+" - Date de naissance"+ res.getString("birth_date"));
            }
            
            //L'objet ResultSet contient le résultat de la requête SQL
            state.executeUpdate("DELETE FROM user WHERE last_name = 'Ain-Jepar'");
            

            System.out.println("\n********************************************************************");
            
            ResultSet result = state.executeQuery("SELECT * FROM user");
            ResultSetMetaData resultMeta = result.getMetaData();
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print("\t" + resultMeta.getColumnName(i) + "\t *");

            System.out.println("\n********************************************************************");
            
            while(result.next()){         
              for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + result.getObject(i).toString() + "\t |");

              System.out.println("\n---------------------------------");

            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   
    
     

    
    

