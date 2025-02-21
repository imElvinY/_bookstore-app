package com.bookstoreapp.book.service.serviceimpl;

import com.bookstoreapp.book.dto.BookResponse;
import com.bookstoreapp.book.entity.Book;
import com.bookstoreapp.book.exception.BookNotFoundException;
import com.bookstoreapp.book.mapper.BookMapper;
import com.bookstoreapp.book.repository.BookRepository;
import com.bookstoreapp.book.service.BookServiceForUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookUserServiceImpl implements BookServiceForUser {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;


    @Override
    public List<BookResponse> getAll() {

        List<Book> books = bookRepository.findAll();

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {

            bookResponses.add(bookMapper.mapToDto(book));

        }

        return bookResponses;

    }

    @Override
    public List<BookResponse> getByAuthor(String author) {

        List<Book> books = bookRepository.findByAuthor(author);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {

            bookResponses.add(bookMapper.mapToDto(book));

        }

        return bookResponses;

    }

    @Override
    public List<BookResponse> getByCategory(String category) {

        List<Book> books = bookRepository.findByCategory(category);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {

            bookResponses.add(bookMapper.mapToDto(book));

        }

        return bookResponses;

    }

    @Override
    public List<BookResponse> getByLanguage(String language) {

        List<Book> books = bookRepository.findByLanguage(language);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {

            bookResponses.add(bookMapper.mapToDto(book));

        }

        return bookResponses;

    }

    @Override
    public List<BookResponse> getByPriceBetween(BigDecimal priceMin, BigDecimal priceMax) {

        List<Book> books = bookRepository.findByPriceBetween(priceMin, priceMax);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        List<BookResponse> bookResponses = new ArrayList<>();

        for (Book book : books) {

            bookResponses.add(bookMapper.mapToDto(book));

        }

        return bookResponses;

    }
}
