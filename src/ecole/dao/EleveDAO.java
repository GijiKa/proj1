package ecole.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import util.HibernateUtil;
import ecole.idao.IDAO;
import ecole.pojo.Eleve;

public class EleveDAO implements IDAO<Eleve> {

	@Override
	public Eleve find(int id) {
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

}
