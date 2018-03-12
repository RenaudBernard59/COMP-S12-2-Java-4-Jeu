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
    private String Pseudo;
    private String Mdp;
    private enum Genre {M, F};
    private Genre Genre;
    
    //Constructeur//Constructeur

    public Joueur(String Nom, String Prenom, int Age, String Pseudo, String Mdp, Genre Genre) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Age = Age;
        this.Pseudo = Pseudo;
        this.Mdp = Mdp;
        this.Genre = Genre;
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

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }

    public Genre getGenre() {
        return Genre;
    }

    public void setGenre(Genre Genre) {
        this.Genre = Genre;
    }
    
    
    
}