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
class anneeDeNaissanceException extends Exception{
    public anneeDeNaissanceException(){
        System.out.println("Vous essayez d'instancier une classe Utilisateurs avec une année de naissance invalide !");
    } 
}
