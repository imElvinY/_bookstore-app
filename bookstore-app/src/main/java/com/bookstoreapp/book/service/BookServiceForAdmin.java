package com.bookstoreapp.book.service;

import com.bookstoreapp.book.dto.BookRequest;
import com.bookstoreapp.book.entity.Book;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface BookServiceForAdmin {

    List<Book> getAll();

    Book getByBookId(Long bookId);

    List<Book> getByAuthor(String author);

    List<Book> getByCategory(String category);

    List<Book> getByLanguage(String language);

    List<Book> getByPriceBetween(BigDecimal priceMin, BigDecimal priceMax);

    List<Book> getByAvailableCopies(Integer availableCopies);

    void create(BookRequest book);

    void updateByBookId(Long bookId, BookRequest book);

    void deleteByBookId(Long bookId);

}
