package kl.springframework.springwebapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "directors")
    private Set<Film> films;

    public Director(String firstName, String lastName, Set<Film> films) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.films = films;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
