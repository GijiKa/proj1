
package ecole.pojo;

import java.util.*;

public class Cours {

    private int  id;
    private String nom;
 
    private int nb_heures ;
    private int annee ;
   


    public Cours() {}
    public Cours(int id , String nom, int nb_heures , int annee) 
    {
	this.id = id ;
	this.nom = nom ;
	this.nb_heures= nb_heures ;
	this.annee  = annee ;
	}



    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
   //*****************************
 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    //*************************


    public int getNb_heures() {
        return nb_heures;
    }

    public void setNb_heures(int nb_heures) {
        this.nb_heures = nb_heures;
    }
   //**************************

    public int  getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
	 

}

