import java.text.*;
import java.util.Scanner;

public class ConsoleExercises {

    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(output);
    }

    public static void main (String[] args){
        double pi = 3.14159;


        // Should output the following: The value of pi is approximately 3.14.
        customFormat ("#.##", pi); // a different way to print in the same format
        System.out.format ("%.2f%n", pi);

//        Explore the Scanner Class
//
//        Prompt a user to enter a integer and store that value in an int variable using
// the nextInt method.
//

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int input = scanner.nextInt();

//        What happens if you input something that is not an integer?
        // Answer: Error and the program stops.
//        Prompt a user to enter 3 words and store each of them in a separate variable,
// then display them back, each on a newline.

        String wordOne, wordTwo, wordThree;
        System.out.println("Please enter three of your favorite colors.");
        wordOne = scanner.next();
        wordTwo = scanner.next();
        wordThree = scanner.nextLine();
        System.out.format("%s%n%s%n%s%n", wordOne, wordTwo,wordThree);
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        String sentence = scanner.nextLine();
//        System.out.println(sentence);
//
//                What happens if you enter less than 3 words?
                // Answer: the program doesn't continue
//                What happens if you enter more than 3 words?
                // Answer: the program omits anything after three words.
//                Prompt a user to enter a sentence,
// then store that sentence in a String variable using the .next method,
// then display that sentence back to the user.
        System.out.println("Please enter a sentence.");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);
//
//        do you capture all of the words?
//        Rewrite the above example using the .nextLine method.
//
//        Calculate the perimeter and area of Codeup's classrooms
        System.out.println("Please enter the length and width of your Codeup classroom in feet.");
        float length = scanner.nextFloat();

//        System.out.println("Please enter the width of your Codeup classroom.");
        float width = scanner.nextFloat();

        float perimeter = (2 * length) + (2*width);
        float area = (length * width);

        System.out.println("The perimeter of your classroom is: " + perimeter + "ft.");
        System.out.println("The area of your classroom is: " + area + "ft.");



//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the .nextLine method to get user input and cast the resulting
// string to a numeric type.
//
//                Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width,
// and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//                Bonuses
//
//        Accept decimal entries
//        Calculate the volume of the rooms in addition to the area and perimeter
//        The Scanner class can be told specifically what characters or pattern
// separates tokens in a piece of input with the useDelimeter method.
// Add the following line of code to your application after you have created a
// scanner (assuming the variable the holds the scanner is named scanner):
//

        // Volume of a room is length times width times height
        float height;
        System.out.println("Please enter the length, width, and height of your Codeup classroom.");

        length = scanner.nextFloat();
        width = scanner.nextFloat();
        height = scanner.nextFloat();
        float volume = length * width * height;
        System.out.println("The volume of your classroom is: " + volume);
//
//        scanner.useDelimeter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom calculating program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
//


        System.exit(0);
    }



}
