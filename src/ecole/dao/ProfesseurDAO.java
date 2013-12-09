package ecole.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Professeur;

public class ProfesseurDAO implements IDAO<Professeur>{

	@Override
	public Professeur find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur create(Professeur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur update(Professeur obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Professeur obj) {
		// TODO Auto-generated method stub
		
	}
	
	public Professeur getByEmail(String email){
		Session session = HibernateUtil.getSessionFactory()
				.getCurrentSession();

		session.beginTransaction();
		Criteria criteria = session.createCriteria(Professeur.class)
				.add(Restrictions.eq("email", email));
		return (Professeur)criteria.uniqueResult();
	}
}
