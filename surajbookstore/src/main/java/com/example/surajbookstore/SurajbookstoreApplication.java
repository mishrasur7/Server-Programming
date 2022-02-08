package com.example.surajbookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.surajbookstore.model.Book;
import com.example.surajbookstore.model.BookRepository;

@SpringBootApplication
public class SurajbookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurajbookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner studentDemo(BookRepository repository) {
		return (args) -> {
			System.out.println("save a couple of students");
			repository.save(new Book("Introduction to Spring Boot", "Jukka", 2000, "ISBN123456", 23.34));
			repository.save(new Book("Introduction to React", "Juha", 2001, "ISBN123321", 22.99));	
			
			System.out.println("fetch all students");
			for (Book book : repository.findAll()) {
				System.out.println(book.toString());
			}

		};
	}

}
