package lab7;

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * (radius * radius);
    }

    public double getPerimeter() {
        return (PI + PI) * radius;
    }

    @Override
    public String toString() {
        return  "Тип фигуры: круг" + "\nРадиус фигуры: " + radius +
                "\nПлощадь фиугры: " + getArea() + "\nПериметр фигуры: " + getPerimeter() +
                "\nЦвет фигуры: " + color + "\nЗаполнена ли фигура: " + filled;
    }
}
