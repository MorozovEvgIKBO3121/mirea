package lab14;

import java.util.Arrays;

public class Number8 {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "java", "programming"};
        strings = ArrayFilter.filter(strings, new Filter() {
            public boolean apply(Object o) {
                return ((String)o).length() > 4;
            }
        });
        System.out.println(Arrays.toString(strings));
    }
}