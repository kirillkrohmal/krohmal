package ru.job4j.Profession;


public class Engineer extends Profession {
    public Engineer(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public Building design(Engineer engineer, Customer customer, Building building) {
        System.out.println("Инженер " + engineer.name + " конструирует здание " + building + " для " + customer.name);
        return building;
    }

    public Drawing draw(Engineer engineer, Customer customer, Drawing drawing) {
        System.out.println("Инженер " + engineer.name + " рисует " + drawing + " для " + customer.name);
        return drawing;
    }

    public Drawing think(Engineer engineer, Customer customer, Drawing drawing) {
        System.out.println("Инженер " + engineer.name + " формулирует " + drawing + " для " + customer.name);
        return drawing;
    }

    public Building manage(Engineer engineer, Customer customer, Building building) {
        System.out.println("Инженер " + engineer.name + " распоряжается строительством " + building + " для " + customer.name);
        return building;
    }
}