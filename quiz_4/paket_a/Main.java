package paket_a;

public class Main {
    public static void main(String[] args) {
        // #6
        Utils.selfDisplay();

        // #3
        Toko toko = new Toko("Angkasa Jaya");

        // #4
        toko.setJumlahBarang(10);

        // #5
        System.out.println("Nama Toko     : " + toko.getNamaToko());
        System.out.println("Jumlah Barang : " + toko.getJumlahBarang());
    }
}
