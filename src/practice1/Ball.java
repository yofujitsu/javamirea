package practice1;

public class Ball {
    private int size;
    public Ball(int size) {
        this.size = size;
    }

    public Ball() {size = 0;}

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
}
