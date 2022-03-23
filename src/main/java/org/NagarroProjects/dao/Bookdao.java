package org.NagarroProjects.dao;

import java.util.List;

import org.NagarroProjects.dto.Book;

public interface Bookdao {
	
    public List < Book > getBooks();

    public void saveBook(Book theBook);

    public Book getBook(int theBookCode);

    public void deleteBook(int theBookCode);
    
}