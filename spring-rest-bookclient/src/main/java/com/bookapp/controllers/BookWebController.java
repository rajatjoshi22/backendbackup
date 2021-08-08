package com.bookapp.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.reactive.function.client.WebClient;

import com.bookapp.model.Book;
import com.bookapp.model.User;

//@Controller
public class BookWebController {
	WebClient client=WebClient.create("http://localhost:8083");
	@GetMapping("/")
	public String homepage(Model model) {
	List<Book> bookList=client.get().uri("/Books").retrieve().bodyToFlux(Book.class).toStream().collect(Collectors.toList());
	model.addAttribute("bookList",bookList);
      return "home";
	}
 
	
	@GetMapping("/book-by-choice")
	public String bookByChoice(@RequestParam("choice")String choice,Model model) {
	List<Book> bookList=client.get().uri("/book-by-choice"+"?choice="+choice).retrieve().bodyToFlux(Book.class).toStream().collect(Collectors.toList());
	model.addAttribute("bookList",bookList);
	return "home";
		
	} 
	
//	@GetMapping("/loginForm")
//	public String loginForm() {
//		return "loginform";
//	}
//	
//	@PostMapping("/login")
//	public String login(@ModelAttribute User user,Model model) {
//		if(user.getLoginId().equals("admin")&&user.getPassword().equals("admin1234")) {
//            model.addAttribute("user",user);
//			return "adminpage";
//		}
//		model.addAttribute("message","Invalid Details!!!");
//		return "loginform";
//	}
	
	@GetMapping("addBookForm")
	public String addBookForm() {
		return "addbookform";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book book,Model model) {
		MultiValueMap<String,Object> paramMap= new LinkedMultiValueMap<String,Object>();
		paramMap.add("bookTitle",book.getBookTitle());
		paramMap.add("bookId",book.getBookId());
		paramMap.add("bookCategory",book.getBookCategory());
		paramMap.add("bookAuthor",book.getBookAuthor());
		paramMap.add("bookPrice",book.getBookPrice());
		String message=client.post().uri("/Book").body(paramMap,Book.class)
		model.addAttribute("message",message);
		return "adminpage";
	
	}

}
