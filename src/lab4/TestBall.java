package lab4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(3.0, 1.0);
        System.out.println(ball1);

        ball1.move(5.0, -8.0);
        System.out.println(ball1);

        ball1.setX(-7.0);
        System.out.println(ball1);
    }
}
