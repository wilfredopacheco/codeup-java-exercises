package movies;
import java.util.*;
import javax.swing.*;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        boolean exit = false;
        int i;
        String input;
        do {
            System.out.println("\nWhat would you like to do?\n");
            System.out.println("0 - exit\n" + "1 - view all movies\n" + "2 - view movies in the animated category\n"
                    + "3 - view movies in the drama category\n" + "4 - view movies in the horror category\n"
                    + "5 - view movies in the scifi category\n");
            System.out.println("Enter your choice:");
            input = scanner.next();
            Movie[] movie = MoviesArray.findAll();
//
//        if (!input.equals("0")) {
//            System.out.println("Goodbye!");
//            System.exit(0);
//        }
            if (input.equals("1")) {
                for (i = 0; i < movie.length; i++) {
                    System.out.println(movie[i].getName() + " -- " + movie[i].getCategory());
                }
            }
            if (input.equals("2")) {
                for (i = 0; i < movie.length; i++) {
                    if (movie[i].getCategory().equals("animated")) {
                        System.out.println(movie[i].getName() + " -- " + movie[i].getCategory());
                    }
                }
            }
            if (input.equals("3")) {
                for (i = 0; i < movie.length; i++) {
                    if (movie[i].getCategory().equals("drama")) {
                        System.out.println(movie[i].getName() + " -- " + movie[i].getCategory());
                    }
                }
            }
            if (input.equals("4")) {
                for (i = 0; i < movie.length; i++) {
                    if (movie[i].getCategory().equals("horror")) {
                        System.out.println(movie[i].getName() + " -- " + movie[i].getCategory());
                    }
                }
            }
            if (input.equals("5")) {
                for (i = 0; i < movie.length; i++) {
                    if (movie[i].getCategory().equals("scifi")) {
                        System.out.println(movie[i].getName() + " -- " + movie[i].getCategory());
                    }
                }
            }
//            System.out.println("Please enter a number from the menu.");
        } while (!input.equals("0"));
        System.out.println("Goodbye!");
        System.exit(0);


    }



//    public static void  show(Arrays[] movie) {
//        for (int i = 0; i < movie.length; i++){
//            System.out.println(movie[i].getName() + " - " + movie[i].getCategory());
//        }
//    }

}
