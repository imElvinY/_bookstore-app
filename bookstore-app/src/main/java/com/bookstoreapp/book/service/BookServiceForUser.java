package com.bookstoreapp.book.service;

import com.bookstoreapp.book.dto.BookResponse;
import com.bookstoreapp.book.entity.Book;

import java.math.BigDecimal;
import java.util.List;

public interface BookServiceForUser {

    List<BookResponse> getAll();

    List<BookResponse> getByAuthor(String author);

    List<BookResponse> getByCategory(String category);

    List<BookResponse> getByLanguage(String language);

    List<BookResponse> getByPriceBetween(BigDecimal priceMin, BigDecimal priceMax);

}
