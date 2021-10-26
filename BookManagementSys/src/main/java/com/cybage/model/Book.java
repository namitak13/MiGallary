package com.cybage.model;

import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	int id;
	@NotBlank(message="Title should not be empty")
	String title;
	@NotBlank(message="Author should not be empty")
	String author;
	@NotBlank(message="Publisher should not be empty")
	String publisher;

	public Book(){
		
	}
	public Book(int id, String title, String author, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	
}
