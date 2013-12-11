package ecole.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Cours;
import ecole.pojo.Eleve;
import ecole.pojo.Resultat;

import java.util.HashSet;
import java.util.Set;

public class EleveDAO implements IDAO<Eleve> {

	@Override
	public Eleve find(Serializable id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Eleve eleve = null;

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			// action

			eleve = (Eleve) session.get(Eleve.class, id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return eleve;
	}
	 
	
	public  Set<Resultat>   getAllCoursById(Eleve obj)
	{
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Eleve eleve = null;
		   List<Cours> lc ;
		
		   
		   Set<Resultat>  res=null;
	 
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			  res =obj.getResultatses();

			tx.commit();
			
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return res;
		
		
		
		
	}
		
	
	
	@Override
	public Eleve create(Eleve obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Integer eleveID = null;
		Transaction tx = null;
		Eleve objResult = null;
		try {
			tx = session.beginTransaction();
			// action

			eleveID = (Integer) session.save(obj);
			objResult = (Eleve) session.get(Eleve.class, eleveID);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}
		return objResult;
	}

	@Override
	public Eleve update(Eleve obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(obj);
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
	public void delete(Eleve obj) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(obj);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

	}

	public Eleve getByEmail(String email) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		session.beginTransaction();
		Criteria criteria = session.createCriteria(Eleve.class).add(
				Restrictions.eq("email", email));
		return (Eleve) criteria.uniqueResult();
	}

	public List<Eleve> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Eleve> eleves = null;
		try {
			tx = session.beginTransaction();

			eleves = session.createCriteria(Eleve.class).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return eleves;
	}
	public List<Resultat> getAllResultats(int id_eleve) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Resultat> res = null;
		try {
			tx = session.beginTransaction();

			res = (List<Resultat>) session
					.createQuery(
							"select eleve.resultatses from Eleve eleve where "+id_eleve+"=eleve.id")
					.list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return res;
	}


}
