package ru.job4j.loop;


public class Board {

	String paint(int width, int height){

			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");
			for(int i = 0; i < height; i++){
				for(int j = 0; j < width; j++){
					if (i%2==0 && j%2==0){
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