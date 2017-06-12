package ru.job4j.Profession;


public class Engineer extends Profession {
    public Engineer(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public Building design(Engineer engineer, Customer customer, Building building) {
        String s = String.format("Инженер " + engineer.name + " конструирует здание " + building + " для " + customer.name);
        System.out.println(s);
        return building;
    }

    public Drawing draw(Engineer engineer, Customer customer, Drawing drawing) {
        String s = String.format("Инженер " + engineer.name + " рисует " + drawing + " для " + customer.name);
        System.out.println(s);
        return drawing;
    }

    public Drawing think(Engineer engineer, Customer customer, Drawing drawing) {
        String s = String.format("Инженер " + engineer.name + " формулирует " + drawing + " для " + customer.name);
        System.out.println(s);
        return drawing;
    }

    public Building manage(Engineer engineer, Customer customer, Building building) {
        String s = String.format("Инженер " + engineer.name + " распоряжается строительством " + building + " для " + customer.name);
        System.out.println(s);
        return building;
    }
}