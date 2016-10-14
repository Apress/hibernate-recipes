/**
 * 
 */
package com.hibernaterecipes.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Guruzu
 *
 */
public class HibernateUtil {
	
	private HibernateUtil(){}
	
	public static SessionFactory getSessionFactory()
	{
		SessionFactory factory = null;;
		try {
			
			factory = new Configuration().configure().buildSessionFactory();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return factory;		
	}
}
