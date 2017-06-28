package ru.job4j.Shape;

import org.junit.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 22.06.2017.
 */
public class ShapeTest {
    @Test
    public void whenPaintNewFigureThenHasOtherFigures() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        Triangle triangle = new Triangle();
        Paint paint = new Paint(triangle);
        Shape shape = new Shape() {
            @Override
            public String pic(String figure) {
                return paint.draw(figure);
            }
        };
        final String line = System.getProperty("line.separator");
        //Triangle.pic("triangle");
        assertThat(stream.toString(), is(String.format("xxxx%sxxx%s xx%s  x    ", line, line, line)));
    }

    @Test
    public void whenPaintNewFigureThenHasOtherFigures2() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        Square square = new Square();
        Paint paint = new Paint(square);
        paint.draw("square");
        final String line = System.getProperty("line.separator");
        //Square.pic("square");
        assertThat(stream.toString(), is(String.format("xxxx%sxxxx%sxxxx%sxxxx%sxxxx", line, line, line, line )));
    }
}
