import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String [] args) {
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
        int i = 5;
        while (i <= 15){
            System.out.print(i++ + " ");
        }
        System.out.println("\n");
//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536
        long j = 2;
        do {
            System.out.println(j);
            j *= j;
        } while (j<1000000);
        System.out.println("\n");
//        For
//
//        refactor the previous two exercises to use a for loop instead
        for (long r = 2; r < 1000000; r*=r) {

            System.out.println(r);
        }
//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
// Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.
        String fizz = "Fizz";
        String buzz = "Buzz";
        for (int k = 0; k <= 100; k++){
            if (k%15 == 0){
                System.out.println(fizz + buzz);
            } else if (k%3 == 0){
                System.out.println(fizz);
            } else if (k%5 == 0){
                System.out.println(buzz);
            } else {
                System.out.println(k);
            }
        }
//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to see the table of squares and cubes?");
        String answer = scanner.nextLine();
        if (answer.toLowerCase().contains("y")) {
            System.out.println("What number would you like to go up to?");
            int input = scanner.nextInt();
            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | ------");
            int n;
            for ( n = 0; n <= input; n++)
                if (n*n >= 10){
                    System.out.println(n + "      | " + (n*n) + "      | " + (n*n*n));
                } else {
                    System.out.println(n + "      | " + (n*n) + "       | " + (n*n*n));
                }
        }
//        Convert given number grades into letter grades.
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        Scanner secondscanner = new Scanner(System.in);

        System.out.println("Would you like to make to see your numerical grade as a letter grade?");
        String newAnswer = secondscanner.nextLine(); //catches the space allowing user to proceed to next question
//        answer = scanner.nextLine();
//System.out.println("answer" + answer);
        if (newAnswer.toLowerCase().contains("y")) {
            System.out.println("Please enter your numerical grade (0-100)");
            int userGrade = scanner.nextInt();
            String bonus = Plus(Integer.toString(userGrade));
            if (userGrade > 87) {
                System.out.format("You received an 'A%s'", bonus);
            } else if (userGrade < 88 && userGrade > 79) {
                System.out.format("You received a 'B%s'", bonus);
            } else if (userGrade < 80 && userGrade > 66) {
                System.out.format("You received a 'C%s'", bonus);
            } else if (userGrade < 67 && userGrade > 59) {
                System.out.format("You received a 'D%s'", bonus);
            } else if (userGrade < 59){
                System.out.format("You received an 'F%s'", bonus);
            }
        }
        System.exit(0);
    }
    private static String Plus(String num){
        String plus = "+";
//        String minus = "-";
        String result= "-";
        // converts integer to string allowing us to evaluate the second character
        char n = num.charAt(1);
//        System.out.println(n);
        if (Integer.parseInt(num) == 0) {
            result = "";
        } else if (Character.getNumericValue(n) > 4) {
            result = plus;
        }
        return result;
    }
}
