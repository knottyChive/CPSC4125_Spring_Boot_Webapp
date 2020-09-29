package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import com.example.springboot.Contact;

@Controller
public class HelloController {

	// @GetMapping("/")
	// public String index() {
	// 	return "Greetings from Spring Boot!";
    // }
    
    @GetMapping("/")
	public String greeting( @RequestParam(name="name", required=false, defaultValue="World") String name, Model model ) {
		model.addAttribute("name", name);
		return "greeting";
	}

    @GetMapping("/contact")
    public String contact( Model model ) {
        return "contact";
    }
    
    @GetMapping("/about")
    public String about( Model model ) {
        return "about";
    }

    @PostMapping("/contact")
    public String postContact( Model model, @RequestBody Contact contact ) {
        model.addAttribute("email", contact.getEmail());
        model.addAttribute("message", contact.getMessage());
        return "fragments/contactResponse :: #contactSuccess";
    }

    @PostMapping("/blog")
    public String postBlog( Model model, @RequestBody BlogEntry entry ) {
        model.addAttribute("author", entry.getAuthor());
        model.addAttribute("message", entry.getMessage());

        System.out.println(entry.getAuthor());
        System.out.println(entry.getMessage());
        return "fragments/blogThing :: #response";
    }

    @GetMapping("/blog")
    public String blog( Model model ) {
        return "blog";
    }
}
