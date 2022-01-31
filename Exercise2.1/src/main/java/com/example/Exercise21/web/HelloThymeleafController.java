package com.example.Exercise21.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloThymeleafController {
 @RequestMapping("/hello")
public String greeting(@RequestParam("name") String name, @RequestParam("age") int age,  Model model) {
 model.addAttribute("name", name);
 model.addAttribute("age", age); 
 return "hellothymeleaf";
 }
}
