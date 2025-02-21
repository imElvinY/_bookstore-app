package com.bookstoreapp.book.controller;

import com.bookstoreapp.book.dto.BookRequest;
import com.bookstoreapp.book.entity.Book;
import com.bookstoreapp.book.service.BookServiceForAdmin;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/books")
public class BookAdminController {

    private final BookServiceForAdmin service;

    @GetMapping("/all")
    List<Book> getAll() {

        return service.getAll();

    }

    @GetMapping("id/{id}")
    Book getByBookId(@PathVariable("id") Long bookId) {

        return service.getByBookId(bookId);

    }

    @GetMapping("author/{author}")
    List<Book> getByAuthor(@PathVariable String author) {

        return service.getByAuthor(author);

    }

    @GetMapping("category/{category}")
    List<Book> getByCategory(@PathVariable String category) {

        return service.getByCategory(category);

    }

    @GetMapping("language/{language}")
    List<Book> getByLanguage(@PathVariable String language) {

        return service.getByLanguage(language);

    }

    @GetMapping("price-between/{min}/{max}")
    List<Book> getByPriceBetween(@PathVariable("min") BigDecimal priceMin,
                                 @PathVariable("max") BigDecimal priceMax) {

        return service.getByPriceBetween(priceMin, priceMax);

    }

    @GetMapping("available/{count}")
    List<Book> getByAvailableCopies(@PathVariable("count") Integer availableCopies) {

        return service.getByAvailableCopies(availableCopies);

    }

    @PostMapping
    void create(@RequestBody BookRequest book) {

        service.create(book);

    }

    @PutMapping("{id}")
    void updateByBookId(@PathVariable("id") Long bookId, @RequestBody BookRequest book) {

        service.updateByBookId(bookId, book);

    }

    @DeleteMapping("{id}")
    void deleteByBookId(@PathVariable("id") Long bookId) {

        service.deleteByBookId(bookId);

    }
}
