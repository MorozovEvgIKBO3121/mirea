package lab14;

import java.util.Scanner;

import static lab14.main.*;

public class Number1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter an input string:");
            String inputString = scanner.nextLine();

            System.out.println("Splitting the input string into words:");
            splitStringToWords(inputString);

            System.out.println("Enter a substring to search for:");
            String substring = scanner.nextLine();

            System.out.println("Searching for the substring in the input string:");
            findSubstringInString(inputString, substring);

            System.out.println("Enter a character to replace:");
            char oldChar = scanner.nextLine().charAt(0);
            System.out.println("Enter a replacement character:");
            char newChar = scanner.nextLine().charAt(0);

            System.out.println("Replacing the character in the input string:");
            replaceCharactersInString(inputString, oldChar, newChar);

            System.out.println("Removing whitespace characters from the input string:");
            removeWhitespaceFromString(inputString);
        }
    }
