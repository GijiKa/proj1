package ecole.pojo;

import java.util.*;

    public class ActivitePratiquee{
    private int id_eleve;
    private int  niveau;
    private String nom;
    
   
   


    public ActivitePratiquee() {}
    public ActivitePratiquee(int id_eleve , int niveau , String nom) 
    {
	this.id_eleve =id_eleve ;
	this.niveau = niveau ;
	this.nom = nom ;
    }



    public int getId_eleve() {
        return id_eleve;
    }

    private void setId_eleve(int id_eleve) {
        this.id_eleve =id_eleve;
    }
   //*****************************


    public int getNiveau() {
        return niveau;
    }

    private void setNiveau( int niveau) {
        this.niveau = niveau;
    }
 //**********************
   
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   //**************************


  

}
