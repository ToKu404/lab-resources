package rekening;

class Tabungan extends Rekening {
    private int sukuBunga; // suku bunga tabungan

    // konstruktor
    public Tabungan(String nomorRekening, int saldo, Customer pemilikRekening, int sukuBunga) {
        super(nomorRekening, saldo, pemilikRekening);
        this.sukuBunga = sukuBunga;
    }

    // getter dan setter
    public int getSukuBunga() {
        return sukuBunga;
    }

    public void setSukuBunga(int sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    public void infoRekening() {
        super.infoRekening();
        System.out.println("Suku Bunga      : " + sukuBunga);
    }
}
