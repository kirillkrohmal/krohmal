package ru.job4j.Profession;


public class Teacher extends Profession {
    public Teacher(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public TextBook teach(Teacher teacher, Children children, TextBook textBook) {
        String s = String.format("Учитель " + teacher.name + " учит " + textBook + " " + children.name);
        System.out.println(s);
        return textBook;
    }

    public Book write(Teacher teacher, Children children, Book book) {
        String s = String.format("Учитель " + teacher.name + " пишет в " + book + " " + children.name);
        System.out.println(s);
        return book;
    }

    public TextBook read(Teacher teacher, Children children, TextBook textBook) {
        String s = String.format("Учитель " + teacher.name + " читает в " + textBook + " " + children.name);
        System.out.println(s);
        return textBook;
    }

    public Book scream(Teacher teacher, Children children, Book book) {
        String s = String.format("Учитель " + teacher.name + " кричит слова из " + book + " " + children.name);
        System.out.println(s);
        return book;
    }
}