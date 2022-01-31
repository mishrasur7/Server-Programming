package com.example.Exercise22.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Exercise22.domain.Student;

@Controller
public class StudentController {
	@RequestMapping("/hello")
	public String studentList(Model model) {
		Student student1 = new Student("Kate", "Kole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1); 
		studentList.add(student2); 
		studentList.add(student3); 
		
		model.addAttribute("studentList", studentList); 
		return "studentlist";
	}

}
