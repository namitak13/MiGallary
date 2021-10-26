package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Book;


@Service
public class BookService {

	public List<Book> bookList;
	
	public BookService(){
		bookList = new ArrayList<Book>();
		bookList.add(new Book(1, "Wild Things", "Clay carmichael", "Clay"));
		bookList.add(new Book(2, "The Crossover", "K Alexander", "Alexander"));
		bookList.add(new Book(3, "Beyond the bright sea", "Lauren Wolk", "Robb White"));
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookList;
	}
	
	public void addBook(Book book) {
		bookList.add(book);
		
	}
	
	public Book getBookById(int id){
		Book book = new Book();
		for(Book b : bookList){
			if(b.getId() == id){
				book = b;
				break;
			}
		}
		return book;
	}

	public void editBook( Book book) {
		// TODO Auto-generated method stub
		int index = getIndexBook(book.getId());
		bookList.set(index, book);
	}
	public boolean deleteBook(Book book){
		int index = getIndexBook(book.getId());
		bookList.remove(index);
		return true;
	}
	
	private int getIndexBook(int id) {
		Book book = null;
		for(Book b:bookList){
			if(b.getId()== id){
				book = b;
				break;
			}
		}
		return bookList.indexOf(book);
	}
}
