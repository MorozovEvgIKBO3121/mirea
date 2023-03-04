package Lab21;

public class Number3 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer elementAtIndex2 = getElementAtIndex(intArray, 2);
        System.out.println(elementAtIndex2);

        String[] stringArray = {"raz", "dva", "tri"};
        String elementAtIndex1 = getElementAtIndex(stringArray, 1);
        System.out.println(elementAtIndex1);

        Double[] doubleArray = {1.1, 2.2, 3.3};
        Double elementAtIndex0 = getElementAtIndex(doubleArray, 0);
        System.out.println(elementAtIndex0);
    }

    public static <T> T getElementAtIndex(T[] array, int index) {
        return array[index];
    }
}