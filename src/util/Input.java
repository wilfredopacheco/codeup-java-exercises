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
