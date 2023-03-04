package Lab21;

import java.util.ArrayList;
import java.util.List;

public class Number1 {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"один", "два", "три"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3};
        List<Integer> intList = arrayToList(intArray);
        System.out.println(intList);
    }
}