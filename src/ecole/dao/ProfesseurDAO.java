package ecole.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Professeur;
import ecole.pojo.Professeur;


public class ProfesseurDAO implements IDAO<Professeur> {

	@Override
	
		public Professeur find(int id) {
			// TODO Auto-generated method stub
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			Professeur professeur = null;

			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				// action

				professeur = (Professeur) session.get(Professeur.class, id);
				tx.commit();
			} catch (HibernateException e) {
				if (tx != null)
					tx.rollback();
				e.printStackTrace();
			} finally {
			}

			return professeur;
		}
	

	@Override
	public Professeur create(Professeur obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Integer ProfesseurID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         ProfesseurID = (Integer) session.save(obj); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			
		}
		return obj;
	}

	@Override
	public Professeur update(Professeur obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
			 session.update(obj); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         
	      }
		return obj;
	}

	@Override
	public void delete(Professeur obj) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
			 session.delete(obj); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	          
	      }
		
	}

	public Professeur getByEmail(String email) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		Criteria criteria = session.createCriteria(Professeur.class).add(
				Restrictions.eq("email", email));
		return (Professeur) criteria.uniqueResult();
	}
	public List<Professeur> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Professeur> professeurs = null;
		try {
			tx = session.beginTransaction();

			professeurs = session.createCriteria(Professeur.class).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return professeurs;
	}
	

}
