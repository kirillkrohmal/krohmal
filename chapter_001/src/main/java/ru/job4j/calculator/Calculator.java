package ru.job4j.calculator;

/**
*Class Calculate.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 20.05.2017
*/

public class Calculator {
	/** @since 20.05.2017
	   * Переменная result
	   * @param result возвращает результат в переменную.
 	   */
	private double result;
	/** @since 20.05.2017
	   * Метод getResult для класса Calculator
	   * @return result возвращает результат в переменную.
 	   */
	public double getResult() {
		return this.result;
	}
	/** @since 20.05.2017
	   * Метод add сложение для класса Calculator
	   * @param first первый аргумент.
	   * @param second второй аргумент.
 	   */
	void add(double first, double second) {
		 this.result = first + second;
	}
	/** @since 20.05.2017
	   * Метод substruct вычитание для класса Calculator
	   * @param first первый аргумент.
	   * @param second второй аргумент.
 	   */
	void substruct(double first, double second) {
		 this.result = first - second;
	}
	/** @since 20.05.2017
	   * Метод div деление для класса Calculator
	   * @param first первый аргумент.
	   * @param second второй аргумент.
 	   */
	void div(double first, double second) {
		 this.result = first / second;
	}
	/** @since 20.05.2017
	   * Метод multiple умножение для класса Calculator
	   * @param first первый аргумент.
	   * @param second второй аргумент.
 	   */
	void multiple(double first, double second) {
		 this.result = first * second;
	}
}

