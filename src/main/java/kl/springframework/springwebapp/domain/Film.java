package kl.springframework.springwebapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @ManyToMany
    @JoinTable(name = "director_film", joinColumns = @JoinColumn("film_id"),
    inverseJoinColumns = @JoinColumn(name = "director_id"))
    private Set<Director> directors = new HashSet<>();
    private int runningTimeInMinutes;

    public Film(String title, int runningTimeInMinutes) {
        this.title = title;
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }

    public int getRunningTimeInMinutes() {
        return runningTimeInMinutes;
    }

    public void setRunningTimeInMinutes(int runningTimeInMinutes) {
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", directors=" + directors +
                ", runningTimeInMinutes=" + runningTimeInMinutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        return id == film.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
