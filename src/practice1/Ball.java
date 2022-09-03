package practice1;

public class Ball {
    private int size;
    private int radius;

    public Ball(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return "Ball{" +
                "size=" + size +
                '}';
    }

    public void printInformation() {
        System.out.println("Ball's size is " + size);
    }
}
