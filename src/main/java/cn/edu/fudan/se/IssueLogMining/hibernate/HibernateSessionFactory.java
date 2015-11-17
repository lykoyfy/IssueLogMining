package cn.edu.fudan.se.IssueLogMining.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static final SessionFactory sessionFactory;
	public static final ThreadLocal<Session> session = new ThreadLocal<Session>();  
		
	static {
		try {
			Configuration cfg = new Configuration().configure();
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
			                    .applySettings(cfg.getProperties()).build();
			sessionFactory = cfg.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session currentSession() throws HibernateException {
		Session s = (Session) session.get();
		if (s == null) {
			s = sessionFactory.openSession();
			session.set(s);
		}
		return s;
	}

	public static void closeSession() throws HibernateException {
		Session s = (Session) session.get();
		if (s != null)
			s.close();
		session.set(null);
	}
	
	public static void closeFacotry(){
		sessionFactory.close();
	}
}
