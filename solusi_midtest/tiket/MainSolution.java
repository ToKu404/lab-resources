package tiket;

import java.util.Scanner;

/**
 * Soal2
 */
public class MainSolution {

    public static void main(String[] args) {
        Penumpang dataDiri = new Penumpang("Brook", "029-120032");
        Jadwal jadwalKereta = new Jadwal("Makassar-Manado", "19:00");
        Jadwal jadwalPesawat = new Jadwal("Makassar-Manado", "12:00");
        TiketKereta tiketKereta = new TiketKereta("KJ023", jadwalKereta, "Standard", "27");
        TiketPesawat tiketPesawat = new TiketPesawat("MM-023-2304", jadwalPesawat, "Lion Air", "129-A");

        runApp(tiketKereta, tiketPesawat, dataDiri);
    }

    private static void runApp(TiketKereta tiketKereta, TiketPesawat tiketPesawat, Penumpang dataDiri) {
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
                tiketKereta.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Tiket Pesawat");
                tiketPesawat.showDetail();
                break;
            case 3:
                System.out.println("=".repeat(25));
                HelperMid.showProfile();
                HelperMid.showFeedbackLab();
                System.out.println("=".repeat(25));
                break;
            default:
                break;
        }

        scanner.close();
    }
}