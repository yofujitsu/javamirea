package practice2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(10, 10);
        System.out.println(ball1.toString());
        ball1.move(-10, 12);
        System.out.println(ball1.toString());
    }
}
