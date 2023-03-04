package lab13;

public class Shirt {
    private String shirtId;
    private String shirtDescription;
    private String shirtColor;
    private String shirtSize;

    public Shirt(String id, String description, String color, String size) {
        this.shirtId = id;
        this.shirtDescription = description;
        this.shirtColor = color;
        this.shirtSize = size;
    }

    public String toString() {
        return "Shirt ID: " + shirtId + "\nShirt Description: " + shirtDescription + "\nShirt Color: " + shirtColor + "\nShirt Size: " + shirtSize + "\n";
    }


}