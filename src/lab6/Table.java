package lab6;

public class Table implements Priceable{
    private int price;

    public Table(int price) {
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Цена стола: " + price + " долларов");
    }
}
