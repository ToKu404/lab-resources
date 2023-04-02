package paket_c;

public class Mobil {

    // #1
    private String merek;
    private String model;
    private int kecepatan;

    // #2
    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
        this.kecepatan = 0;
    }

    // #3
    public void gas() {
        kecepatan += 10;
    }

    public void rem() {
        kecepatan -= 10;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public int getKecepatan() {
        return kecepatan;
    }
}