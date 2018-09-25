package util;

public class Square extends Rectangle {
    private int side;
    public Square(int side) {
        super(side,side);
        this.side = side;
    }
    public int getPerimeter() {
        return 4 * side;
    }
    public int getArea() {
        return side * side;
    }
}
