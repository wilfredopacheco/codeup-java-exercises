package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList <Integer> grades;

    public Student(String name, ArrayList grades) {
        this.name = name;
        this.grades = grades;
    }
    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);

    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
        for (int grade : grades){
            average+= grade;
        }
        return average/grades.size();
    }

//    public static void main(String[] args) {
//        ArrayList <Integer> myGrades = new ArrayList<>();
//        myGrades.add(90);
//        myGrades.add(80);
//        myGrades.add(70);
//
//
//        Student student = new Student("Wilfredo",myGrades);
//        System.out.println(student.getName() + " has an average of " + student.getGradeAverage());
//    }
}
