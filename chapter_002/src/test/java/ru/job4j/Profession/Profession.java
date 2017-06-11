package ru.job4j.Profession;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class Profession {
	@Test
	Professional professional = new Professional();
	Doctor name = "Иван Василевич";
	Pacient name = "Лиза";
	String result = professional.heal(doctor.name, pacient.name);
	String expected = "Доктор Иван Василевич лечит Лиза";
	assertThat(result, is(expected));
}