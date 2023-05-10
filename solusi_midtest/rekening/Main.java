package rekening;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Bank
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 2
         * Instance Objek Customer
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 3
         * Instance Objek Tabungan
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 4
         * Instance Objek Giro
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 5
         * Kirimkan objek bank, tabungan dan giro
         * ke method runApp
         */
        runApp();
    }

    private static void runApp(Bank bank, Tabungan tabungan, Giro giro) {
        /*
         * TODO 6
         * Tampilkan data bank dan customer seperti contoh berikut :
         * Selamat datang ke Bank BCA
         * Tuan, Zoro (Gunakan tuan jika isMale true, dan nona jika isMale false)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Informasi Tabungan");
        System.out.println("2. Informasi Giro");
        System.out.println("3. Show Feedback");

        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Tabungan");
                // TODO 7 : Tampilkan Info Rekening Tabungan
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Giro");
                // TODO 8 : Tampilkan Info Rekening Giro
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
