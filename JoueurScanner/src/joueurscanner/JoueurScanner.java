/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renob
 */
public class JoueurScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Messages
       String promptNbJoueurs = "Indiquez un nombre de joueurs : ";
       String promptNomJoueur = "Indiquez le Nom du joueur : ";
       String promptPrenomJoueur = "Indiquez le Prenom du joueur : ";
       String promptAgebJoueur  = "Indiquez l'Age du joueur : ";
       String promptPseudoJoueur  = "Indiquez le Pseudo du joueur : ";
       String promptMdpJoueur  = "Indiquez le Mot de Passe du joueur : ";
       String promptGenreJoueur  = "Indiquez le Genre du joueur (H - F) : ";
       
       //enum Genre {M, F};
       int pNbJoueurs;
       String pNom;
       String pPrenom;
       int pAge;
       String pPseudo;
       String pMdp;
       //Genre pGenre;
       Scanner sc = new Scanner(System.in);

       
       //Listes      
       ArrayList listeDesJoueurs = new ArrayList();
       ArrayList UnJoueur = new ArrayList();
       
       //Test Scanner
       System.out.println(promptNbJoueurs);
       pNbJoueurs = sc.nextInt();
       System.out.println(pNbJoueurs);
       
       System.out.println(promptNomJoueur);
       pNom = sc.next();
       System.out.println(pNom);
       
       System.out.println(promptPrenomJoueur);
       pPrenom = sc.next();
       System.out.println(pPrenom);
       
       System.out.println(promptAgebJoueur);
       pAge = sc.nextInt();
       System.out.println(pAge);
       
       System.out.println(promptPseudoJoueur);
       pPseudo = sc.next();
       System.out.println(pPseudo);
       
       System.out.println(promptMdpJoueur);
       pMdp = sc.next();
       System.out.println(pMdp);
       
       System.out.println(promptGenreJoueur);
       //pGenre = sc.next();
       /////////////////////
       
       
       
       
        
    }
}
