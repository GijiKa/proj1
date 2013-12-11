package ecole.dao;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Activite;

public class ActiviteDAO implements IDAO<Activite> {

	@Override
	public Activite find(Serializable id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Activite Activite =  (Activite) session.get(Activite.class, id);
		return Activite;
	}

	@Override
	public Activite create(Activite obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Integer ActiviteID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         ActiviteID = (Integer) session.save(obj); 
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
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
	         session.close(); 
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
	         session.close(); 
	      }
		
	}


	

}
