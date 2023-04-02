package paket_f;

/**
 * Mahasiswa
 */
public class Mahasiswa {
    // 1
    private String nama;
    private String nim;
    private int tahunMasuk;

    // 2
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = 2022;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void showAngkatan() {
        System.out.println("Angkatan  : " + (tahunMasuk % 2000));
    }
}