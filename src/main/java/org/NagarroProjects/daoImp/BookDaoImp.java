package org.NagarroProjects.daoImp;

import java.util.List;

import org.NagarroProjects.dao.Bookdao;
import org.NagarroProjects.dao.Dao;
import org.NagarroProjects.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;


public class BookDaoImp implements Bookdao {
	
	@Autowired
	private Dao dao;

	@Override
	public List<Book> getBooks() {
		dao.begin();
		List<Book> listOfBooks = dao.getSession().createQuery("from Book").list();
		dao.commit();
		dao.close();
		return listOfBooks;
	}

	@Override
	public void saveBook(Book theBook) {
		dao.begin();
		dao.getSession().save(theBook);
		dao.commit();
		dao.close();
		
	}

	@Override
	public Book getBook(int theBookCode) {
		dao.begin();
		Book theBook =dao.getSession().get(Book.class,theBookCode);
		dao.commit();
		dao.close();
		return theBook;
	}

	@Override
	public void deleteBook(int theBookCode) {
		dao.begin();
		Book book = (Book) dao.getSession().byId(Book.class).load(theBookCode);
		dao.getSession().delete(book);
		dao.commit();
		dao.close();
        
		
	}

}
