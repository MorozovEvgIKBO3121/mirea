package lab7.Part2;

public class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int x2, int y2, int xSpeed, int ySpeed){
        this.bottomRight = new MovablePoint(x, y, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "Положение прямоугольника в данный момент" + "\nПо оси х сверху справа: " + bottomRight.x +
                "\nПо оси у сверху справа: " + bottomRight.y + "\nПо оси х снизу слева: " + topLeft.x
                + "По оси у снизу слева: " + topLeft.y
                + "\nСкорость по оси х: " + bottomRight.xSpeed + "\nСкорость по оси у: " + bottomRight.ySpeed;
    }


    @Override
    public void moveUp() {
        topLeft.y += ySpeed;
        bottomRight.y += ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= ySpeed;
        bottomRight.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x = topLeft.x - xSpeed;
        bottomRight.x = bottomRight.x - xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x = topLeft.x + xSpeed;
        bottomRight.x = bottomRight.x + xSpeed;
    }
}
