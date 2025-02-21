package com.bookstoreapp.book.exception;

import com.bookstoreapp.generalexceptions.MainNotFoundException;

public class BookNotFoundException extends MainNotFoundException {

    public BookNotFoundException(String message) {

        super(message);
    }
}
