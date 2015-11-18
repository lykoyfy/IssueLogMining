package cn.edu.fudan.se.IssueLogMining.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateUtil {
	
	@SuppressWarnings("unchecked")
	public <T> List<T> query(String hql){
		Session session = HibernateSessionFactory.currentSession();
		
		Query query = session.createQuery(hql);
		List<T> ret = (List<T>)query.list();
		return ret;
	}
	
	public <T> void save(List<T> list){
		Session session = HibernateSessionFactory.currentSession();
		Transaction tran = session.beginTransaction();
		for(T t:list){
			session.save(t);
		}
		tran.commit();
	}
	
	public <T> void delete(List<T> list){
		Session session = HibernateSessionFactory.currentSession();
		Transaction tran = session.beginTransaction();
		
		for(T t:list){
			session.delete(t);
		}
		
		tran.commit();
		
	}
	
	public void closeSession(){
		HibernateSessionFactory.closeSession();
	}
	
	public void closeFactory(){
		HibernateSessionFactory.closeFacotry();
	}
}
