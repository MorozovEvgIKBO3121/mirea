package lab12.MergeSort;

public class Student {
    private String name;
    private int points;

    public Student(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "(Name: " + name +
                " ID number: " + points + ")";
    }
}