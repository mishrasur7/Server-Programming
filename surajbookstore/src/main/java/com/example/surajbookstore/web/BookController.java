package com.example.surajbookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.surajbookstore.model.Book;
import com.example.surajbookstore.model.BookRepository;

@Controller
@ResponseBody
public class BookController {
	@Autowired
	private BookRepository repository; 
	
	@GetMapping("/index")
	public String books() {
		List<Book> books = repository.findByTitle(null); 
		return "placeholder";
	}
}
