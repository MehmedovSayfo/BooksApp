package com.mehmedov.books.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mehmedov.books.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
