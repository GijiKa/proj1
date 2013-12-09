package ecole.pojo;

import java.util.*;

public class Activite{

    private int  niveau;
    private String nom;
    private String equipe;
   
   


    public Activite() {}
    public Activite(int niveau , String nom, String equipe) 
    {
	this.niveau =niveau ;
	this.nom = nom ;
	this.equipe = equipe ;
    }



    public int getNiveau() {
        return niveau;
    }

    private void setNiveau(int niveau) {
        this.niveau = niveau;
    }
   //*****************************
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   //**************************


    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    //*************************


  

}
