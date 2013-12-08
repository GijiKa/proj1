package ecole;

import java.util.*;

public class Professeurs {

    private  int  id;
    private String nom ;
    private String  specialite;
    private Date date_entree ;
    private Date der_prom;
    private int salaire_base ;
    private int salaire_actuel ;
    private int role ;
    private String mdp;
    private String email;


    public Professeurs() {}
     public Professeurs(int  id , String nom , String specialite , Date date_entree , Date der_prom ,  int salaire_base , int salaire_actuel ) {}

    
    public int getId() {
        return id;
    }

    public void setId( int id) {
        this.id = id;
    }
	//***********

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
	//***************

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
	//************
    public Date getDate_entree() {
        return date_entree;
    }

    public void setDate_entree(Date  date_entree) {
        this.date_entree = date_entree;
    }
	//**************
    public Date getDer_prom() {
        return der_prom;
    }

    public void setDer_prom(Date  der_prom) {
        this.der_prom = der_prom ;
    }
    
    
    //***********************
    public  int getSalaire_base() {
        return salaire_base;
    }

    public void setSalaire_base( int  salaire_base) {
        this.salaire_base = salaire_base;
    }
	//***********

       public  int getSalaire_actuel() {
        return salaire_actuel;
    }

    public void setSalaire_actuel( int  salaire_actuel) {
        this.salaire_actuel = salaire_actuel;
    }
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
