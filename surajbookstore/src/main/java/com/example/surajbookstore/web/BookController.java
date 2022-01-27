package com.example.surajbookstore.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
public class BookController {
@RequestMapping(name="/index")
public String books() {
return "placeholder";
}
}
