package org.NagarroProjects.service;

import java.util.List;

import org.NagarroProjects.dao.Bookdao;
import org.NagarroProjects.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImp implements BookService{
	 @Autowired
	 private Bookdao bookdao;

	@Override
	public List<Book> getBooks() {
		return bookdao.getBooks();
	}

	@Override
	public void saveBook(Book theBook) {
		bookdao.saveBook(theBook);
		
	}

	@Override
	public Book getBook(int theBookCode) {
		return bookdao.getBook(theBookCode);
	}

	@Override
	public void deleteBook(int theBookCode) {
		bookdao.deleteBook(theBookCode);
		
	}

}


