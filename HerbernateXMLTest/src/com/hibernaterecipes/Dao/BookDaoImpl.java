/**
 * 
 */
package com.hibernaterecipes.Dao;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;
import javax.transaction.UserTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Guruzu
 *
 */
public class BookDaoImpl implements BookDao {

	/* (non-Javadoc)
	 * @see com.hibernaterecipes.Dao.BookDao#saveBook(com.hibernaterecipes.Dao.Book)
	 */
	public void saveBook(Book book) throws NotSupportedException, SystemException, NamingException, Exception {
		System.out.println("Enter DAO Impl");
		Session session = null;
		UserTransaction tx = (UserTransaction)new InitialContext()
		.lookup("java:comp/UserTransaction");
		try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			tx.begin();
			session = factory.openSession();
			session.saveOrUpdate(book);
			//session.flush();
			tx.commit();
			
		}catch (RuntimeException e) {
			
			try
			{
				tx.rollback();
			}catch(RuntimeException ex)
			{
				System.out.println("**** RuntimeException in BookDaoImpl ");
			}
			throw e;
			
		}finally
		{
			//session.close();
		}		
	}
	
	public void save(Book book) {
		System.out.println("Enter DAO Impl");
		try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			Transaction tx = (Transaction) session.beginTransaction();
			
			session.saveOrUpdate(book);
			tx.commit();
			
		} catch (RuntimeException e) {
			System.out.println("**** RuntimeException in BookDaoImpl ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("**** Exception in BookDaoImpl ");
			e.printStackTrace();
		} finally
		{
			
		}		
	}

}
