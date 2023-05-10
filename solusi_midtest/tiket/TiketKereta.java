package tiket;

class TiketKereta extends Tiket {
    private String kelasKereta;
    private String nomorKursi;

    public TiketKereta(String kodeTiket, Jadwal jadwal, String kelasKereta, String nomorKursi) {
        super(kodeTiket, jadwal);
        this.kelasKereta = kelasKereta;
        this.nomorKursi = nomorKursi;
    }

    public String getKelasKereta() {
        return kelasKereta;
    }

    public void setKelasKereta(String kelasKereta) {
        this.kelasKereta = kelasKereta;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    public void showDetail() {
        System.out.println("Kelas Kereta : " + kelasKereta);
        System.out.println("Nomor Kursi  : " + nomorKursi);
        System.out.println("Kode Tiket   : " + getKodeTiket());
        System.out.println("Rute         : " + getJadwal().getRute());
        System.out.println("Berangkat    : " + getJadwal().getWaktu());
    }
}
