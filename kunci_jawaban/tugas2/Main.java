public class Main {
    public static void main(String[] args) {
        // Objek 1
        Anime anime1 = new Anime();
        anime1.setTitle("One Piece");
        anime1.setEpisodeCount(1200);
        anime1.setGenre("Shounen");
        anime1.setStudio("Toei Animation");
        anime1.setSynopsis("Menjadi raja bajak laut");

        // Tampilkan
        anime1.displayInfo();

        System.out.println();

        // Objek 2
        Anime anime2 = new Anime("Demon Slayer", "Action", 12, "Mappa", "Berburu Iblis");

        // Tampilkan informasi anime
        System.out.println("===== Informasi Anime =====");
        System.out.println("Judul: " + anime2.getTitle());
        System.out.println("Jumlah Episode: " + anime2.getEpisodeCount());
        System.out.println("Genre: " + anime2.getGenre());
        System.out.println("Studio: " + anime2.getStudio());
        System.out.println("Sinopsis: " + anime2.getSynopsis());
    }
}
