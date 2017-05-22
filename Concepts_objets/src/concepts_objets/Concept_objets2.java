/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concepts_objets;

/**
 *
 * @author carmelina.napolitano
 */
public class Concept_objets2 {
   public static void main(String[] args) throws anneeDeNaissanceException {
       Moderateur2 M2 = new Moderateur2( "nom", "prenom", "anneeDeNaissance");
       System.out.println(M2.toString());
       try {
        Utilisateurs util = new Moderateur2("B", "CL", "2017");
       } catch (Exception e)
       {
           System.out.println("Exception");
           e.printStackTrace();
       }
       System.out.println("toto");
   } 
}
