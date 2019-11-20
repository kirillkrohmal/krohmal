package ru.job4j.profession.employee;


import ru.job4j.profession.Profession;
import ru.job4j.profession.Table;
import ru.job4j.profession.Wine;
import ru.job4j.profession.person.Pacient;

public class Doctor extends Profession {
    public Doctor(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public Table operate(Doctor doctor, Pacient pacient, Table table) {
        System.out.println(String.format("Доктор %s оперирует на %s своего пациента %s", doctor.name, table.name, pacient.name));
        return table;
    }

    public Table heal(Doctor doctor, Pacient pacient, Table table) {
        System.out.println(String.format("Доктор %s лечит на столе %s своего пациента %s", doctor.name, table.name, pacient.name));
        return table;
    }

    public Table tellJokes(Doctor doctor, Pacient pacient, Table table) {
        System.out.println(String.format("Доктор %s шутит со своим пациентом %s на столе %s", doctor.name, pacient.name, table.name));
        return table;
    }

    public Wine drink(Doctor doctor, Pacient pacient, Wine wine, Table table) {
        System.out.println(String.format("Доктор %s выпивает %s со своим пациентом %s на столе %s", doctor.name, pacient.name, wine.name, table.name));
        return wine;
    }


}