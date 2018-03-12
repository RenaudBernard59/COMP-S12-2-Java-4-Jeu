/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joueurscanner;

/**
 *
 * @author renob
 */


    

public class Joueur {
    //Variables
    private String Nom;
    private String Prenom;
    private int Age;
    public String Pseudo;
    public String Mdp;
    public enum Genre {M, F};
    
    //Constructeur
    public Joueur(String Nom, String Prenom, int Age) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
    }
    
    
    //Getter & Setter
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
}