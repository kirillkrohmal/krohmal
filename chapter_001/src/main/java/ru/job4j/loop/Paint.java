package ru.job4j.loop;


public class Paint {
	public String piramid(int h){
			StringBuilder builder = new StringBuilder();
			String line = System.getProperty("line.separator");
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < h + i - 2; j++) {
					if (i == 1) {
						if (j <= 4){
							builder.append("^");
						} else {
							builder.append(" ");
						}
					}
					else if (i == 2){
						if (j <= 5){
							builder.append("^");
						} else {
							builder.append(" ");
						}
					}
					else if (i == 3){
						if (j >=5 && j <= 7){
							builder.append("^");
						} else {
							builder.append(" ");
						}
					}
					else{
						builder.append(" ");

					}
				}
				builder.append(line);
			}
			return builder.toString();
		}
		
	}


