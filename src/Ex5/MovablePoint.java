package Ex5;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint (int xIN, int yIN, int xSpeedIN, int ySpeedIN) {
        x = xIN;
        y = yIN;
        xSpeed = xSpeedIN;
        ySpeed = ySpeedIN;
    }
    public String toString() {
        String out= "Coordinates:"+x+","+y+" Speed:"+xSpeed+","+ySpeed;
        return out;
    }

    @Override
    public void moveUp() {
        x++;
    }

    @Override
    public void moveDown() {
        x--;
    }

    @Override
    public void moveRight() {
        y++;
    }

    @Override
    public void moveLeft() {
        y--;
    }
}
