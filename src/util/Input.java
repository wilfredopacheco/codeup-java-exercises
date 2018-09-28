
/*
my Input.class is overloaded and can receive a string and convert it to either an int or double.
In doing so this example shows how my Input.class handles errors and works to solve the problem
when the user enters a value that is not recognized.

The following is used to import the Input.class:

import util.Input;

 -----------the following is a few examples step by step, how the class handles certain errors-----------


Input input = new Input(); // This introduces an new instance of Input class
        System.out.println("enter a number"); // asks the user for a number
        String user = input.getString(); // gets the input as a string
        // calls the getInt(passing a string) class from the user to display
        System.out.println(input.getInt(user));
        System.out.println("enter a number"); // asks user for another number
        int user2; // sets user2 for the user input
        try {
        user2  = input.getInt(); // calls getInt() with nothing passing to it like above
        System.out.println(user2); // prints the input
        }
        // catches the StackOverflowError received when passing anything other than an integer
        catch (StackOverflowError e) {
        // now calls the getInput(passing the input as a string) to loop as done in example above
        user = input.getString();
        System.out.println(input.getInt(user)); // prints number
        }
*/
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner; // scanner used for entire class

    // Constructor for Input class
    public Input(){
        scanner = new Scanner(System.in).useDelimiter("\n");
    }
    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String str = getString();
        boolean result = false;
        if (str.toLowerCase().equals("y") || str.toLowerCase().equals("yes")) {
            result = true;
        }
        return result;
    }
    public int getInt(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max + ".");
        int num = getInt();
        if (num<max && num>min){
            return num;
        }
        return (getInt(min,max));
    }
    public int getInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your number is invalid. ");
            String str = getString();
            return getInt(str);
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max + ".");
        double num = getDouble();
        if (num<max && num>min){
            return num;
        }
        return (getDouble(min,max));
    }
    public double getDouble() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your number is invalid, please try again: ");
            return getDouble();
        }
    }

    public int getInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("You entered an invalid integer, please try again: ");
            str = getString();
            return getInt(str);
        }
    }
    public double getDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid number, please try again: ");
            str = getString();
            return getDouble(str);
        }
    }

}
