package lab13;

import static lab13.PhoneConverter.convert;

public class Number5 {
    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "89175655655";
        System.out.println(convert(phoneNumber1));
        System.out.println(convert(phoneNumber2));
    }
}
