import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Mahasiswa
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 2
         * Instance Objek MataKuliah
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 3
         * Instance Objek NilaiPraktikum
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 4
         * Instance Objek NilaiKelas
         * Pemberian nilai bisa dari constructor ataupun setter
         */

        /*
         * TODO 5
         * Kirimkan objek mahasiswa, nilaiKelas dan nilaiPraktikum
         * ke method runApp
         */
        runApp();
    }

    private static void runApp(Mahasiswa mahasiswa, NilaiKelas nilaiKelas, NilaiPraktikum nilaiPraktikum) {
        /*
         * TODO 6
         * Tampilkan data mahasiwa dan matakuliah seperti contoh berikut :
         * Nilai Matkul - OOP
         * Ikhsan(H071191049)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Nilai Praktikum");
        System.out.println("2. Show Nilai Kelas");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Praktikum");
                // TODO 7 : Tampilkan Detail Nilai Praktikum
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Kelas");
                // TODO 8 : Tampilkan Detail Nilai Kelas
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

    };
}
