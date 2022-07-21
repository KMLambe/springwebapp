package kl.springframework.springwebapp.domain;

import java.util.Set;

public class Director {
    private String firstName;
    private String lastName;
    private Set<Film> films;

    public Director(String firstName, String lastName, Set<Film> films) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.films = films;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
