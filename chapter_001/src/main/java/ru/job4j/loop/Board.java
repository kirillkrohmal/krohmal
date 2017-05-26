package ru.job4j.loop;
/**
*Class Board .
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 26.05.2017
*/
public class Board {
/** @since 26.05.2017
		   * Метод mathSqrt дл¤ класса Triangle рисует рисунок в виде шахматной доски
		   * @return расстояние между точками ab
		   */
	String paint(int width, int height){

			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");
			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					if ((i+j)%2==0){//нужно проверять не отдельно а вместе
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
