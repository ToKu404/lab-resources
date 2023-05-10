package rekening;

class Rekening {
    protected String nomorRekening; // nomor rekening
    protected int saldo; // saldo rekening
    protected Customer pemilikRekening; // pemilik rekening

    // konstruktor
    public Rekening(String nomorRekening, int saldo, Customer pemilikRekening) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.pemilikRekening = pemilikRekening;
    }

    // getter dan setter
    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Customer getPemilikRekening() {
        return pemilikRekening;
    }

    public void setPemilikRekening(Customer pemilikRekening) {
        this.pemilikRekening = pemilikRekening;
    }

    public void infoRekening() {
        System.out.println("Nomor rekening  : " + nomorRekening);
        System.out.println("Nama pemilik    : " + pemilikRekening.getNama());
        System.out.println("Alamat          : " + pemilikRekening.getAlamat());
        System.out.println("Nomor Telp      : " + pemilikRekening.getNomorTelepon());
        System.out.println("Saldo           : " + saldo);
    }
}
