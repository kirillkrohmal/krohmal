package ru.job4j.Profession;


public class Profession {	
	public String name;
	public int diplom;
	public int experience;

	public Profession (String name, int diplom, int experience) {
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

	public int getName() {
		return experience;
	}

	public static void main(String[] args) {
		 Doctor doctor = new Doctor("Иван Василевич", 13, 3);
		 Pacient pacient = new Pacient("Лизой");
		 doctor.drink(doctor, pacient);
		 doctor.heal(doctor, pacient);
		 doctor.operate(doctor, pacient);
		 doctor.tellJokes(doctor, pacient);
	}
}