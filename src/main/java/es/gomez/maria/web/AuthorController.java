package es.gomez.maria.web;

import es.gomez.maria.entities.Author;
import es.gomez.maria.repositories.AuthorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AuthorController {

    private final AuthorRepository authorRepository;

    AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Author> findOneById(@PathVariable Integer id) {

        Optional<Author> author = authorRepository.findById(id);
        if (author.isPresent()) {
            return ResponseEntity.ok(author.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
