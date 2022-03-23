package org.NagarroProjects.controller;

import java.util.List;

import org.NagarroProjects.dto.Book;
import org.NagarroProjects.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/book")
public class RESTAPIController {
	
	@Autowired
	private BookService bookservice;
	
	/*---get a single book---*/
	@RequestMapping(value = "/{bookcode}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Book> getBook(@PathVariable("bookcode") int bookcode) {		
        Book book = bookservice.getBook(bookcode);
        return ResponseEntity.ok().body(book);
    }
	
    /*---get all books---*/
	@RequestMapping(value = "/allbooks",method = RequestMethod.GET)
	public ResponseEntity<List<Book>> getBooks() {
		List<Book> list =bookservice.getBooks();
        return ResponseEntity.ok().body(list);
    }	
	
	/*---save the book---*/
	@RequestMapping(value = "/savebook",method = RequestMethod.POST)
	public ResponseEntity<?> saveBook(@RequestBody Book theBook)
	{
		bookservice.saveBook(theBook);
		return ResponseEntity.ok().body("Your Book is Saved");
	}
	
	/*---Delete the book---*/
	@DeleteMapping(value = "/delete/{bookcode}")
	public ResponseEntity<?> DeleteBook(@PathVariable("bookcode") int bookcode)
	{
		bookservice.deleteBook(bookcode);
		return ResponseEntity.ok().body("Your Book is Deleted");
	}
	
}
