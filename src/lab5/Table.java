package lab5;

public class Table extends Furniture {
    public Table() {
    }

    public void buy(Table table, int money) {
        if (table.price == money) {
            System.out.println("\nВы приобрели этот стол!");
        }
        else{
            System.out.println("\nУ вас недостаточно денег!");
        }
    }
}
