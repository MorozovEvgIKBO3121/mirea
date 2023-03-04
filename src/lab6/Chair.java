package lab6;

public class Chair implements Priceable{
    private int price;

    public Chair(int price) {
        this.price = price;
    }

    public void getPrice() {
        System.out.println("Цена стула: " + price + " долларов");
    }
}
