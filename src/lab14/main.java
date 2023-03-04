package lab14;


public class main {
    public static void splitStringToWords(String inputString) {
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void findSubstringInString(String inputString, String substring) {
        if (inputString.contains(substring)) {
            System.out.println("Substring found in the input string");
        } else {
            System.out.println("Substring not found in the input string");
        }
    }
    public static void replaceCharactersInString(String inputString, char oldChar, char newChar) {
        String newString = inputString.replace(oldChar, newChar);
        System.out.println(newString);
    }
    public static void removeWhitespaceFromString(String inputString) {
        String newString = inputString.replaceAll("\\s+", "");
        System.out.println(newString);
    }




}
