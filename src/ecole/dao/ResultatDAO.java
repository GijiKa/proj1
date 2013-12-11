package ecole.dao;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Resultat;
import ecole.pojo.ResultatsId;

public class ResultatDAO implements IDAO<Resultat> {

	@Override
	public Resultat find(Serializable id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		Resultat resultat=null;
		try {
			tx = session.beginTransaction();
			// action
	      
			resultat=  (Resultat) session.get(Resultat.class,id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
		}
		return resultat;
	}

	@Override
	public Resultat create(Resultat obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ResultatsId ResultatID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         ResultatID = (ResultatsId) session.save(obj); 
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
	public Resultat update(Resultat obj) {
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
	public void delete(Resultat obj) {
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
}
