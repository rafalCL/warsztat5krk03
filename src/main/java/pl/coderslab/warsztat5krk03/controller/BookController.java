package pl.coderslab.warsztat5krk03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.warsztat5krk03.model.Book;
import pl.coderslab.warsztat5krk03.service.MemoryBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private MemoryBookService mbs;

    @GetMapping("/hello")
    public String hello(){
        return "{msg : hello}";
    }

    @GetMapping("/hellobook")
    public Book helloBook(){
        Book b= new Book(1L,"9788324631766","Thinking in Java",
                "Bruce Eckel","Helion","programming");
        return b;
    }

    @GetMapping("")
    public List<Book> bookList(){
        return this.mbs.getList();
    }
}
