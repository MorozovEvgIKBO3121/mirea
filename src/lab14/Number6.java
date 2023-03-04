package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number6 {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean isValid(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "root@localhost";
        String email3 = "myhost@@@com.ru";
        String email4 = "@my.ru";
        String email5 = "Julia String";

        System.out.println(email1 + ": " + isValid(email1));
        System.out.println(email2 + ": " + isValid(email2));
        System.out.println(email3 + ": " + isValid(email3));
        System.out.println(email4 + ": " + isValid(email4));
        System.out.println(email5 + ": " + isValid(email5));
    }
}
