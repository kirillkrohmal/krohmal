package ru.job4j.loop;


public class Paint {
	public String piramid(int h){
			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");
			
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < h + i; j++) {
				if (i < h - j + 2 || j < h - i+ 2 ) {
					builder.append("^");
				} else {
					builder.append(" ");
				}
			}
			builder.append(line);
		}
		return builder.toString();
	}
}

		
	


