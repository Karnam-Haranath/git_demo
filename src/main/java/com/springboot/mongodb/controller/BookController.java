package com.springboot.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongodb.model.Book;
import com.springboot.mongodb.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		
		bookRepository.save(book);
		return "Added successfully";
	}
	
	@GetMapping("/getBooks")
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}

}
