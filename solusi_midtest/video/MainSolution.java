package video;

import java.util.Scanner;

public class MainSolution {
    public static void main(String[] args) {
        Akun akun = new Akun("Sanji", "toku404", "2019", false);
        Subtitle sub1 = new Subtitle("Indonesia", "Pain Akatsuki");
        Subtitle sub2 = new Subtitle("Melayu", "Lebah Ganteng");
        Movie favoriteMovie = new Movie("Buya Hamka", "History", 2023, 106, sub1);
        Series favoriteSeries = new Series("Duty After School", "Thriller", 2023, 10, 1, sub2);
        runApp(akun, favoriteMovie, favoriteSeries);
    }

    private static void runApp(Akun akun, Movie faMovie, Series faSeries) {
        System.out.println("Welcome, " + akun.getName());
        System.out.println(akun.isPremium() ? "| Akun Permium |" : "| Akun Trial |");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Favorite Movie");
        System.out.println("2. Show Favorite Series");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Favorite Movie");
                faMovie.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Favorite Series");
                faSeries.showDetail();
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