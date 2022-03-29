package example.micronaut;

import java.util.UUID;

import javax.validation.Valid;

import jakarta.inject.Singleton;

@Singleton
public class BookService {

    public BookSaved save(@Valid Book input) {
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(input.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }
    
}
