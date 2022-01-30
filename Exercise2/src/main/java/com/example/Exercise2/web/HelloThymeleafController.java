package com.example.Exercise2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleafController {

@RequestMapping("hello") 
public String helloThymeleaf(@RequestParam String name, int age) {
	return "hellothymeleaf"; 
}
	

}
