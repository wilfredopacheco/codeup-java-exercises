package shapes;



public class Rectangle extends Quadrilateral implements Measurable {

//    protected int length, width;
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//    public int getArea() {
//        int area = length * width;
//        return area;
//    }
//    public int getPerimeter() {
//        int perimeter = (2 * length) + (2 * width);
//        return perimeter;
//    }
    //--------------------------------------------------


    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public Rectangle(int length, int width) {
        super(length, width);
//        setLength(length);
//        setWidth(width);

    }
}
