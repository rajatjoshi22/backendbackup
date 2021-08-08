package com.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService service;
	
	
	@GetMapping("/")
	public String home(Model model) {
		List<Book> bookList=service.getAllBooks();
		model.addAttribute("bookList",bookList);
		return "home";
	}
	@GetMapping("/home")
	public String homePage() {
		return "redirect:/";
	}
	@GetMapping("/addBookForm")
	public String addBookForm() {
		return "addbookform";
	}
	@GetMapping("/deleteBookForm")
	public String deleteBookForm() {
		return "deletebookform";
	}
	@GetMapping("/updateBookForm")
	public String updateBookForm() {
		return "updatebookform";
	}
	
	@PostMapping("/addBook")
	public String addBook(@ModelAttribute Book book,BindingResult result,Model model) {
		if(result.hasErrors()) {
			System.out.println(result.getAllErrors());
			model.addAttribute("message","adding failure");
			return "addbookform";
		}
		service.addBook(book);
		model.addAttribute("message","book added Successfully!!!!");
		return "adminpage";
		
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam("bookId")Integer bookId ,BindingResult res,Model model) {
		if(res.hasErrors()) {
			System.out.println(res.getAllErrors());
			model.addAttribute("message","Invalid Entry plzz type Integer Id");
			return "deletebookform";
		}
		int result=service.deleteBook(bookId);
		if(result==0) {
			model.addAttribute("message","No book with this Id");
			return "deletebookform";
		}
		model.addAttribute("message","book deleted Successfully");
		return "adminpage";
	}
	@PostMapping("/updateBook")
	public String updateBook(@RequestParam("bookId")Integer bookId,Model model) {
		Book book=service.getById(bookId);
		if(book==null) {
			model.addAttribute("message","No book with this Id");
			return "updatebookform";
		}
		model.addAttribute("book",book);
		return "editbookform";
		
	}
	@PostMapping("/editBook")
	public String editBook(@RequestParam("bookId")Integer bookId,@RequestParam("bookPrice")Double bookPrice,Model model) {
		service.updateBook(bookId, bookPrice);
		model.addAttribute("message","Book Updated successfully!!!");
		return "adminpage";
		
	}
	@PostMapping("/choice")
	public String choiceBook(@RequestParam("choice") String choice,Model model) {
		List<Book> bookList=service.getByChoice(choice);
		if(bookList.isEmpty()) {
			model.addAttribute("errormessage","No books found");
			return "home";
		}
		model.addAttribute("bookList",bookList);
		return "home";
	}
	@PostMapping("/viewbook")
	public String viewBook(@RequestParam("bookId")Integer bookId,Model model) {
		Book book=service.getById(bookId);
		model.addAttribute("book",book);
		return "viewbookpage";
	}
	
	@PostMapping("/userviewbook")
	public String userviewBook(@RequestParam("bookId")Integer bookId,Model model) {
		Book book=service.getById(bookId);
		model.addAttribute("book",book);
		return "userviewbook";
	}
}
