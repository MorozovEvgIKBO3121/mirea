package lab14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password to check:");
        String password = scanner.nextLine();

        boolean isValid = checkPassword(password);

        if (isValid) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is not valid.");
        }
    }

    private static boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).+$");
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
