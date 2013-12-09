package ecole.pojo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


import util.Encryption;

public class Eleve {

    private int  id;
    private String nom;
    private String prenom;
    private Date date_naiss;
    private int poids ;
    private int annee ;
    private String mdp;
    private String email;
    private int role ;
    private Set setcours;
    


    public Eleve() {}
    public Eleve(int id , String nom, String  prenom , Date date_naiss , int  poids , int annee ) 
    {
	this.id = id ;
	this.nom = nom ;
	this.prenom = prenom ;
	this.date_naiss = date_naiss;
	this.poids = poids ;
	this.annee  = annee ;
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
   //**************************


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    //*************************


    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date) {
        this.date_naiss = date;
    }

    //**************************
    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
   //**************************

    public int  getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		
		// ici cryptage du mot de passe mdp
       this.mdp= mdp;
        
   
       
		
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	public Set getSetCours() {
		return setcours;
	}
	public void setSetCours(Set cours) {
		this.setcours= cours;
	}
	 
}
