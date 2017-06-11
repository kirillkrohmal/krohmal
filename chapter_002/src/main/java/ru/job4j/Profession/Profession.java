package ru.job4j.Profession;


public class Profession {
    public String name;
    public int diplom;
    public int experience;

    public Profession(String name, int diplom, int experience) {
        this.name = name;
        this.diplom = diplom;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public int getDiplom() {
        return diplom;
    }

    public String getName() {
        return name;
    }
}