package tiket;

class Jadwal {
    private String rute;
    private String waktu;

    public Jadwal(String rute, String waktu) {
        this.rute = rute;
        this.waktu = waktu;
    }

    public String getRute() {
        return rute;
    }

    public void setRute(String rute) {
        this.rute = rute;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
