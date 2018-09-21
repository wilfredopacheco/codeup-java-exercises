package shapes;
import util.Input;

public class CircleApp {

    public static void main(String [] args) {
        Input input = new Input();
        System.out.println("What what is the radius of your circle?");
        double rad = input.getDouble();
        Circle circle = new Circle(rad);


        System.out.println("With the radius of: " + circle.getRadius()
                + " has a circumference of " + circle.getCircumference()
                + " and an area of " + circle.getArea()
                + "\nWould you like to try again?");
        input.yesNo();
    }
}
