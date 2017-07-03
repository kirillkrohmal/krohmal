package ru.job4j.Profession.employee;


import ru.job4j.Profession.Book;
import ru.job4j.Profession.person.Children;
import ru.job4j.Profession.Profession;
import ru.job4j.Profession.TextBook;

public class Teacher extends Profession {
    public Teacher(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public TextBook teach(Teacher teacher, Children children, TextBook textBook) {
        System.out.println(String.format("Учитель %s обучает %s из учебника %s", teacher.name, children.name, textBook.name));
        return textBook;
    }

    public Book write(Teacher teacher, Children children, Book book) {
        System.out.println(String.format("Учитель %s пишет в %s для %s", teacher.name, book.name, children.name));
        return book;
    }

    public TextBook read(Teacher teacher, Children children, TextBook textBook) {
        System.out.println(String.format("Учитель %s читает в %s для %s", teacher.name, textBook.name, children.name));
        return textBook;
    }

    public Book scream(Teacher teacher, Children children, Book book) {
        System.out.println(String.format("Учитель %s кричит %s слова из %s", teacher.name, children.name, book.name));
        return book;
    }
}