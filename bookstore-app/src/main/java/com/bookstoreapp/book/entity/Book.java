package com.bookstoreapp.book.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long bookId;

    @Column(nullable = false)
    String title;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String category;

    @Column(name = "publication_year", nullable = false)
    Integer publicationYear;

    @Column(nullable = false)
    String language;

    @Column(name = "available_copies", nullable = false)
    Integer availableCopies;

    @Column(nullable = false)
    BigDecimal price;

}
