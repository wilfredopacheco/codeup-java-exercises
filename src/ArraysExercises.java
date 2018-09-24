import java.util.*;

public class ArraysExercises {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        String show = Arrays.toString(numbers);
        System.out.println(show);

//        String[] People =  {"John", "Paul", "Ringo"};
        Person[] people = new Person[3];
        Person John = new Person("John");
        people[0]= John;
        Person Paul = new Person("Paul");
        people[1] = Paul;
        Person Ringo = new Person("Ringo");
        people[2] = Ringo;
        Person[] peopleList =  addPerson(people, "George").clone();
        for (Person person:peopleList){
            System.out.println(person.getName());
        }
    }
    // returns the array sent in reverse order.
    public int[] reverse(int[] nums) {
        int [] backwards = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            backwards[backwards.length -i -1] = nums[i];
        }
        return backwards;
    }
    public static Person[] addPerson(Person[] array, String name) {
        Person person = new Person(name);
        Person [] result = new Person[array.length + 1];
        Arrays.fill(result, person);
        for (int i = 0; i < array.length; i++) {
            result[i] = (array[i]);
        }
        return result;
    }
}
