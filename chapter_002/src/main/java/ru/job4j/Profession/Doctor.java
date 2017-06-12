package ru.job4j.Profession;


public class Doctor extends Profession {
    public Doctor(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public Table operate(Doctor doctor, Pacient pacient, Table table) {
        String.format("Доктор " + doctor.name + " оперирует на " + table.name + " " + pacient.name);
        return table;
    }

    public Table heal(Doctor doctor, Pacient pacient, Table table) {
        String.format("Доктор " + doctor.name + " лечит на " + table.name + " " + pacient.name);
        return table;
    }

    public Table tellJokes(Doctor doctor, Pacient pacient, Table table) {
        String.format("Доктор " + doctor.name + " шутит с " + pacient.name + " на " + table);
        return table;
    }

    public Wine drink(Doctor doctor, Pacient pacient, Wine wine) {
        String.format("Доктор " + doctor.name + " выпивает с " + pacient.name + " " + wine);
        return wine;
    }
}