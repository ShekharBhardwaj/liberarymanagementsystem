package com.nerdbot.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nerdbot.lms.model.Books;
import com.nerdbot.lms.service.BookService;

@RestController
public class BooksController {

	@Autowired
	BookService bookService;

	@RequestMapping("/getallbooks")
	public List<Books> home(Model model) {

		List<Books> books = bookService.findAll();

		model.addAttribute("books", books);

		return books;
	}
	
	@RequestMapping(value = "/addbook",headers = {
    "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void addBook(@RequestBody Books book) {
		bookService.saveABook(book);
		
	}
	
	
	@RequestMapping("/getbyname")
	public List<Books> getBookByName(@RequestParam(value="bookName", defaultValue="all") String bookName) {
		return bookService.findByBookName(bookName);
	}
	
	

}
