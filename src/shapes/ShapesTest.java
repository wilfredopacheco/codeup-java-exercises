package shapes;

public class ShapesTest {

    public static void main(String [] args) {
        Measurable box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Measurable box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }

}

//
//    Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//        display the shape's area and circumference
//        Test your code by creating instances of both Square and Rectangle and assigning them to myShape.
//
//        Answer the following questions:
//
//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//
//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?