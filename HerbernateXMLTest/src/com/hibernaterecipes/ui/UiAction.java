/**
 * 
 */
package com.hibernaterecipes.ui;

import java.util.Date;

import com.hibernaterecipes.Dao.Book;
import com.hibernaterecipes.service.Service;
import com.hibernaterecipes.service.ServiceImpl;

/**
 * @author Guruzu
 *
 */
public class UiAction {
	
	public void execute()
	{
		Service service = new ServiceImpl();
		Book book = new Book();
		book.setName("Hibernate Recipes 1");
		book.setPrice(45);
		book.setPublishDate(new Date());
		service.saveBook(book);
		System.out.println("invoked uiaction ");
	}
}
