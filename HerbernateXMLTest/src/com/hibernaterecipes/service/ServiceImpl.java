/**
 * 
 */
package com.hibernaterecipes.service;

import javax.naming.NamingException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

import com.hibernaterecipes.Dao.Book;
import com.hibernaterecipes.Dao.BookDao;
import com.hibernaterecipes.Dao.BookDaoImpl;

/**
 * @author Guruzu
 *
 */
public class ServiceImpl implements Service{

	/* (non-Javadoc)
	 * @see com.hibernaterecipes.service.Service#saveBook(com.hibernaterecipes.Dao.Book)
	 */
	public void saveBook(Book book) {
		System.out.println("Enter saveBook Service");
		BookDao dao = new BookDaoImpl();
		try {
			dao.saveBook(book);
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End saveBook Service");
	}

}
