package lab6;

public class TestInterface2 {
    public static void main(String[] args) {
        Table table1 = new Table(100);
        table1.getPrice();

        System.out.println();

        Chair chair1 = new Chair(2000);
        chair1.getPrice();
    }
}
