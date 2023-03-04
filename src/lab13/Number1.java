package lab13;


    public class Number1 {

        public static void main(String[] args) {
            String inputString = "I like Java!!!";
            System.out.println("Input String: " + inputString);

            System.out.println("Last character of the string: " + inputString.charAt(inputString.length() - 1));

            System.out.println("String ends with '!!!': " + inputString.endsWith("!!!"));

            System.out.println("String starts with 'I like': " + inputString.startsWith("I like"));

            System.out.println("String contains 'Java': " + inputString.contains("Java"));

            System.out.println("Position of 'Java' in the string: " + inputString.indexOf("Java"));

            String replacedString = inputString.replace('a', 'o');
            System.out.println("String after replacement: " + replacedString);

            String upperCaseString = inputString.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseString);

            String lowerCaseString = inputString.toLowerCase();
            System.out.println("Lowercase string: " + lowerCaseString);

            String extractedString = inputString.substring(7, 11);
            System.out.println("Extracted string: " + extractedString);
        }
    }


