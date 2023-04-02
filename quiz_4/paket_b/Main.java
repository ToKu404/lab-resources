package paket_b;

public class Main {
    public static void main(String[] args) {
        // #6
        Utils.selfDisplay();

        // #2
        Mahasiswa mahasiswa = new Mahasiswa();

        // #3
        mahasiswa.setNama("Devon");

        // #4
        mahasiswa.setNilai(110);

        // #5
        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("Nilai  : " + mahasiswa.getNilai());
    }
}
