package lab14;

import java.util.regex.*;

public class Number5 {
    public static void main(String[] args) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)$";
        String date1 = "29/02/2000";
        String date2 = "30/04/2003";
        String date3 = "01/01/2003";
        String date4 = "29/02/2001";
        String date5 = "30-04-2003";
        String date6 = "1/1/1899";

        Pattern pattern = Pattern.compile(regex);

        System.out.println(pattern.matcher(date1).matches());
        System.out.println(pattern.matcher(date2).matches());
        System.out.println(pattern.matcher(date3).matches());
        System.out.println(pattern.matcher(date4).matches());
        System.out.println(pattern.matcher(date5).matches());
        System.out.println(pattern.matcher(date6).matches());
    }
}
