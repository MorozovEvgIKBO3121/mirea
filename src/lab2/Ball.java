package lab2;

public class Ball {
    private int id;

    public Ball() {

    }
    public Ball(int id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "Ball {" +
                "id: " + id +
                "}";
    }
}
