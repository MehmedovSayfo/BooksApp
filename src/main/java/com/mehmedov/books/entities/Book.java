package com.mehmedov.books.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	
	private String author;
	
	private String publisher;
	
	private int releasedYear;
	
	
	public Book() {}
	
	public Book(int id, String title, String author, String publisher, int releasedYear) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.releasedYear = releasedYear;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public int getReleasedYear() {
		return releasedYear;
	}
	
	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
}
