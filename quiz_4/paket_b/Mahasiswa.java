package paket_b;

/**
 * Mahasiswa
 */
public class Mahasiswa {

    // #1
    private String nama;
    private int nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        // #4
        if (nilai > 100) {
            this.nilai = 100;
        } else if (nilai < 0) {
            this.nilai = 0;
        } else {
            this.nilai = nilai;
        }
    }

}