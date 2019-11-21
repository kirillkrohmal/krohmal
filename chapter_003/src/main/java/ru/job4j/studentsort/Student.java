package ru.job4j.studentsort;

/**
 * Created by Comp on 05.08.2017.
 */
public class Student implements Comparable<Student> {

    private int age;
    private int gpa;
    private String fullname;

    public Student(int age, int gpa, String fullName) {
        this.age = age;
        this.gpa = gpa;
        this.fullname = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        age = age;
    }

    public int getGPA() {
        return gpa;
    }

    public void setGPA(int gpa) {
        this.gpa = gpa;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        fullname = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;

        if (age != student.age) {
            return false;
        }
        if (gpa != student.gpa) {
            return false;
        }
        return fullname != null ? fullname.equals(student.fullname) : student.fullname == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + gpa;
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{"
                + "Age=" + age
                + ", GPA=" + gpa
                + ", FullName='" + fullname + '\''
                + '}';
    }
   /* @Override
    public int compareTo(Student o1, Student o2) {
        int gpa = o1.getGPA();
        int gpa2 = o2.getGPA();

        if (gpa > gpa2) {
            return 1;
        } else if (gpa < gpa2) {
            return -1;
        } else {
            return 0;
        }
    }*/

    @Override
    public int compareTo(Student o) {
        int compareAge = this.age - o.age;
        int compareGPA = this.gpa - o.gpa;
        String compareFullName = String.valueOf(this.fullname.compareTo(o.getFullName()));


        return fullname.compareTo(o.getFullName());
    }
}
