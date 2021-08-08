package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.model.User;

@Controller
public class BookController {

	@Autowired
	RestTemplate restTemplate;
	
	public static final String BASEURL="http://localhost:8083";
	
	@GetMapping("/")
	public String homepage(@ModelAttribute("message")String message,ModelMap model) {
		String url=BASEURL+"/Books";
		ResponseEntity<?> entity=restTemplate.getForEntity(url,List.class);
		model.addAttribute("bookList",entity.getBody());
		model.addAttribute("message",message);
		return "home";
	}
	
	@GetMapping("/home")
	public String home(){
		return "redirect:/";
	}
	@GetMapping("/book-by-choice")
	public String bookByChoice(@RequestParam("choice")String choice,Model model) {
		String url=BASEURL+"/book-by-choice"+"?choice="+choice;
		ResponseEntity<?> entity=restTemplate.getForEntity(url,List.class);
		model.addAttribute("bookList",entity.getBody());
		return "home";
		
	} 
	
	
	@GetMapping("addBookForm")
	public String addBookForm() {
		return "addbookform";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book book,Model model) {
		String url=BASEURL+"/Book";
		MultiValueMap<String,Object> paramMap= new LinkedMultiValueMap<String,Object>();
		paramMap.add("bookTitle",book.getBookTitle());
		paramMap.add("bookId",book.getBookId());
		paramMap.add("bookCategory",book.getBookCategory());
		paramMap.add("bookAuthor",book.getBookAuthor());
		paramMap.add("bookPrice",book.getBookPrice());
		String result=restTemplate.postForObject(url, paramMap, String.class);
		model.addAttribute("message",result);
		return "adminpage";
		
	
	}
	
	@PostMapping("/viewbook")
	public String viewBook(@RequestParam("bookId")Integer bookId,Model model) {
		String url=BASEURL+"/getById?bookId="+bookId;
		Book book=restTemplate.getForObject(url,Book.class);
		model.addAttribute("book",book);
		return "viewbookpage";
	}
	
	@GetMapping("/updateBookForm")
	public String updateBookForm() {
		return "updatebookform";
	}
	
	
	@PostMapping("/updateBook")
	public String getById(@RequestParam("bookId")Integer bookId,Model model) {
		String url=BASEURL+"/getById?bookId="+bookId;
		Book book=restTemplate.getForObject(url,Book.class);
		model.addAttribute("book",book);
		return "editbookform";
		
	}
	
	
	
	@PostMapping("/editBook")
	public String updateBook(@ModelAttribute Book book,Model model) {
		String url=BASEURL+"/Book";
		MultiValueMap<String,Object> paramMap= new LinkedMultiValueMap<String,Object>();
		paramMap.add("bookTitle",book.getBookTitle());
		paramMap.add("bookId",book.getBookId());
		paramMap.add("bookCategory",book.getBookCategory());
		paramMap.add("bookAuthor",book.getBookAuthor());
		paramMap.add("bookPrice",book.getBookPrice());
		restTemplate.put(url, paramMap);
		return "adminpage";
		
	
	}
	
	@GetMapping("/deleteBookForm")
	public String deleteBookForm() {
		return "deletebookform";
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam("bookId")Integer bookId,Model model) {
		
		String url=BASEURL+"/Book?bookId="+bookId;
		restTemplate.delete(url);
		return "adminpage";
	
	}
	
}
