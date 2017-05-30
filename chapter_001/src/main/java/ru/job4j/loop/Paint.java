package ru.job4j.loop;


public class Paint {
	public String piramid(int h) {
		StringBuilder builder = new StringBuilder();
		String line = System.getProperty("line.separator");
			
		 for (int i = 0; i < h; i++) {
			for (int j = 0; j < h - i - 1; j++) {	
				if (j <= h - i - 1 || j < h + i) {
					
					builder.append("^");
				} 
				else if(j < h - i - 1) {
					builder.append(" ");
				}
				else {
					builder.append(" ");
				}
				
 			
			}
			
			builder.append(line);
		}
		return builder.toString();
 			
			
		}
		
	}


		
	


