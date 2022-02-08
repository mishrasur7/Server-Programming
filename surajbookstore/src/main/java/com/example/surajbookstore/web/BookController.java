package com.example.surajbookstore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.surajbookstore.model.Book;
import com.example.surajbookstore.model.BookRepository;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository; 
	
	@RequestMapping("/booklist")
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll()); 
		return "booklist";
	}
}
