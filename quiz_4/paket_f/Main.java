package paket_f;

public class Main {
    public static void main(String[] args) {
        // #6
        Utils.selfDisplay();

        // 3
        Mahasiswa mahasiswa = new Mahasiswa("Alip", "H071191050");

        // 4
        System.out.println("Nama      : " + mahasiswa.getNama());
        System.out.println("NIM       : " + mahasiswa.getNim());

        // 5
        mahasiswa.showAngkatan();
    }
}
