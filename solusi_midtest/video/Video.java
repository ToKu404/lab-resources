package video;

class Video {
    protected String title;
    protected String genre;
    protected int releaseYear;
    protected Subtitle subtitle;

    public Video(String title, String genre, int releaseYear, Subtitle subtitle) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.subtitle = subtitle;
    }

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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Subtitle getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Subtitle director) {
        this.subtitle = director;
    }

    public void showDetail() {
        System.out.println("Judul       : " + title);
        System.out.println("Genre       : " + genre);
        System.out.println("Tahun Rilis : " + releaseYear);
        System.out.printf("Subtitle    : %s (%s)\n", subtitle.getLanguage(), subtitle.getTranslator());
    }
}
