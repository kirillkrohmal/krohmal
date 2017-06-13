package ru.job4j.Profession;


public class Engineer extends Profession {
    public Engineer(String name, int diplom, int experience) {
        super(name, diplom, experience);
    }

    public Building design(Engineer engineer, Customer customer, Building building) {
        String.format("Инженер %s конструирует здание %s для заказчика %s", engineer.name, building, customer.name);
        return building;
    }

    public Drawing draw(Engineer engineer, Customer customer, Drawing drawing) {
        String.format("Инженер %s рисует чертеж %s для заказчика %s", engineer.name, drawing.name, customer.name);
        return drawing;
    }

    public Drawing think(Engineer engineer, Customer customer, Drawing drawing) {
        String.format("Инженер %s формулирует чертеж %s для заказчика %s", engineer.name, drawing.name, customer.name);
        return drawing;
    }

    public Building manage(Engineer engineer, Customer customer, Building building) {
        String.format("Инженер %s распоряжается строительством здания %s для заказчика %s", engineer.name, building, customer.name);
        return building;
    }
}