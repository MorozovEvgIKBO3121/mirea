package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number3 {
    public static void main(String[] args) {
        String text = "Some text with prices: 25.98 USD, 1500 RUB, 12.5 EU, 44 ERR, 0.004 EU";

        Pattern usdPattern = Pattern.compile("(\\d+\\.\\d{2})\\s+USD");
        Pattern rubPattern = Pattern.compile("(\\d+)\\s+RUB");
        Pattern euPattern = Pattern.compile("(\\d+\\.\\d{1,2})\\s+EU");

        Matcher matcher = usdPattern.matcher(text);
        while (matcher.find()) {
            String price = matcher.group(1);
            System.out.println("USD price found: " + price);
        }

        matcher = rubPattern.matcher(text);
        while (matcher.find()) {
            String price = matcher.group(1);
            System.out.println("RUB price found: " + price);
        }

        matcher = euPattern.matcher(text);
        while (matcher.find()) {
            String price = matcher.group(1);
            System.out.println("EU price found: " + price);
        }
    }
}
