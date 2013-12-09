package ecole.dao;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Resultat;

public class ResultatDAO implements IDAO<Resultat> {

	@Override
	public Resultat find(long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Resultat Resultat =  (Resultat) session.get(Resultat.class, id);
		return Resultat;
	}

	@Override
	public Resultat create(Resultat obj) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Integer ResultatID = null;
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			// action
	      
	         ResultatID = (Integer) session.save(obj); 
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
	         session.close(); 
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
	         session.close(); 
	      }
		
	}


	

}
