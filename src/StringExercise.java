public class StringExercise {
    public static void main (String[] args){

//        For each of the following output examples, create a string variable named message
//        that contains the desired output and print it out to the console.
//        Do this with only one string variable and one print statement.
//
//                We don't need no education
//                We don't need no thought control
//
//        Check "this" out!, "s inside of "s!
//
//                In windows, the main drive is usually C:\
//
//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String message = "\nWe don't need no education\n";

        message = message + "We don't need no thought control\n\n";
        message = message + "Check \"this\" out!, \"s inside of \"s!\n\n";
        message = message + "In windows, the main drive is usually C:\\\n\n";
        message = message + "I can do backslashes \\, double backslashes \\\\,\n";
        message = message + "and the amazing triple backslash \\\\\\!\n";

        System.out.println(message);


    }

}
