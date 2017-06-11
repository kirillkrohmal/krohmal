package ru.job4j.Profession;


public class Doctor extends Profession {
	public Doctor (String name, int diplom, int experience) {
		super(name, diplom, experience);
	}

	public void operate(Doctor doctor, Pacient pacient) {
		System.out.println("Доктор " + doctor.name  +" оперирует " + pacient.name);
	}
	
	public void heal(Doctor doctor, Pacient pacient) {
		System.out.println("Доктор " + doctor.name  + " лечит " + pacient.name);
	}
	
	public void tellJokes(Doctor doctor, Pacient pacient) {
		System.out.println("Доктор " + doctor.name  + " шутит с " + pacient.name);
	}
	
	public void drink(Doctor doctor, Pacient pacient) {
		System.out.println("Доктор " + doctor.name  + " выпивает с " + pacient.name);
	}
}