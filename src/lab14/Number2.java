package lab14;

import java.util.regex.*;

public class Number2 {
    public static void main(String[] args) {
        String source = "abcdefghijklmnopqrstuv18340";
        String regex = "^(?=.{20}$)abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);

        if (matcher.matches()) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Строка не соответствует шаблону");
        }
    }
}