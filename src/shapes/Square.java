package shapes;


public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
//        setLength(side);
//        setWidth(side);
    }

//    public Square(int side) {
//        super(side,side);
//    }
//    public int getPerimeter() {
//        return 4 * length;
//    }
//    public int getArea() {
//        return length * length;
//    }
//    --------------------------------------------------------



    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * length);
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
