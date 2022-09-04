package practice3.shapes;

public class Square extends Rectangle {
    private double side;

    public Square() {
        super();
        side = 0;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double width, double length, String color, boolean filled, double side) {
        super(width, length, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
