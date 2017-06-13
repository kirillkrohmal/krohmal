package ru.job4j.Profession;


public class Teacher extends Profession {
    public Teacher(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public TextBook teach(Teacher teacher, Children children, TextBook textBook) {
        String.format("Учитель %s обучает %s из учебника %s", teacher.name, children.name, textBook.name);
        return textBook;
    }

    public Book write(Teacher teacher, Children children, Book book) {
        String.format("Учитель %s пишет в %s для %s", teacher.name, book.name, children.name);
        return book;
    }

    public TextBook read(Teacher teacher, Children children, TextBook textBook) {
        String.format("Учитель %s читает в %s для %s", teacher.name, textBook.name, children.name);
        return textBook;
    }

    public Book scream(Teacher teacher, Children children, Book book) {
        String.format("Учитель %s кричит %s слова из %s", teacher.name, children.name, book.name);
        return book;
    }
}