package ru.job4j.condition;
/**
*Class Point.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 22.05.2017
*/
public class Point {
		/** @since 22.05.2017
	   * @param x.
 	   */
	private int x;
		/** @since 22.05.2017
	   * @param y.
 	   */
	private int y;
		/** @since 22.05.2017
	   * Конструктор Point для класса Point
	   * @param x аргумент.
	   * @param y аргумент.
 	   */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
		/** @since 22.05.2017
	   * Метод getX() для класса Point
	   * @return x.
 	   */
	public int getX() {
		return this.x;
	}
		/** @since 22.05.2017
	   * Метод getY() для класса Point
	   * @return y.
 	   */
	public int getY() {
		return this.y;
	}
	 /** @since 22.05.2017
	   * Метод is для класса Point
	   * @param a аргумент.
	   * @param b аргумент.
	   * @return a и b.
 	   */
	public boolean is(int a, int b) {
		return this.x == a * x + b;
	}
}