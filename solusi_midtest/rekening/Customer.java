package rekening;

class Customer {
    private String nama; // nama customer
    private String alamat; // alamat customer
    private String nomorTelepon;
    private boolean isMale; // nomor telepon customer

    // konstruktor
    public Customer(String nama, String alamat, String nomorTelepon, boolean isMale) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.isMale = isMale;
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

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

}
