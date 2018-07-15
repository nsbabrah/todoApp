package com.example.demo.web.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LoginController {
	

	  @GetMapping("/login")
	    public String Login(Model model) {
	     	
	        return "login";
	    }  
	  @GetMapping("/signup")
	    public String Signup(Model model) {
	     	
	        return "signup";
	    }
	
	
	}
	
