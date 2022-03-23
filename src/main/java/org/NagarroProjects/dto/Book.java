package org.NagarroProjects.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookCode")
    private int bookcode;

    @Column(name = "Book_Name")
    private String bookname;

    @Column(name = "Author")
    private String author;

    @Column(name = "DateAdded")
    private String dateadded;

    public Book() {

    }

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateadded() {
		return dateadded;
	}

	public void setDateadded(String dateadded) {
		this.dateadded = dateadded;
	}

	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", bookname=" + bookname + ", author=" + author + ", dateadded="
				+ dateadded + "]";
	}


}