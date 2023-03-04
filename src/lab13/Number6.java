package lab13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number6 {

    public static void main(String[] args) {
        String fileName = "proverka 1 2 3 proverka";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            String[] words = stringBuilder.toString().split(" ");
            String result = getLine(words);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }
        if (words.length == 1) {
            return words[0];
        }
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        StringBuilder resultBuilder = new StringBuilder(wordsList.get(0));
        wordsList.remove(0);

        while (wordsList.size() > 0) {
            String lastWord = resultBuilder.toString().toLowerCase();
            String nextWord = null;
            for (int i = 0; i < wordsList.size(); i++) {
                String currentWord = wordsList.get(i).toLowerCase();
                if (lastWord.charAt(lastWord.length() - 1) == currentWord.charAt(0)) {
                    nextWord = wordsList.get(i);
                    break;
                }
            }
            if (nextWord == null) {
                break;
            }
            resultBuilder.append(" ").append(nextWord);
            wordsList.remove(nextWord);
        }
        return resultBuilder.toString();
    }
}