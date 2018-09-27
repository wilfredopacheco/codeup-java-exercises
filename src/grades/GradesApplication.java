package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap();
        ArrayList <Integer> zackGrades = new ArrayList<>();
        zackGrades.add(90);
        zackGrades.add(90);
        zackGrades.add(70);
        Student Zack = new Student("Zack", zackGrades);
        students.put("zgulde", Zack);

        ArrayList <Integer> ryanGrades = new ArrayList<>();
        ryanGrades.add(90);
        ryanGrades.add(0);
        ryanGrades.add(70);
        Student Ryan = new Student("Ryan", ryanGrades);
        students.put("ryanorsinger", Ryan);

        ArrayList <Integer> jreichGrades = new ArrayList<>();
        jreichGrades.add(90);
        jreichGrades.add(80);
        jreichGrades.add(80);
        Student jreich = new Student("jreich", jreichGrades);
        students.put("jreich5", jreich);

        ArrayList <Integer> fernandoGrades = new ArrayList<>();
        fernandoGrades.add(90);
        fernandoGrades.add(80);
        fernandoGrades.add(76);
        Student Fernando = new Student("Fernando", fernandoGrades);
        students.put("fmendozaro", Fernando);

        Input input = new Input();
        System.out.println("\n--------------------------------------------");
        System.out.println("                  Welcome!\n");
        String answer = "yes";
        while(answer == "yes") {
            getWelcome();
            for (String git: students.keySet())
                System.out.print("|" + git + "| ");
            System.out.println("\n----------------------------------------------");
            String userIn = input.getString();
            if (students.containsKey(userIn)) {
                Student s = students.get(userIn);
                System.out.println("\nName: " + s.getName()
                        + " - Github Username: " + userIn
                        + "\nCurrent Average: " + String.format("%.2f", s.getGradeAverage()) + "\n");
            }
            System.out.println("Would you like to see another student?\n");
            userIn = input.getString();
            if (!userIn.toLowerCase().equals(answer) || userIn.toLowerCase() == "no") {
                answer= "no";
            }
        }
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void getWelcome() {
        System.out.println("Who would you like to see more information on?");
        System.out.println("----------------------------------------------");
    }

    public static void showStudent(Object object) {


    }

}
