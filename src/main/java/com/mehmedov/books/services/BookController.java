package com.mehmedov.books.services;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

import com.mehmedov.books.entities.Book;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/displayBooks")
	public Book getBook(Integer id) {

		return bookService.getBook(id);
	}

	@GetMapping("/displayBooks")
	public List<Book> listAllBooks(Integer id) {

		return bookService.listAllBooks();
	}

	@PostMapping("/books")
	public void addBook(@RequestBody Book book) {
		bookService.save(book);
	}

	@PutMapping("/books")
	public void updateBook(@RequestBody Book book) {
		bookService.save(book);
	}

	@DeleteMapping("/books")
	public void deleteBook(@RequestBody Integer id) {
		bookService.deleteBook(id);
	}
}
