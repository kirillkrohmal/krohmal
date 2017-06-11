package ru.job4j.Profession;


public class Teacher extends Profession {

	public Teacher(String name, int diplom, int experience) {
		super(name, diplom, experience);
	}

	public void teach(Teacher teacher, Children children) {
		System.out.println("Учитель " + teacher.name  + " учит " + children.name);
	}
	
	public void write(Teacher teacher, Children children) {
		System.out.println("Учитель " + teacher.name  + " пишет для " + children.name);
	}
	
	public void read(Teacher teacher, Children children) {
		System.out.println("Учитель " + teacher.name  + " читает для " + children.name);
	}
	
	public void scream(Teacher teacher, Children children) {
		System.out.println("Учитель " + teacher.name  + " кричит на " + children.name);
	}
}