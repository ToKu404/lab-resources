package rekening;

import java.util.Scanner;

public class MainSolution {
    public static void main(String[] args) {
        Bank bank = new Bank("BCA", "Perintis Kemerdekaan 2");
        Customer customer = new Customer("Zoro", "BTP Blok E-159", "082198246668", true);
        Tabungan tabungan = new Tabungan("7312410100", 20000000, customer, 5);
        Giro giro = new Giro("7312410100", 20000000, customer, 500000, 2);
        runApp(bank, tabungan, giro);
    }

    private static void runApp(Bank bank, Tabungan tabungan, Giro giro) {
        System.out.println("Selamat datang ke Bank " + bank.getNama());
        System.out.println((tabungan.getPemilikRekening().isMale() ? "Tuan, " : "Nyonya, ") + tabungan
                .getPemilikRekening().getNama());

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
                tabungan.infoRekening();
                ;
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Informasi Giro");
                giro.infoRekening();
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
