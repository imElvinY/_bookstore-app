package com.bookstoreapp.book.service.serviceimpl;

import com.bookstoreapp.book.dto.BookRequest;

import com.bookstoreapp.book.entity.Book;
import com.bookstoreapp.book.exception.BookNotFoundException;
import com.bookstoreapp.book.mapper.BookMapper;
import com.bookstoreapp.book.repository.BookRepository;
import com.bookstoreapp.book.service.BookServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookAdminServiceImpl implements BookServiceForAdmin {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;


    @Override
    public List<Book> getAll() {

        List<Book> books = bookRepository.findAll();

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        return books;

    }

    @Override
    public Book getByBookId(Long bookId) {

        Book searchedBook = bookRepository.findByBookId(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        return searchedBook;

    }

    @Override
    public List<Book> getByAuthor(String author) {

        List<Book> books = bookRepository.findByAuthor(author);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");
        }

        return books;

    }

    @Override
    public List<Book> getByCategory(String category) {

        List<Book> books = bookRepository.findByCategory(category);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        return books;

    }

    @Override
    public List<Book> getByLanguage(String language) {

        List<Book> books = bookRepository.findByLanguage(language);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        return books;

    }

    @Override
    public List<Book> getByPriceBetween(BigDecimal priceMin, BigDecimal priceMax) {

        List<Book> books = bookRepository.findByPriceBetween(priceMin, priceMax);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        return books;

    }

    @Override
    public List<Book> getByAvailableCopies(Integer availableCopies) {

        List<Book> books = bookRepository.findByAvailableCopies(availableCopies);

        if (books.isEmpty()) {

            throw new BookNotFoundException("Book not found");

        }

        return books;

    }

    @Override
    public void create(BookRequest book) {

        Book newBook = bookMapper.mapToEntity(book);

        bookRepository.save(newBook);

    }

    @Override
    public void updateByBookId(Long bookId, BookRequest book) {

        Book existingBook = bookRepository.findByBookId(bookId)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

       existingBook = bookMapper.updateBookFromDto(book, existingBook);

        bookRepository.save(existingBook);

    }

    @Override
    public void deleteByBookId(Long bookId) {

        bookRepository.deleteByBookId(bookId);

    }

}
