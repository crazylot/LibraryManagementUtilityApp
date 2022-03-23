package org.NagarroProjects.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.NagarroProjects.dto.Book;
import org.NagarroProjects.service.BookService;

@Controller
public class BooksController {

    @Autowired
    private BookService bookservice;

    @RequestMapping("/list")
    public String listBooks(Model theModel) {
        List < Book > theBooks = bookservice.getBooks();
        theModel.addAttribute("books", theBooks);
        return "list-books";
    }

    @RequestMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        Book theBook = new Book();
        theModel.addAttribute("book", theBook);
        return "book-form";
    }

    @RequestMapping("/savebook")
    public String saveBook(@ModelAttribute("book") Book theBook) {
        bookservice.saveBook(theBook);
        return "redirect:/list";
    }

    @RequestMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("bookId") int theId,
        Model theModel) {
        Book theBook = bookservice.getBook(theId);
        theModel.addAttribute("book", theBook);
        return "book-form";
    }

    @RequestMapping("/delete")
    public String deleteBook(@RequestParam("bookId") int theId) {
        bookservice.deleteBook(theId);
        return "redirect:/list";
    }
}
