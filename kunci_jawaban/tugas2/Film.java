public class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;

    public Film() {
    }

    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public void play() {
        System.out.println("Now playing " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Synopsis: " + synopsis);
    }

    // getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
