package lab2;

public class Shape {
    private String shapeType;
    private int square;
    private String colour;

    public Shape() {

    }
    public Shape(String shapeType, int square, String colour){
        this.shapeType = shapeType;
        this.square = square;
        this.colour = colour;
    }
    @Override
    public String toString() {
        return "Shape {" +
                "Вид: " + shapeType +", Площадь: " + square + " см" +
                ", Цвет: " + colour +
                "}";
    }

}
