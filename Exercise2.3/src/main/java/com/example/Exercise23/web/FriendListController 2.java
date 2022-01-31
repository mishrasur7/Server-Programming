package com.example.Exercise23.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Exercise23.model.Student;

@Controller
public class FriendListController {
	@RequestMapping("/index") 
	public String studentList(Model model) {
		Student student1 = new Student("John Waste"); 
		Student student2 = new Student("Kate Bower"); 
		Student student3 = new Student("Mary Smith"); 
		
		ArrayList<Student> students = new ArrayList<Student>(); 
		
		students.add(student1); 
		students.add(student2); 
		students.add(student3); 
		
		model.addAttribute("students", students); 
		return "studentlist"; 
	}

}
