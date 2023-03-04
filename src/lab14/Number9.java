package lab14;

import java.util.HashMap;

public class Number9 {
    public static void main(String[] args) {
        String text = "Добрый день! Как дела?";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : freqMap.keySet()) {
            int freq = freqMap.get(c);
            System.out.println(c + " - " + freq);
        }
    }
}
