package lab5;

public class Plate extends Dish{
    private String size;
    private String function;

    public Plate() {
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setSizeFunction(String size, String function) {
        this.size = size;
        this.function = function;
    }

    @Override
    public String toString() {
        return "Тип посуды - " + type +
                "\nРазмер: " + size +"\nПредназначение: " + function + "\n";
    }
}
