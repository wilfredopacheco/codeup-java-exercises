/*
Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
Create a String variable named myString and assign a string value to it, then print the variable out to the console.
Change your code to assign a character value to myString. What do you notice?
Change your code to assign the value 3.14159 to myString. What happens?
Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
Change your code to assign the value 3.14 to myNumber. What do you notice?
Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
Change your code to assign the value 123 to myNumber.
Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
Copy and paste the following code blocks one at a time and execute them

What is the difference between the above code blocks? Explain why the code outputs what it does.

Try to create a variable named class. What happens?

Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?


Copy and paste the code above and then run it. Does the result match with your expectation?

How is the above example different from this code block?


int three = (int) "three";
What are the two different types of errors we are observing?

Rewrite the following expressions using the relevant shorthand assignment operators:


What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

How many bytes of memory are allocated to store a variable of this data type ↩




 */

import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null,"Hello World!");

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber); // Prints out myFavoriteNumber to console.

        String myString = "Wilfredo Pacheco";
        System.out.println(myString); // Prints out myString to console.

        long myNumber = 123;

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;


    }


}
