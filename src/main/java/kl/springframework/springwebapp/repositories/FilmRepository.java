package kl.springframework.springwebapp.repositories;

import kl.springframework.springwebapp.domain.Film;
import org.springframework.data.repository.CrudRepository;

public interface FilmRepository extends CrudRepository<Film,Long> {
}
