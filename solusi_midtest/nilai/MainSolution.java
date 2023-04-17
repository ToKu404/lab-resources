package nilai;

import java.util.Scanner;

public class MainSolution {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Ikhsan", "H071191049");
        MataKuliah mataKuliah = new MataKuliah("JK011", "OOP", 3);
        NilaiPraktikum nilaiPraktikum = new NilaiPraktikum(78, 100, mataKuliah);
        NilaiKelas nilaiKelas = new NilaiKelas(80, 90, mataKuliah);
        runApp(mahasiswa, nilaiKelas, nilaiPraktikum);
    }

    private static void runApp(Mahasiswa mahasiswa, NilaiKelas nilaiKelas, NilaiPraktikum nilaiPraktikum) {
        System.out.println("Nilai Matkul - " + nilaiKelas.getMataKuliah().getNamaMatkul());
        System.out.println(mahasiswa.getNama() + "(" + mahasiswa.getNim() + ")");
        System.out.println("-".repeat(25));

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
                nilaiPraktikum.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Kelas");
                nilaiKelas.showDetail();
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
    };
}
