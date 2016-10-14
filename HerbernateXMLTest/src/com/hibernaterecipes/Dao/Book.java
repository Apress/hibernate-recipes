package com.hibernaterecipes.Dao;

import java.util.Date;
import java.util.List;



public class Book {
	private long isbn;
	private String name;
	private Date publishDate;
	private int price;
	private Publisher publisher;
	private List chapters;

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return String
				.format(
						"Book [\t isbn=%s, \n\t name=%s, \n\t price=%s, \n\t publishDate=%s]",
						isbn, name, price, publishDate);
	}

	
	
	
	
}
