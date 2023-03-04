package lab7.Part2;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    @Override
    public String toString() {
        return "Положение точки в данный момент" + "\nПо оси х: " + x + "\nПо оси у: " + y
                + "\nСкорость по оси х: " + xSpeed + "\nСкорость по оси у: " + ySpeed;
    }

    public void moveUp(){
        this.y += ySpeed;
    }

    public void moveDown(){
        this.y -= ySpeed;
    }

    public void moveLeft(){
        this.x -= xSpeed;
    }

    public void moveRight(){
        this.x += xSpeed;
    }
}
