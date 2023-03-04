package lab7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return length + length + width + width;
    }

    @Override
    public String toString() {
        return "Тип фигуры: прямоугольник" + "\nШирина фигуры: " + width +
                "\nВысота фигуры" + length +
                "\nПлощадь фиугры: " + getArea() + "\nПериметр фигуры: " + getPerimeter() +
                "\nЦвет фигуры: " + color + "\nЗаполнена ли фигура: " + filled;
    }
}