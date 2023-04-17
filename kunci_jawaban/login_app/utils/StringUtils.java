package login_app.utils;

public class StringUtils {

    public static String generateNickName(String fullName) {
        if (!fullName.isEmpty()) {
            String[] word = fullName.trim().split(" ");
            return word.length > 1 ? word[1] : word[0];
        }
        return "";
    }
}
