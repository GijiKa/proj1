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
import ecole.pojo.Activite;
import ecole.pojo.Activite;
import ecole.pojo.ActiviteId;
import ecole.pojo.Cours;

public class ActiviteDAO implements IDAO<Activite> {

	@Override
	public Activite find(Serializable id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	Transaction tx = null;
	Activite activites=null;
		
		try {
			tx = session.beginTransaction();
      activites =  (Activite) session.get(Activite.class, id);
        tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			
		}
		
		return activites;
	}

	@Override
	public Activite create(Activite obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ActiviteId ActiviteID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         ActiviteID = (ActiviteId) session.save(obj); 
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
	public Activite update(Activite obj) {
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
	public void delete(Activite obj) {
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
	public List<Activite> getAll() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		List<Activite> activites = null;
		try {
			tx = session.beginTransaction();

			activites = session.createCriteria(Activite.class).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}

		return activites;
	}


	

}
