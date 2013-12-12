package ecole.pojo;

import java.util.*;

import com.google.gson.annotations.Expose;

public class Activite implements java.io.Serializable{

	private ActiviteId id;
	@Expose
    private int  niveau;
	@Expose
    private String nom;
	@Expose
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

    public void setNiveau(int niveau) {
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
	public ActiviteId getId() {
		return id;
	}
	public void setId(ActiviteId id) {
		this.id = id;
	}

	 public boolean equals(Object obj) {
	        if (obj == null) return false;
	        if (!this.getClass().equals(obj.getClass())) return false;
	        
	        Activite obj2 = (Activite)obj;

	        if (this.id==obj2.getId() &&
	            this.equipe.equals(obj2.getEquipe()) &&
	            this.niveau==obj2.getNiveau() &&
	            this.nom.equals(obj2.getNom())) {
	            return true;
	        }
	        
	    return false;
	    }

	    public int hashCode() {      
	        int tmp = 0;
	        // Method 1-Concatenate the strings
	        tmp = (id + equipe + niveau + nom).hashCode();

	        return tmp;
	    }
  

}
