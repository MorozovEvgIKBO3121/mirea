package lab12.SortingStudents;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Ilya", 1);
        Student student2 = new Student("Vasiliy", 3);
        Student student3 = new Student("Ivan", 2);
        Student student4 = new Student("Sergey", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }


public static class Student implements Comparable<Student>{
    private String name;
    private int points;

    public Student(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "(Name: " +  name +
                " ID number: " + points + ")";
    }

    @Override
    public int compareTo(@NotNull Student anotherStudent) {
        if(this.points == anotherStudent.points){
            return 0;
        }
        else if (this.points < anotherStudent.points){
            return 1;
        }
        else {
            return -1;
        }
    }
}
}