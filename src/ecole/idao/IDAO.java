package ecole.idao;

import java.io.Serializable;

public interface IDAO<T> {
	public abstract T find(Serializable id);

	/**
	 * Permet de créer une entrée dans la base de données par rapport à un objet
	 * 
	 * @param obj
	 */
	public abstract T create(T obj);

	/**
	 * Permet de mettre à jour les données d'une entrée dans la base
	 * 
	 * @param obj
	 */
	public abstract T update(T obj);

	/**
	 * Permet la suppression d'une entrée de la base
	 * 
	 * @param obj
	 */
	public abstract void delete(T obj);
}
