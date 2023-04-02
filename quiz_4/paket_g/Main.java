package paket_g;

public class Main {
    public static void main(String[] args) {
        // #7
        Utils.selfDisplay();

        // 3
        Buku buku = new Buku();

        // 4
        buku.setPenulis("Buya Hamka");
        buku.setJudul("The Sinking of van der Wijck");
        buku.setJumlahHalaman(241);

        // 5
        buku.displayDetail();
    }
}
