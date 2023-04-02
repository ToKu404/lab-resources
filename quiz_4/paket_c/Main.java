package paket_c;

public class Main {
    public static void main(String[] args) {
        // #7
        Utils.selfDisplay();

        // #4
        Mobil mobil = new Mobil("Toyota", "86");

        // #5
        mobil.gas();
        mobil.gas();
        mobil.rem();

        // #6
        System.out.println("Merek       : " + mobil.getMerek());
        System.out.println("Model       : " + mobil.getModel());
        System.out.println("Kecepatan   : " + mobil.getKecepatan());
    }
}
