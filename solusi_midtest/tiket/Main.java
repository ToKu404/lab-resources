import java.util.Scanner;

/**
 * Soal2
 */
public class Main {

    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Penumpang
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 2-A
         * Instance Objek Jadwal (jadwalKereta)
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * /*
         * TODO 2-B
         * Instance Objek Jadwal (jadwalPesawat)
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 3
         * Instance Objek TiketKerata
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 4
         * Instance Objek TiketPesawat
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 5
         * Kirimkan objek tiketKerata, tiketPesawat dan penumpang
         * ke method runApp
         */
        runApp();
    }

    private static void runApp(TiketKereta tiketKereta, TiketPesawat tiketPesawat, Penumpang dataDiri) {
        /*
         * TODO 6
         * Tampilkan nomor identitas dan nama penumpang seperti contoh berikut :
         * 029-120032
         * Hello, Brook
         */
        System.out.println(dataDiri.getNomorIdentitas());
        System.out.println("Hello, " + dataDiri.getNama());

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Informasi Tiket Kereta");
        System.out.println("2. Informasi Tiket Pesawat");
        System.out.println("3. Show Feedback");

        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Tiket Kereta");
                // TODO 7 : Tampilkan Info Tiket Kereta
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Tiket Pesawat");
                // TODO 8 : Tampilkan Info Tiket Pesawat
                break;
            case 3:
                System.out.println("=".repeat(25));
                // TODO 9 : Tampilkan Data Diri (showMyData)
                // TODO 10 : Tampilkan Kritik dan Saran
                System.out.println("=".repeat(25));
                break;
            default:
                break;
        }

        scanner.close();
    }
}