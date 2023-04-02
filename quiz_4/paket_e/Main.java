package paket_e;

public class Main {
    public static void main(String[] args) {
        // #6
        Utils.selfDisplay();

        // #3
        Pesanan pesanan = new Pesanan("Hoodie", "Tamalanrea, Makassar");

        // #4
        pesanan.setTotalHarga(3000000);

        // #5
        System.out.println("Nama Pesanan   : " + pesanan.getNamaPesanan());
        System.out.println("Alamat Pesanan : " + pesanan.getAlamatPesanan());
        System.out.println("Total Harga    : " + pesanan.getTotalHarga());
    }
}
