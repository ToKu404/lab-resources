package paket_g;

/**
 * Buku
 */
public class Buku {
    // 1
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    // 2
    public void displayDetail() {
        System.out.println("Judul          : " + judul);
        System.out.println("Penulis        : " + penulis);
        System.out.println("Jumlah Halaman : " + jumlahHalaman);
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}