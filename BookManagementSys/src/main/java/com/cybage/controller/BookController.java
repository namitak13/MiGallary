package com.cybage.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Book;
import com.cybage.service.BookService;


@Controller
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/getAllBooks")
	public ModelAndView getAllBooks(@RequestParam("keyword") String keyword){
		
		List<Book> bookList=  bookService.getAllBooks();
		return new ModelAndView("displayAll", "bookList", bookList);
	}
	
	@GetMapping("/addBook")
	public String showAddBook(Model model){
		model.addAttribute("book",new Book());
		return "addBook";
	}
	
	@PostMapping("/addBook")
	public ModelAndView addBook(@Valid @ModelAttribute("book") Book book, BindingResult erBindingResult){
		if(erBindingResult.hasErrors()){
			return new ModelAndView("addBook", "book", book);
		}
		
		bookService.addBook(book);
		List<Book> bookList = bookService.getAllBooks();
		return new ModelAndView("displayAll", "bookList", bookList);
	}
	
	@GetMapping("/edit/{id}")
	public String editEmployee(@PathVariable int id, Model model){
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "updateBook";
	}
	
	@PostMapping("/edit")
	public ModelAndView editEmployee(@Valid @ModelAttribute("book") Book book, BindingResult erBindingResult, Model model)
	{
		List<Book> bookList = bookService.getAllBooks();
		if(erBindingResult.hasErrors()){
			return new ModelAndView("updateBook","bookList", bookList );
		}else{
			System.out.println(book.getId());
			bookService.editBook(book);
		
			return new ModelAndView("displayAll","bookList", bookList );
		}
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteBook(@PathVariable int id, Model model){
		List<Book> bookList = bookService.getAllBooks();
		Book book = bookService.getBookById(id);
		boolean isDeleted = bookService.deleteBook(book);
		if(isDeleted == true){
			return new ModelAndView("displayAll","bookList", bookList );
		}
		model.addAttribute("book", bookService.getAllBooks());
		return new ModelAndView("displayAll","bookList", bookList );
	}
}
