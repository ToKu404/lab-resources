package tiket;

class Tiket {
    protected String kodeTiket;
    protected Jadwal jadwal;

    public Tiket(String kodeTiket, Jadwal jadwal) {
        this.kodeTiket = kodeTiket;
        this.jadwal = jadwal;
    }

    public String getKodeTiket() {
        return kodeTiket;
    }

    public void setKodeTiket(String kodeTiket) {
        this.kodeTiket = kodeTiket;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
}