package ru.job4j.loop;


/**
*Class Paint.
*@author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
*@since 20.05.2017
*/

public class Paint {
	public String piramid(int h) {
		StringBuilder builder = new StringBuilder();
		String line = System.getProperty("line.separator");
			
		int width = 2 * h - 1;
		 for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= width; j++) {	
				int part = width / 2;
				int current = (2 * i - 1) / 2;
				if (j <= part - current || j > part + current + 1) {
					builder.append(" ");
				} else {
					builder.append("^");
				}
			}
			builder.append(line);
		}
		return builder.toString();	
		}
	}


		
	


