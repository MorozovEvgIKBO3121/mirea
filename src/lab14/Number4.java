package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number4 {
    public static void main(String[] args) {
        String text = "(1 + 8) -9/4";
        String regex = "(?<!\\+)\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Найдены цифры, за которыми не стоит знак «+»");
        } else {
            System.out.println("Цифр без знака «+» не найдено");
        }
    }
}
