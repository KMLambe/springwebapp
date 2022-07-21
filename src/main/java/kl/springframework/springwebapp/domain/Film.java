package kl.springframework.springwebapp.domain;

public class Film {
    private String title;
    private Set<Director> directors;
    private int runningTimeInMinutes;

    public Film(String title, Set<Director> directors, int runningTimeInMinutes) {
        this.title = title;
        this.directors = directors;
        this.runningTimeInMinutes = runningTimeInMinutes;
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
}
