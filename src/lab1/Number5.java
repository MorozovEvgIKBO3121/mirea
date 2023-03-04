package lab1;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        int f = scanner.nextInt();
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа равен: " + result);
    }
}
