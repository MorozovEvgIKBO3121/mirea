package lab3;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя человека: ");
        String name = scanner.nextLine();

        System.out.print("\nВведите размер его головы (большая/маленькая/средняя): ");
        String sizeHead = scanner.nextLine();

        System.out.print("\nВведите размер его рук (большие/маленькие/средние): ");
        String sizeHands = scanner.nextLine();

        System.out.print("\nВведите размер его ног (размер обуви): ");
        int sizeLegs = scanner.nextInt();

        Head head1 = new Head(sizeHead);
        Hand hand1 = new Hand(sizeHands);
        Leg leg1 = new Leg(sizeLegs);

        System.out.println();
        Human human1 = new Human(name, head1, leg1, hand1);
        human1.showHuman();


    }
}
