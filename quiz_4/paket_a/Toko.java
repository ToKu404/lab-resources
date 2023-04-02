package paket_a;

/**
 * Toko
 */
public class Toko {

    // #1
    private String namaToko;
    private int jumlahBarang;

    // 2
    public Toko(String namaToko) {
        this.namaToko = namaToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}