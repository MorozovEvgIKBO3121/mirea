package lab1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int SIZE = scanner.nextInt();
        int array[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int) (random()*10);
        }
        System.out.println(Arrays.toString(array));
        int i = 0;
        while (i < SIZE){
            array[i] = (int) (random()*10);
        i++;
        }
        System.out.println(Arrays.toString(array));

        int j = 0;
        do{
            array[j] = (int) (random()*10);
            j++;
        }while (j<SIZE);
        System.out.println(Arrays.toString(array));

    }
}
