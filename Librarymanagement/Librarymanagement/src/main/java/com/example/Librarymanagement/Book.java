package com.example.Librarymanagement;

import jakarta.persistence.Entity;

@Entity
public class Book {
	
	@jakarta.persistence.Id
	private String bookid;
	
	private String quantity;
	private String bookname;
	private String genre;
	
	public Book() {}
	
	public Book(String bookid, String quantity, String bookname, String genre) {
		super();
		this.bookid = bookid;
		this.quantity = quantity;
		this.bookname = bookname;
		this.genre = genre;
	}



	public String getBookId() {
		return bookid;
	}

	public void setBookId(String bookid) {
		this.bookid = bookid;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}



	public String getBookName() {
		return bookname;
	}



	public void setBookName(String bookName) {
		bookname = bookName;
	}



	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

}
