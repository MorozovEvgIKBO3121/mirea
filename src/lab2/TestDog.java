package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {
/*    Dog dog1 = new Dog("Шарик", 5);//пример
        System.out.println(dog1);
        System.out.println("_______________________");*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива собак: ");
        int size = scanner.nextInt();
        Dog[] dogs = new Dog[size];
        System.out.println("Введите клички собак: ");
        String[] names = new String[size];
        names[0] = scanner.nextLine();
        for (int i = 0; i < size;) {
            names[i] = scanner.nextLine();
            i++;
        }
        System.out.println(Arrays.toString(names));
        System.out.println("Введите последовательно их возраст: ");
        int[] ages = new int[size];
        for (int i = 0; i < size; i++) {
            ages[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(ages));
        for (int i = 0; i < size; i++) {
            dogs[i] = new Dog(names[i], ages[i]);
        }
        System.out.println("Получившийся массив: ");
        System.out.println(Arrays.toString(dogs));
    }
}

