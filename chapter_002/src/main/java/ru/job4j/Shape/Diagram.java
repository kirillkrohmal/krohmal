package ru.job4j.Shape;

/**
 * Created by Comp on 23.06.2017.
 */
public class Diagram {
    public static void main(String[] args) {
        Shape figure = new Triangle();
        Paint paint = new Paint(figure);
        String result = paint.draw(figure);
        //final String line = System.getProperty("line.separator");
        System.out.println(String.format(result));
       /*
        ;*/
    }
}
