package ecole.pojo;

import java.util.*;

public class Resultat {

    private int  id_eleve;
    private  int  id_cours;
    private int  points;



    public  Resultat () {}
    public  Resultat (int id_eleve , int id_cours, int points ) 
    {
	this.id_eleve = id_eleve ;
	this.id_cours = id_cours ;
	this.points = points ;
	}



    public int getId_eleve() {
        return id_eleve;
    }

    private void setId_eleve( int id) {
        this.id_eleve = id;
    }
   //*****************************
    public int  getId_cours() {
        return id_cours;
    }

    private void setId_cours( int id) {
        this.id_cours = id;
    }
   //****************************
    public int  getPoints() {
        return points;
    } 
    public void setPoints(int points) {
        this.points = points;
    }
   //**************************

}
	
