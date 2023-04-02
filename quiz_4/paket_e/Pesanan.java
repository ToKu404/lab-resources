package paket_e;

/**
 * Pesanan
 */
public class Pesanan {
    // #1
    private String namaPesanan;
    private String alamatPesanan;
    private int totalHarga;

    // #2
    public Pesanan(String namaPesanan, String alamatPesanan) {
        this.namaPesanan = namaPesanan;
        this.alamatPesanan = alamatPesanan;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public String getAlamatPesanan() {
        return alamatPesanan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}