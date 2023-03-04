package Lab21.Number2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);
        System.out.println(Arrays.toString(genericIntArray.getArray()));

        String[] stringArray = {"raz", "dva", "tri"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);
        System.out.println(Arrays.toString(genericStringArray.getArray()));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        GenericArray<Double> genericDoubleArray = new GenericArray<>(doubleArray);
        System.out.println(Arrays.toString(genericDoubleArray.getArray()));
    }
}