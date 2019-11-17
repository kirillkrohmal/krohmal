package ru.job4j.loop;
/**
*Class Board .
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 26.05.2017
*/
public class Board {
/** @since 26.05.2017
		   * Метод paint дл¤ класса Board рисует рисунок в виде шахматной доски
		   * param width аргумент для задания ширины
		   * param height аргумент для задания высоты
		   * @return builder в виде рисунка
		   */
	String paint(int width, int height) {
			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if ((i + j) % 2 == 0) { //нужно проверять не отдельно а вместе
						builder.append("x");
					} else {
						builder.append(" ");
					}
			}
			builder.append(line);
		}
		return builder.toString();
	}
}
