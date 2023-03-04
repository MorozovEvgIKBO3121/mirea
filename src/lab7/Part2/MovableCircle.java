package lab7.Part2;

public class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Положение круга в данный момент (радиус которого " + radius + ")" + "\nПо оси х: " + center.x + "\nПо оси у: " + center.y
                + "\nСкорость по оси х: " + center.xSpeed + "\nСкорость по оси у: " + center.ySpeed;
    }

    @Override
    public void moveUp() {
        center.y += ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += xSpeed;
    }
}
