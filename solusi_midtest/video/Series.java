package video;

class Series extends Video {
    private int numOfEpisodes;
    private int numOfSeasons;

    public Series(String title, String genre, int releaseYear, int numOfEpisodes, int numOfSeasons, Subtitle director) {
        super(title, genre, releaseYear, director);
        this.numOfEpisodes = numOfEpisodes;
        this.numOfSeasons = numOfSeasons;
    }

    public int getNumOfEpisodes() {
        return numOfEpisodes;
    }

    public void setNumOfEpisodes(int numOfEpisodes) {
        this.numOfEpisodes = numOfEpisodes;
    }

    public int getNumOfSeasons() {
        return numOfSeasons;
    }

    public void setNumOfSeasons(int numOfSeasons) {
        this.numOfSeasons = numOfSeasons;
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Jumlah Episode : " + numOfEpisodes);
        System.out.println("Jumlah Season  : " + numOfSeasons);
    }
}
