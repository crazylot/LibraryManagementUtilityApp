package org.NagarroProjects.daoImp;

import org.NagarroProjects.dao.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoImp implements Dao {

	
	private Configuration con = new Configuration().configure("hibernate.cfg.xml");
	private SessionFactory sessionFactory = con.buildSessionFactory(); //one session factory object created
	private Session session;

	public Session getSession() {
		return session;

	}

	public void begin() {	
		session = sessionFactory.openSession();
		session.beginTransaction();

	}

	public void commit() {	
		session.getTransaction().commit();

	}

	public void close() {	
		session.close();

	}

	public void rollback() {
		session.getTransaction().rollback();

	}

}
