package lab13;

public class PhoneConverter {
    public static String convert(String phoneNumber) {
        String countryCode = "";
        String localNumber = "";
        boolean isInternational = phoneNumber.charAt(0) == '+';

        if (isInternational) {
            countryCode = phoneNumber.substring(1, 2);
            localNumber = phoneNumber.substring(2);
        } else {
            countryCode = "7";
            localNumber = phoneNumber.substring(1);
        }

        String formattedNumber = "+";
        formattedNumber += countryCode + "-";
        formattedNumber += localNumber.substring(0, 3) + "-";
        formattedNumber += localNumber.substring(3, 6) + "-";
        formattedNumber += localNumber.substring(6);

        return formattedNumber;
    }


}

