package com.example.Librarymanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	@Autowired
	private BookRepository bookrepository;
	
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		return bookrepository.findAll();
	}
	
	@GetMapping("/getByType")
	public List<Book> getGenre(@RequestParam String genre){
		return bookrepository.findByGenre(genre);
	}
	
	@GetMapping("/savebook")
	@ResponseBody
	public String addBook() {
		
		String bookid = "12212";
		String quantity = "7";
		String bookname = "Harry Potter";
		String genre = "Fantasy Series";
		
		Book cout = new Book(bookid,quantity,bookname,genre);
		bookrepository.save(cout);
		System.out.println("----------All Data saved into Database--------------");
		return "[{status:inserted}]";
	}
	
	@GetMapping("/editbook")
	public String updateBook(@RequestParam String bookid) {
		String quantity = "6";
		String bookname = "Harry Potter";
		String genre = "Fantasy Series";
		
		Book cout = new Book(bookid,quantity,bookname,genre);
		bookrepository.save(cout);
		return "[{status:edited}]";
	}
	
	@GetMapping("/deletebook")
	public String deleteByBookid(@RequestParam String bookid) {
		System.out.println("bookid"+bookid);
		try {
       bookrepository.deleteByBookid(bookid);
		}catch(Exception ex) {
			System.out.println(ex);
		}
       return "[{status:edited}]";
	}
	
}
