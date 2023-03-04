package Lab20.Number4;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 5, 7, 9};
        Double[] doubleArray = {1.2, 3.4, 5.6, 7.8, 9.0};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Minimum value in integer array: " + intMinMax.findMin());
        System.out.println("Maximum value in integer array: " + intMinMax.findMax());

        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);
        System.out.println("Minimum value in double array: " + doubleMinMax.findMin());
        System.out.println("Maximum value in double array: " + doubleMinMax.findMax());

        int a = 10;
        double b = 3.14;
        System.out.println("Sum of " + a + " and " + b + " is " + Calculator.sum(a, b));
        System.out.println("Difference between " + a + " and " + b + " is " + Calculator.subtract(a, b));
        System.out.println("Product of " + a + " and " + b + " is " + Calculator.multiply(a, b));
        System.out.println("Quotient of " + a + " and " + b + " is " + Calculator.divide(a, b));
    }
}