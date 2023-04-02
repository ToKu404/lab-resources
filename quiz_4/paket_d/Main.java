package paket_d;

public class Main {
    public static void main(String[] args) {
        // #7
        Utils.selfDisplay();

        // #2
        Karyawan karyawan = new Karyawan();

        // #4
        karyawan.setNama("Agnes");
        karyawan.setJabatan("CTO");
        karyawan.setGaji(37000000);

        // #5
        karyawan.displayDataKaryawan();

        // #6
        System.out.println("Gaji : " + karyawan.getGaji());
    }
}
