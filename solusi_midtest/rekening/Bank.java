package rekening;

class Bank {
    private String nama;
    private String alamat;

    public Bank(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void infoBank() {
        System.out.println("Nama bank      : " + nama);
        System.out.println("Alamat bank    : " + alamat);
    }
}
