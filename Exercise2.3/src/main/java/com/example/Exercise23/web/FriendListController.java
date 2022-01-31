package com.example.Exercise23.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendListController {
	@RequestMapping("/index") 
	public String studentList(Model model) {
		
		return "studentlist"; 
	}

}
