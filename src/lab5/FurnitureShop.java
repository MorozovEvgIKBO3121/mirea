package lab5;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Chair chair1 = new Chair();
    chair1.setTypePrice("Венецианский стул", 100);
        System.out.println(chair1);

    Table table1 = new Table();
    table1.setTypePrice("Cоветский стол-книжка", 1000000);
        System.out.println(table1);

        System.out.print("Сверху виден каталог товаров, введите тип мебели, который собираетесь приобрести: ");
        String type = scanner.nextLine();

        switch (type) {

            case "стол":
                System.out.print("Введите количество денег, которые отдаёте за товар: ");
                int money = scanner.nextInt();
                table1.buy(table1, money);
                break;

            case "стул":
                System.out.print("Введите количество денег, которые отдаёте за товар: ");
                int money2 = scanner.nextInt();
                chair1.buy(chair1, money2);
                break;

            default:
                System.out.println("Вы ввели неправильно тип мебели!");
                break;
        }
    }
}
