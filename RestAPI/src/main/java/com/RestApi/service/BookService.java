package com.RestApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RestApi.model.Book;

@Service
public class BookService {

	
	
	  private static List<Book> list = new ArrayList<>();
	  
	  static {
	   
		  list.add(new Book(11,"JavaGuide","Pratik"));
		  list.add(new Book(12,"JavaSpringbootde","samir"));
		  list.add(new Book(13,"python","Sagarika"));
	  }
	  
	  public List<Book> getAllBooks(){
		  return list;
	  }
	  
	  
	  
	  public Book getBookById(int id) {
		 
		 
		
		Book book = list.stream().filter(e->e.getId()==id).findFirst().get();
		
		
		  
		  return book;
	  }
	  
	  public Book addBook(Book b) {
		  
		  list.add(b);
		  return b;
	  }
	 
}
