package lab3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle(5.2, 7.8, 9.0, "red");
        System.out.println("Длина окружности = " +
                k1.getLength() + " см\n");

        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();

        k1.setR(r);
        System.out.println("\nДлина окружности = " +
                k1.getLength() + " см");
    }
}



