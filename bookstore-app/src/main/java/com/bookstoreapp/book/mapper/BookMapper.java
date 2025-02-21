package com.bookstoreapp.book.mapper;

import com.bookstoreapp.book.dto.BookRequest;
import com.bookstoreapp.book.dto.BookResponse;
import com.bookstoreapp.book.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book mapToEntity(BookRequest requestDto);

    BookResponse mapToDto(Book entity);

    Book updateBookFromDto(BookRequest requestDto, @MappingTarget Book entity);

}
