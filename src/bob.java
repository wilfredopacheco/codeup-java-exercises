import java.util.Scanner;
public class bob {
    public static void main(String[] args) {

//        Create a class named Bob with a main method for the following exercise.
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to talk to a lackadaisical teenager named Bob?");
        String firstAnswer = scanner.next();

        System.out.println("Ok, let me get him for you...");
        System.out.println("*Bob walks in*");

        if (firstAnswer.toLowerCase().contains("y")) {
            boolean walkAway = false;
            String input;

            while (walkAway == false){
                for (int i = 0; i < 3; i++){
                input = scanner.nextLine();

                System.out.println(getAnswer(input));
                input = "";
                }
                System.out.println("Would you like to walk away from Bob?");
                input = scanner.next();
                if (input.toLowerCase().contains("y")) {
                    walkAway = true;
                }
//                System.out.println(getAnswer("?"));
            }

        }

    }
    private static String getAnswer(String str) {
        String message;
        if (str.contains("?")) {
            message = "Sure.";
        } else if (str.contains("!")) {
            message = "Whoa, chill out bro!";
        } else if (str.contains(" ")) {
            message = "Fine, Be that way!!";
        } else {
            message = "Whatever";
        }
        return message;
    }
}
