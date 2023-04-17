package tiket;

class TiketPesawat extends Tiket {
    private String maskapai;
    private String nomorPenerbangan;

    public TiketPesawat(String kodeTiket, Jadwal jadwal, String maskapai,
            String nomorPenerbangan) {
        super(kodeTiket, jadwal);
        this.maskapai = maskapai;
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public void setNomorPenerbangan(String nomorPenerbangan) {
        this.nomorPenerbangan = nomorPenerbangan;
    }

    public void showDetail() {
        System.out.println("Maskapai     : " + maskapai);
        System.out.println("Nomor Penrb. : " + nomorPenerbangan);
        System.out.println("Kode Tiket   : " + getKodeTiket());
        System.out.println("Rute         : " + getJadwal().getRute());
        System.out.println("Berangkat    : " + getJadwal().getWaktu());
    }
}
