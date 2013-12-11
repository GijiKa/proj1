
package ecole.pojo;

import java.util.*;

import com.google.gson.annotations.Expose;

public class Cours  implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Expose
	private int  id;
	@Expose
    private String nom;
	@Expose
    private int nb_heures ;
	@Expose
    private int annee ;
    private Set<Resultat> resultatses = new HashSet<Resultat>(0);
    private Set<Professeur> professeurses = new HashSet<Professeur>(0);
   
    public Cours() {
    }



    public Cours(int id) {
    	this.id = id ;
    }
    public Cours(int id , String nom, int nb_heures , int annee,Set<Resultat> resultatses, Set<Professeur> professeurses) 
    {
	this.id = id ;
	this.nom = nom ;
	this.nb_heures= nb_heures ;
	this.annee  = annee ;
	this.resultatses = resultatses;
    this.professeurses = professeurses;
	}



    public int getId() {
        return id;
    }

public void setId(int id) {
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
	 
    public Set<Resultat> getResultatses() {
        return this.resultatses;
    }
    
    public void setResultatses(Set<Resultat> resultatses) {
        this.resultatses = resultatses;
    }
    public Set<Professeur> getProfesseurses() {
        return this.professeurses;
    }
    
    public void setProfesseurses(Set<Professeur> professeurses) {
        this.professeurses = professeurses;
    }


}
