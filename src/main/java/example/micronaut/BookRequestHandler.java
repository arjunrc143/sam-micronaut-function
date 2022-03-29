package example.micronaut;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.function.aws.MicronautRequestHandler;
import jakarta.inject.Inject;

import java.util.UUID;

import javax.validation.Valid;

public class BookRequestHandler extends MicronautRequestHandler<Book, BookSaved> {

    @Inject
    private BookService service;
    @Override
    public BookSaved execute(Book input) {
        return service.save(input);
    }
}
