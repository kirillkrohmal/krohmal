package ru.job4j.shape;

/**
 * Created by Comp on 22.06.2017.
 */
public class Triangle implements Shape {

    @Override
    public String pic(Shape figure) {
        StringBuilder builder = new StringBuilder();
        String line = System.getProperty("line.separator");

        int width = 5;
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = i + 1; j < width; j++) {
                if (height > i || width > j) {
                    builder.append("x");
                }
            }
            builder.append(line);
        }

        return builder.toString();
    }
}