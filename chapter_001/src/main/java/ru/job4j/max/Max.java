package ru.job4j.max;
/**
*Class Max.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 23.05.2017
*/
public class Max {
	  /** @since 23.05.2017
	   * Метод max для класса Max
	   * @param first первый аргумент.
	   * @param second второй аргумент.
	   * @param third третий аргумент.
	   * @return max
 	   */
	public int max(int first, int second, int third) {
		 int currentMax = this.max(first, second);
		 int currentMax2 = this.max(third, currentMax);
		 return currentMax2;
	}
	 /** @since 23.05.2017
	   * Метод max для класса Max
	   * @param first первый аргумент.
	   * @param second третий аргумент.
	   * @return result
 	   */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
}