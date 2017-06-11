package ru.job4j.Profession;


public class Engineer extends Profession {
	
	public Engineer (String name, int diplom, int experience) {
		super (name, diplom, experience);
	}
	
	public void design(Engineer engineer, Customer customer) {
		System.out.println("Инженер " + engineer.name  + " конструирует для " + customer.name);
	}
	
	public void draw(Engineer engineer, Customer customer) {
		System.out.println("Инженер " + engineer.name  + " рисует для " + customer.name);
	}
	
	public void think(Engineer engineer, Customer customer) {
		System.out.println("Инженер " + engineer.name  + " формулирует чертеж для " + customer.name);
	}
	
	public void manage(Engineer engineer, Customer customer) {
		System.out.println("Инженер " + engineer.name  + " распоряжается строительством для " + customer.name);
	}
}