package ru.job4j.condition;
/**
*Class Triangle.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 23.05.2017
*/
public class Triangle {
			/** @since 23.05.2017
		   * @param a первый экземпл¤р класса.
		   */
		private Point a;
		/** @since 23.05.2017
		   * @param b второй экземпл¤р класса.
		   */
		private Point b;
		/** @since 23.05.2017
		   * @param c третий экземпл¤р класса.
		   */
		private Point c;
			/** @since 23.05.2017
		   * Конструктор Triangle дл¤ класса Triangle инициализирует значения
		   * @param a первый аргумент.
		   * @param b второй аргумент.
		   * @param c третий аргумент.
		   */
		public Triangle(Point a, Point b, Point c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
			/** @since 23.05.2017
		   * Метод area дл¤ класса Triangle вычисляет площадь треугольника на графике и выявляет условие невозможности
		   * @return условие невозможности
		   */
		public double area() {
		//calculate the triangle area
		double ab = Math.sqrt((Math.pow(this.b.getX() - this.a.getX(), 2)) + (Math.pow(this.b.getY() - this.a.getY(), 2)));
		double bc = Math.sqrt((Math.pow(this.c.getX() - this.b.getX(), 2)) + (Math.pow(this.c.getY() - this.b.getY(), 2)));
		double ca = Math.sqrt((Math.pow(this.a.getX() - this.c.getX(), 2)) + (Math.pow(this.a.getY() - this.c.getY(), 2)));
		if ((ab + bc) < ca || (ca + bc) < ab || (ca + ab) < bc) {
			return -1;
		} else {
			double p = (ab + bc + ca) / 2;
			return Math.sqrt(p * ((p - ab) * (p - bc) * (p - ca)));
		}
	}
}