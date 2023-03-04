package lab12;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.random;

public class StudentID1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Vasiliy");
        Student student2 = new Student("Ilya");
        Student student3 = new Student("Ivan");
        Student student4 = new Student("Nikolay");
        Student student5 = new Student("Sergey");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int[] IdNumber = new int[5];
        for (int i = 0; i < 5; i++) {
            IdNumber[i] = (int) (random()*100);
        }
        System.out.println(Arrays.toString(IdNumber));

        for (int left = 0; left < IdNumber.length; left++) {
            int value = IdNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < IdNumber[i]) {
                    IdNumber[i + 1] = IdNumber[i];
                } else {
                    break;
                }
            }
            IdNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(IdNumber));

        for (int i = 0; i < 5; i++) {
            students.get(i).setId(IdNumber[i]);
        }
        System.out.println(students);
        }
    }

