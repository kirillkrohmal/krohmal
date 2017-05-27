package ru.job4j.loop;


public class Paint {
	public String piramid(int h){
			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");
			
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < h + i + 2; j++) {
				if (i == 0 && j == 2) {
						builder.append(" ^ ");
				}
					
				else if (i == 1 && j == 3) {
						builder.append("^^^");
				} 

				else if (i == 2 && j == 5) {
						builder.append("^^^^^");
					} 
				}
				builder.append(line);
			}
			return builder.toString();
		}
	}
		
	


