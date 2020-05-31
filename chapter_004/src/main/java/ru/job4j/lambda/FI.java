package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Student[] atts2 = {
                new Student("Student 1"),
                new Student("Student 2"),
                new Student("Student 3")
        };
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Student student1 = o1;
                Student student2 = o2;

                return student1.getName().compareTo(student2.getName());
            }
        };

        Arrays.sort(atts2, comparator);
    }
}


