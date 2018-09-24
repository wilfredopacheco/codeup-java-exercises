import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives =   {"emotional", "ugly", "unhappy",
                                 "tiny", "lonely", "nervous",
                                 "guilty", "conscious", "realistic",
                                 "unstable"};

        String[] nouns =        {"atom", "chocolate", "thought",
                                 "pizza", "pie", "camera",
                                 "soup", "army", "speaker",
                                 "cigarette"};

        System.out.println("Here is your server name: \n" + random(adjectives) + "-" + random(nouns));

    }

    public static String random(String[] array) {
        String str;
        Random rand = new Random();
        int num = rand.nextInt(10);
        str = array[num];
        return str;
    }

}
