package paket_d;

public class Karyawan {

    // #1
    private String nama;
    private String jabatan;
    private int gaji;

    // #3
    public void displayDataKaryawan() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jabatan : " + jabatan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

}