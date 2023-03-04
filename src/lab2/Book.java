package lab2;

public class Book {
    private int size;
    private String colour;

    public Book() {

    }
    public Book(int size, String colour){
        this.size = size;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Book {" +
                "Размер в страницах: " + size + " стр" +
                ", Цвет: " + colour +
                "}";
    }
}
