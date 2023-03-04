package lab2;

public class Tester {
    public static void main(String[] args) {

        Shape shape1 = new Shape("Треугольник", 10, "Розовый");
        System.out.println(shape1);

        Ball ball1 = new Ball(11);
        System.out.println(ball1);

        Book book1 = new Book(200, "Коричневая");
        System.out.println(book1);
    }
}
