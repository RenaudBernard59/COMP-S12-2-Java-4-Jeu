/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxencejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Formation
 * @version 1.0
 * <h1>L'application JoueurScanner permet de choisir et de créer des Listes de joueurs différenrs</h1>
 */
public class JoueurScanner {
 private static Scanner sc = new Scanner(System.in);
 /**
  * <b>On a 3 Listes de joueurs différent qui vont utilisées dans les méthodes statiques de la classe</b> 
 */
 private static     List <JoueurF> ListeJoueursF = new ArrayList <JoueurF> ();
 private static     List <JoueurR> ListeJoueursR = new ArrayList <JoueurR> ();
 private static     List <JoueurH> ListeJoueursH = new ArrayList <JoueurH> ();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
          
           //int nbJoueurs =0;
           int typejoueur = 0;
           String valeur= "";
           try {
        
           List <Joueur> ListeJoueurs = new ArrayList <Joueur> (); 
           
           do
           {
                System.out.println(" Saisir le type joueur (1,2 ou 3) ou 0 = fin : ");
                while (!sc.hasNextInt()) {
                    System.out.println(" Saisir le type joueur (1,2 ou 3) ou 0 = fin : ");
                    sc.next();
                }
                valeur = sc.next();
                typejoueur = Integer.parseInt(valeur);
                switch(typejoueur)
                {
                    case 1 :  saisir_joueur(ListeJoueurs, new JoueurF());
                                break;
                    case 2 :  saisir_joueur(ListeJoueurs, new JoueurR());
                                break;
                    case 3 :  saisir_joueur(ListeJoueurs, new JoueurH());
                                break;

                }                
            }
           while(typejoueur != 0);
           
           clearJoueurs();
           constitueEquipe(ListeJoueurs);
           
           afficheJoueurs(ListeJoueursF,"FootBall");
           afficheJoueurs(ListeJoueursR,"Rugby");
           afficheJoueurs(ListeJoueursH,"HandBall");
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       } 
    }
    /**
     * 
     * @param ListeJoueurs
     * @param oj : joueur à ajouter à ajouter dans les listeJoueurs (on aura 3 types joueurs différents)
     * <b>Toutes les exceptions seront gérées dans le main.</b>
     * <i>On saisit toutes les données du joueur et on contrôle la saisie</i>
     * @throws Exception 
     */
    public static void saisir_joueur(List<Joueur> ListeJoueurs,Joueur oj) throws Exception
    {
         String temp="";
         int valtemp=0;
           //Joueur oj = new Joueur();
            System.out.println(" Joueur : "+oj.getClass().getName());

           System.out.println(" Saisir le nom : ");
           oj.setNom(setClavier(temp));
           System.out.println(" Saisir le prénom :");
           oj.setPrenom(setClavier(temp));
           System.out.println(" Saisir votre Pseudo :");
           oj.setPseudo(setClavier(temp));
           System.out.println(" Saisir votre mot de passe ");
           temp = setClavier(temp);
           if(temp.length() >2)           
               oj.setMdp(temp);
           else
               throw new Exception("La taille du MTP est inférieure à 2 !");
            System.out.println(" Saisir votre âge ");
           valtemp = setClavier(valtemp);
           if(valtemp > 12)
           {
               oj.setAge(valtemp);
           }
           else
               throw new Exception("L'âge est inférieur à 12 !");
           System.out.println(" Saisir votre Genre : ");
           temp = setClavier(temp);
           if (temp.equalsIgnoreCase("M"))
           {
               oj.setGenre(Genre.M);
           }
           else {
               if (temp.equalsIgnoreCase("F"))  
               {
                   oj.setGenre(Genre.F);
               }
               else
               {
                   throw new Exception("Le genre est invalide !");
               }
           }

           ListeJoueurs.add(oj);
    }
    /**
     * 
     * @param temp
     * @return temp modifier de type String
     */
    public static String setClavier(String temp)
    {
        temp = sc.next();
        return temp;
    }
    /**
     * <i>On teste si c'est une numérique sinon on retourne la valeur rentrée en paramètre</i>
     * @param temp
     * @return temp modifier de type int
     */
     public static int setClavier(int temp)
    {
         if (sc.hasNextInt()) {
               temp = sc.nextInt();
           }

        return temp;
    }
     /**
      * <h2>On constitue dans les 3 listes de joueurs différents selon la lecture de ListeJoueurs</h2>
      * @param ListeJoueurs
      * @throws Exception 
      */
   public static void constitueEquipe(List<Joueur> ListeJoueurs) throws Exception
   {
      
       for(Joueur oj : ListeJoueurs)
       {
           if(oj instanceof JoueurF)
           {
               ListeJoueursF.add((JoueurF) oj);
           }
           if(oj instanceof JoueurR)
           {
               ListeJoueursR.add((JoueurR) oj);
           }
           if(oj instanceof JoueurH)
           {
               ListeJoueursH.add((JoueurH) oj);
           }
       }
       
   }
   
   public static void clearJoueurs()
   {
       ListeJoueursF.clear();
       ListeJoueursH.clear();
       ListeJoueursR.clear();
   }
   
   public static void afficheJoueurs(List ListeJoueurs,String titre)
   {
       Joueur ojb;
       System.out.printf("-------%15s------ nb : %03d",titre,ListeJoueurs.size());
       for(Object oj : ListeJoueurs)
       {
           ojb = (Joueur) oj;
           System.out.println("Nom : "+ojb.getNom());
       }
   }
}