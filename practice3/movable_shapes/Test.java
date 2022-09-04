package practice3.movable_shapes;

public class Test {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 100, 150);
        System.out.println(p1);
        p1.moveDown();
        p1.moveLeft();
        System.out.println(p1);

        MovableCircle c1 = new MovableCircle(0, 0, 100, 200, 10);
        System.out.println(c1);
        c1.moveRight();
        c1.moveUp();
        c1.moveUp();
        System.out.println(c1);

        MovableRectangle r1 = new MovableRectangle(10, -3, 45, 9, 90, 50);
        System.out.println(r1);
        r1.moveUp();
        r1.moveRight();
        r1.moveDown();
        System.out.println(r1);
    }
}
