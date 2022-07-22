package kl.springframework.springwebapp.repositories;

import kl.springframework.springwebapp.domain.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director,Long> {
}
