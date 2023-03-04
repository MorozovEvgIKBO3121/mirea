package lab5;

public abstract class Furniture {
    public String type;
    public int price;

    public void setTypePrice(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Тип мебели - " + type +
                "\nЦена: " + price +" долларов\n";
    }
}
