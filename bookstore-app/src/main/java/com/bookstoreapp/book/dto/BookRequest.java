package com.bookstoreapp.book.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookRequest {

    @NotNull
    String title;

    @NotNull
    String author;

    @NotNull
    String category;

    @NotNull
    Integer publicationYear;

    @NotNull
    String language;

    @NotNull
    Integer availableCopies;

    @NotNull
    BigDecimal price;

}
