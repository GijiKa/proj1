package ecole.pojo;

import java.io.Serializable;


public class ActiviteId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	//@Column(name = "NUM")
    private int niveau;

    //@Column(name = "INIT")
    private String nom;

    public ActiviteId(){}
    public ActiviteId(int niveau, String nom){
    	this.niveau= niveau;
    	this.nom= nom;
    }
	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public boolean equals(ActiviteId o){
		return this.niveau== o.getNiveau() && this.nom.equals(o.getNom());
		
	}
  
	public int hashCode(){
		return (niveau+nom).hashCode();
		
	}

}
