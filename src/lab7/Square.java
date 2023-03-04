package lab7;

public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    public void setWidth (double side) {
        this.width = side;
    }

    public void setLength (double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return "Тип фигуры: квадрат" + "\nСторона фигуры: " + width +
                "\nПлощадь фиугры: " + getArea() + "\nПериметр фигуры: " + getPerimeter() +
                "\nЦвет фигуры: " + color + "\nЗаполнена ли фигура: " + filled;
    }

}
