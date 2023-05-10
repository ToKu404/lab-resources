package video;

class Movie extends Video {
    private int duration;

    public Movie(String title, String genre, int releaseYear, int duration, Subtitle director) {
        super(title, genre, releaseYear, director);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Duration    : " + duration + " Menit");
    }

}