package ru.job4j.StudentSort;

/**
 * Created by Comp on 05.08.2017.
 */
public class Student implements Comparable<Student> {

    private int Age;
    private int GPA;
    private String FullName;

    public Student(int age, int GPA, String fullName) {
        Age = age;
        this.GPA = GPA;
        FullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Age != student.Age) return false;
        if (GPA != student.GPA) return false;
        return FullName != null ? FullName.equals(student.FullName) : student.FullName == null;
    }

    @Override
    public int hashCode() {
        int result = Age;
        result = 31 * result + GPA;
        result = 31 * result + (FullName != null ? FullName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Age=" + Age +
                ", GPA=" + GPA +
                ", FullName='" + FullName + '\'' +
                '}';
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
        int compareAge = this.Age - o.Age;
        int compareGPA = this.GPA - o.GPA;
        String compareFullName = String.valueOf(this.FullName.compareTo(o.getFullName()));


        return FullName.compareTo(o.getFullName());
    }
}
