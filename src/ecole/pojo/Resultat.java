package ecole.pojo;

import java.util.*;

import com.google.gson.annotations.Expose;

public class Resultat implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResultatsId id;
	@Expose
	private int id_cours;
	@Expose
	private int id_eleve;
	@Expose
	private int note;

	public Resultat() {
	}

	public Resultat(ResultatsId id, Eleve eleves, Cours cours) {
		this.id = id;

	}

	public Resultat(ResultatsId id, int points) {
		this.id = id;

		this.note = points;
	}

	public int getId_cours() {
		return id.getId_cours();
	}

	public void setId_cours(int id_cours) {
		this.id_cours = id_cours;
	}

	public int getId_eleve() {
		return id_eleve;
	}

	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}
	
	public ResultatsId getId() {
		return this.id;
	}

	public void setId(ResultatsId id) {
		this.id = id;
		this.id_cours = id.getId_cours();
		this.id_eleve=id.getEleve().getId();
	}

	public int getNote() {
		return this.note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}