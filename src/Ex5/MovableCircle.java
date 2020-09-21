package Ex5;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int xIN, int yIN, int xSpeedIN, int ySpeedIN) {
        center= new MovablePoint(xIN, yIN, xSpeedIN, ySpeedIN);
    }

    public String toString() {
        return center.toString();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }
}
