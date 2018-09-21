package util;

public class InputTest {
    public static void main(String [] args) {
        int min = 1;
        int max = 50;
        Input input = new Input();

        System.out.println("Do you want to play a game?");
        String answer = input.getString();

        System.out.println("You answered: " + answer + " which to me means that's cool." );

        System.out.println("You answered: "+ input.getInt(min,max) + " great job!");



    }
}
