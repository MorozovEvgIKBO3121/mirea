package Lab25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class MathematicalExpression {
    public static void main(String[] args) {
        String[] expressions = {"(3*+*5)*-*9*×*4", "((3*+*5)*-*9*×*4)", "(3*+*5)*-9*×*4"};

        for (String expression : expressions) {
            try {
                Pattern pattern = Pattern.compile("^(\\(|[^\\(\\)]*)*+(\\)|[^\\(\\)]*)*+$");
                Matcher matcher = pattern.matcher(expression);
                if (matcher.matches()) {
                    System.out.println(expression);
                }
            } catch (PatternSyntaxException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

