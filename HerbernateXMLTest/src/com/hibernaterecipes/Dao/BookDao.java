/**
 * 
 */
package com.hibernaterecipes.Dao;

import javax.naming.NamingException;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

/**
 * @author Guruzu
 *
 */
public interface BookDao {
	public void saveBook(Book book) throws NotSupportedException, SystemException, NamingException, Exception;

}
