package practice1;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(10);
        Ball ball2 = new Ball();
        ball2.setSize(5);
        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
    }
}
