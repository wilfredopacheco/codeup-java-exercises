import java.util.Scanner;


public class HighLow {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String [] args) {
        playGame();
    }

    public static void playGame() {

        int userGuess = getInt();


        int randomNumber = (int)(Math.ceil(Math.random() * 100));
        System.out.println("Please guess a number between 1 and 100");
        do {

        }
// ctrl command spacebar
    }
    public static int getInt(int min, int max){
        int userInt = scan.nextInt();

        if(userInt >= min && userInt <= max ){
            return userInt;
        } else {
            System.out.println("Make sure you are between min and max.");
            return getInt(min, max);

        }
    }
}
