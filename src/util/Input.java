package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
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
        return scanner.nextInt();
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
        return scanner.nextDouble();
    }

    public int getInt(String str) {
        int result = Integer.parseInt(str);
        return result;
    }
    public double getDouble(String str) {
        double result = Double.parseDouble(str);
        return result;
    }

}
