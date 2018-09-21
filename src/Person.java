import javax.swing.*;

public class Person {

    // This is a private name property String and follows the methods below.
    private String name;

    // Constructor
    // when Person class is called to make a new person,
    // it sets the string passed as the name.
    Person(String name){
        this.name = name;
    }

    // getter
    // returns the person's name
    public String getName() {
        return name;
    }


    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        JOptionPane.showMessageDialog(null,"Well hello there " + getName() + "!");
    }


    public static void main(String [] args) {

//        Person salty = new Person();
//        salty.setName("Salty");
//        salty.sayHello();
//
//        Person person = new Person();
//        String input = JOptionPane.showInputDialog("Please enter your name: ");
//
//        person.setName(input);
//        person.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);


//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.exit(0);


    }


}
