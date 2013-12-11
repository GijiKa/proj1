package ecole.pojo;

public class ResultatsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Eleve eleve;
	private int id_cours;

	public ResultatsId() {
	}

	public ResultatsId(Eleve eleve, int id_cours) {
		this.eleve = eleve;
		this.id_cours = id_cours;
	}

	public Eleve getEleve() {
		return this.eleve;
	}

	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	public int getId_cours() {
		return this.id_cours;
	}

	public void setId_cours(int id_cours) {
		this.id_cours = id_cours;
	}

	public boolean equals(Object obj) {
		if (this == obj)
				      return true;
				   if (obj == null)
				      return false;
				   if (getClass() != obj.getClass())
				      return false;
				   ResultatsId other = (ResultatsId) obj;
				   if (id_cours!=other.id_cours)
				         return false;
				   if (eleve == null) {
				      if (other.eleve != null)
				         return false;
				      } else if (!eleve.equals(other.eleve))
				         return false;
				 
				   return true;
				  
	}

	public int hashCode() {
		final int prime = 31;
			   int result = 1;
			   result = prime * result + id_cours;
			   result = prime * result + ((eleve == null) ? 0 : eleve.hashCode());
			   return result;
	}

}
