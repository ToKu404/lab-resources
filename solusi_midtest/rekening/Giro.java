package rekening;

class Giro extends Rekening {
    private int batasTarikTunai; // batas debit giro
    private int bunga; // suku bunga giro

    // konstruktor
    public Giro(String nomorRekening, int saldo, Customer pemilikRekening, int batasTarikTunai, int bunga) {
        super(nomorRekening, saldo, pemilikRekening);
        this.batasTarikTunai = batasTarikTunai;
        this.bunga = bunga;
    }

    // getter dan setter
    public int getBatasDebit() {
        return batasTarikTunai;
    }

    public void setBatasDebit(int batasTarikTunai) {
        this.batasTarikTunai = batasTarikTunai;
    }

    public int getBunga() {
        return bunga;
    }

    public void setBunga(int bunga) {
        this.bunga = bunga;
    }

    public void infoRekening() {
        super.infoRekening();
        System.out.println("Batas Penarikan : " + batasTarikTunai);
        System.out.println("Bunga           : " + bunga);
    }

}
