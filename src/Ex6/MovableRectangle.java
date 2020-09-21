package Ex6;


public class MovableRectangle implements Movable {
    static MovablePoint point1;
    static MovablePoint point2;
    static Rectangle moveRect;
    public MovableRectangle (int x1,int x2, int y1,int y2,
                             int x1Speed, int x2Speed, int y1Speed, int y2Speed,
                             String in_color, boolean in_filled) {
        point1 = new MovablePoint(x1,y1,x1Speed,y1Speed);
        point2 = new MovablePoint(x2,y2,x2Speed,y2Speed);
        moveRect = new Rectangle(x2-x1,y1-y2,in_color,in_filled);
    }

    public boolean speedCheck() {
        return ((point1.xSpeed == point2.xSpeed)&&(point1.ySpeed == point2.ySpeed));
    }
    @Override
    public void moveUp() {
        point1.moveUp();
        point2.moveUp();
    }

    @Override
    public void moveDown() {
        point1.moveDown();
        point2.moveDown();
    }

    @Override
    public void moveRight() {
        point1.moveRight();
        point2.moveRight();
    }

    @Override
    public void moveLeft() {
        point1.moveLeft();
        point2.moveLeft();
    }
}
