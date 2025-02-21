package com.bookstoreapp.book.repository;

import com.bookstoreapp.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByBookId(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByCategory(String category);

    List<Book> findByLanguage(String language);

    List<Book> findByPriceBetween(BigDecimal priceMin, BigDecimal priceMax);

    List<Book> findByAvailableCopies(Integer availableCopies);

    void deleteByBookId(Long bookId);

}
