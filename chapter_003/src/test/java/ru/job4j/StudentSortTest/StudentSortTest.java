package ru.job4j.StudentSortTest;


import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

import ru.job4j.StudentSort.Student;
import ru.job4j.StudentSort.StudentSort;

/**
 * Created by Comp on 05.08.2017.
 */

public class StudentSortTest {
    @Test
    public void basicTest() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(23, 88, "David Goodman"));
        students.add(new Student(25, 82, "Mark Rose"));
        students.add(new Student(22, 90, "Jane Doe"));
        students.add(new Student(25, 90, "Jane Dane"));
        assertEquals("Jane Doe, Jane Dane, David Goodman, Mark Rose",
                StudentSort.sort(students));
    }
}

