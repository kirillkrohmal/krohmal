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
	   * ����������� Point ��� ������ Point
	   * @param x ��������.
	   * @param y ��������.
 	   */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
		/** @since 22.05.2017
	   * ����� getX() ��� ������ Point
	   * @return x.
 	   */
	public int getX() {
		return this.x;
	}
		/** @since 22.05.2017
	   * ����� getY() ��� ������ Point
	   * @return y.
 	   */
	public int getY() {
		return this.y;
	}
	 /** @since 22.05.2017
	   * ����� is ��� ������ Point
	   * @param a ��������.
	   * @param b ��������.
	   * @return a � b.
 	   */
	public boolean is(int a, int b) {
		return this.x == a * x + b;
	}
}