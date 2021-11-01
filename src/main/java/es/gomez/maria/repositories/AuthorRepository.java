package es.gomez.maria.repositories;

import es.gomez.maria.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
