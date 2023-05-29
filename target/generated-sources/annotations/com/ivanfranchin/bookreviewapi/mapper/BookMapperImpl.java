package com.ivanfranchin.bookreviewapi.mapper;

import com.ivanfranchin.bookreviewapi.graphql.input.BookInput;
import com.ivanfranchin.bookreviewapi.model.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-29T16:31:33-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(BookInput bookInput) {
        if ( bookInput == null ) {
            return null;
        }

        Book book = new Book();

        book.setIsbn( bookInput.isbn() );
        book.setTitle( bookInput.title() );

        return book;
    }

    @Override
    public void updateBookFromInput(BookInput bookInput, Book book) {
        if ( bookInput == null ) {
            return;
        }

        if ( bookInput.isbn() != null ) {
            book.setIsbn( bookInput.isbn() );
        }
        if ( bookInput.title() != null ) {
            book.setTitle( bookInput.title() );
        }
    }
}
