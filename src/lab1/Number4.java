package lab1;

import static java.lang.Math.random;

public class Number4 {
    public static void main(String[] args) {
        int SIZE = 10;
        int arr[] = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = (int) (Math.random()*10);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("_______________________");
        for (int i = 0; i < SIZE; i++){
            System.out.println(arr[i]);
        }
        System.out.println("________________________");
        for (int i = 0; i < SIZE; i++){
            arr[i] = (int) (random()*10);
            System.out.println(arr[i]);
        }
        System.out.println("________________________");
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        for (int i = 0; i < SIZE; i++){
            System.out.println(arr[i]);
        }
    }

}



