package com.mehmedov.books.services;

import javax.transaction.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mehmedov.books.entities.Book;
import com.mehmedov.books.repositories.BookRepository;

@Service
@Transactional
public class BookService {

	@Autowired
    private BookRepository bookRepository;
     
    public List<Book> listAllBooks() {
        return bookRepository.findAll();
    }
     
    public void save(Book book) {
        bookRepository.save(book);
    }
     
    public Book getBook(Integer id) {
        return bookRepository.findById(id).get();
    }
     
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
