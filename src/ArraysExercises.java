import java.util.*;

public class ArraysExercises {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        String show = Arrays.toString(numbers);
        System.out.println(show);

        String[] People =  {"John", "Paul", "Ringo"};
        People = addPerson(People, "George");
        show = Arrays.toString(People);
        System.out.println(show);

    }
    // returns the array sent in reverse order.
    public int[] reverse(int[] nums) {
        int [] backwards = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            backwards[backwards.length -i -1] = nums[i];
        }
        return backwards;
    }
    public static String[] addPerson(String[] array, String name) {
        String [] result = new String [array.length + 1];
        Arrays.fill(result, name);
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
