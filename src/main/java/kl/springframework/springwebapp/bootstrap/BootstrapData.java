package kl.springframework.springwebapp.bootstrap;

import kl.springframework.springwebapp.domain.Director;
import kl.springframework.springwebapp.domain.Film;
import kl.springframework.springwebapp.repositories.DirectorRepository;
import kl.springframework.springwebapp.repositories.FilmRepository;
import org.springframework.boot.CommandLineRunner;

public class BootstrapData implements CommandLineRunner {

    private final DirectorRepository directorRepository;
    private final FilmRepository filmRepository;

    public BootstrapData(DirectorRepository directorRepository, FilmRepository filmRepository) {
        this.directorRepository = directorRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Director testDirector = new Director("TestFirstName","TestLastName");
        Film testFilm = new Film("testFilmTitle",90);
        testDirector.getFilms().add(testFilm);
        testFilm.getDirectors().add(testDirector);

        directorRepository.save(testDirector);
        filmRepository.save(testFilm);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of films: " + filmRepository.count());

    }
}
