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
import ecole.pojo.Cours;

public class CoursDAO implements IDAO<Cours> {

	@Override
	public Cours find(Serializable id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	Transaction tx = null;
	Cours cours=null;
		
		try {
			tx = session.beginTransaction();
      cours =  (Cours) session.get(Cours.class, id);
        tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			
		}
		
		return cours;
	}

	@Override
	public Cours create(Cours obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Integer CoursID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         CoursID = (Integer) session.save(obj); 
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
	public Cours update(Cours obj) {
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
	public void delete(Cours obj) {
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
	

	public List<Cours> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Cours> cours = null;
		try {
			tx = session.beginTransaction();

			cours = session.createCriteria(Cours.class).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return cours;
	}

	
}
