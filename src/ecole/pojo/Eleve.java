package ecole.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.google.gson.annotations.Expose;

public class Eleve  implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Expose
	private int  id;
	@Expose
    private String nom;
	@Expose
    private String prenom;
	@Expose
    private Date date_naiss;
	@Expose
    private int poids ;
	@Expose
    private int annee ;
	@Expose
    private String mdp;
	@Expose
    private String email;
    private int role ; 
    
    private Set<Resultat> resultatses = new HashSet<Resultat>(0);

    public Eleve() {}
    public Eleve(int id , String nom, String  prenom , Date date_naiss , int  poids , int annee ,Set<Resultat> resultatses) 
    {
	this.id = id ;
	this.nom = nom ;
	this.prenom = prenom ;
	this.date_naiss = date_naiss;
	this.poids = poids ;
	this.annee  = annee ;
	this.resultatses = resultatses;
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
	

	public Set<Resultat> getResultatses() {
		return resultatses;
	}
	public void setResultatses(Set<Resultat> resultatses) {
		this.resultatses = resultatses;
	}
	
	public void addResultat(Resultat resultat){
		this.resultatses.add(resultat);
	}
	
	public void removeResultat(Resultat resultat){
		this.resultatses.remove(resultat);
	}
	 
}
