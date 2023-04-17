public class Anime {
    private String title;
    private String genre;
    private int episodeCount;
    private String studio;
    private String synopsis;
    
    public Anime() {
    }

    public Anime(String title, String genre, int episodeCount, String studio, String synopsis) {
        this.title = title;
        this.genre = genre;
        this.episodeCount = episodeCount;
        this.studio = studio;
        this.synopsis = synopsis;
    }

    public void watch() {
        System.out.println("Now watching " + title);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Episodes: " + episodeCount);
        System.out.println("Studio: " + studio);
        System.out.println("Synopsis: " + synopsis);
    }

    // getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
