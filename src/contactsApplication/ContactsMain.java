package contactsApplication;
import util.Input; // Input class
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths; // Paths Class
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.nio.file.Path;
import java.util.ArrayList;

public class ContactsMain {
    public static void main(String[] args) {
        PhoneNumberFormat number = new PhoneNumberFormat();
        System.out.println(number.formatToPhoneNumberFormat("Wil 2104222508"));

        Input input = new Input(); // instantiates input class
        String userIn;
        int userSelect;
        List<String> myContacts;
    do {
            System.out.println("\n\n1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n\n\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            userSelect = input.getInt(); //input from user
        if (userSelect != 5) {
            if (userSelect == 1) {
                myContacts = loadContacts();
                System.out.println("   Name   | Phone Number");
                System.out.println("------------------------------");
                for (String person : myContacts) System.out.println(person);
            }
            if (userSelect == 2) {
                System.out.println("\nPlease enter the new name and number: ");
                userIn = input.getString();
                addContact(userIn);
            }
            if (userSelect == 3) {
                System.out.println("\nPlease enter the name you are looking for: ");
                userIn = input.getString();
                searchContacts(userIn);
            }
            if (userSelect == 4) {
                System.out.println("\nPlease enter the name you want to delete: \n");
                userIn = input.getString();
                deleteContact(userIn);
            }
        }
    } while (userSelect != (5));
            System.exit(0);
}
    public static List<String> loadContacts() {
        Path folder = Paths.get("./data");
        Path file = Paths.get("./data", "contacts.txt");
        List<String> contactList = new ArrayList<>();
        try {
            if (Files.notExists(file)){
                Files.createFile(file);
            }
            if (Files.notExists(folder)) {
                Files.createDirectory(folder);
            }
            if (Files.exists(file)) {
                contactList = Files.readAllLines(file);
            }
        } catch (IOException e) {
            System.out.println("\nSomething went wrong!");
            System.out.println(e);
        }
//        System.out.println(folder.toAbsolutePath());
        return contactList;
    }
    public static void addContact(String newGuy) {
        Path file = Paths.get("./data", "contacts.txt");
        List<String> list = new ArrayList<>();
        list.add(newGuy);
        try {
            Files.write(file, list, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void searchContacts(String friend) {
        List<String> list = loadContacts();
        for (String contact:list) {
            if (contact.contains(friend)) {
                System.out.println(contact);
            }
        }
    }
    public static void deleteContact(String byeFelicia) {
        Input input = new Input();
        List<String> list = loadContacts();
        List<String> toDelete = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (String contact:list) {
            if (!contact.contains(byeFelicia)) {
                newList.add(contact);
            }
            if (contact.contains(byeFelicia)) {
                toDelete.add(contact);
            }
        }
        saveContacts(newList);
        for (String contact:toDelete) {
            System.out.println("Are you sure you want to delete the following contact?");
            System.out.println(contact);
            boolean answer = input.yesNo();
            if(answer) {
                System.out.println("Contact Deleted");
            } else {
                addContact(contact);
            }
        }
    }
    public static void saveContacts(List<String> update) {
        Path folder = Paths.get("./data");
        Path file = Paths.get("./data", "contacts.txt");
        try{
            Files.write(file, update);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}