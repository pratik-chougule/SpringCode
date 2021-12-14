package com.RestApi.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.model.Book;
import com.RestApi.service.BookService;

@RestController
public class BookController {
	
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		return this.bookService.getAllBooks();
	}
	
	
	  @GetMapping("/books{id}") 
	  public Book getBook(@PathVariable("id") int id) {
	  
	  return this.bookService.getBookById(id);
	  }
	 
	  @PostMapping("/addBook")
       public Book addBook(@RequestBody Book book) {
    	   
		Book b = this.bookService.addBook(book);
		  
		  return b;
       }
}
