package ecole.pojo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import com.google.gson.annotations.Expose;

import util.Encryption;

public class Professeur  implements java.io.Serializable {

	@Expose
    private  int  id;
	@Expose
    private String nom ;
	@Expose
    private String  specialite;
	@Expose
    private Date date_entree ;
	@Expose
    private Date der_prom;
	@Expose
    private int salaire_base ;
	@Expose
    private int salaire_actuel ;
	@Expose
    private int role ;
	@Expose
    private String mdp;
	@Expose
    private String email;
    private Set<Cours> courses = new HashSet<Cours>(0);


    public Professeur() {
    	Locale.setDefault(Locale.US);
    }
	
 public Professeur(int id) {
     this.id = id;
 }
 public Professeur(int id, String nom, String specialite, Date date_entree, Date derProm, int salaire_base, int salaire_actuel, Set<Cours> courses) {
    this.id = id;
    this.nom = nom;
    this.specialite = specialite;
    this.date_entree = date_entree;
    this.der_prom = derProm;
    this.salaire_base = salaire_base;
    this.salaire_actuel = salaire_actuel;
    this.courses = courses;
 }
    
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
		this.mdp= mdp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Cours> getCourses() {
		return courses;
	}
	public void setCourses(Set<Cours> courses) {
		this.courses = courses;
	}
	
	public void addCours(Cours cours){
		this.courses.add(cours);
	}
	
	public void removeCours(Cours cours){
		Cours coursToRemove=cours;
		for (Cours c : this.courses) {
			if(c.getId()==cours.getId()){
				coursToRemove=c;
				break;
			}
		}
		this.courses.remove(coursToRemove);
		
	}

}
