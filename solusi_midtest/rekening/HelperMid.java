package rekening;

class HelperMid {
    public static void showProfile() {
        System.out.println("DATA DIRI");
        System.out.println("NAMA  : Muh. Ikhsan");
        System.out.println("NIM   : H071191049");
        System.out.println("KELAS : A");
        System.out.println("PAKET : A");
        System.out.println("-".repeat(25));
    }

    public static void showFeedbackLab() {
        System.out.println("Kritik dan Saran");
        System.out.println("-".repeat(25));
        System.out.println(cutLineString("Sebaiknya asisten tidak galak-galak kah batal nanti puasanya"));
    }

    private static String cutLineString(String str) {
        String[] temp = str.split(" ");
        String tempStr = "";
        for (int i = 0; i < temp.length; i++) {
            if ((i + 1) % 3 == 0) {
                tempStr += temp[i] + "\n";
            } else {
                tempStr += temp[i] + " ";
            }
        }
        return tempStr.trim();
    }
}
