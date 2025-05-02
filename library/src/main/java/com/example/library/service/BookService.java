package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public Optional<Book> getBookById(Long id) {
        return Optional.ofNullable(bookRepository.getBookById(id));
    }

    public Optional<Book> updateBook(Long id, Book book) {
        return Optional.ofNullable(bookRepository.updateBook(id, book));
    }

    public Boolean deleteBook(Long id) {
        return bookRepository.deleteBook(id);
    }
}
