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
        Shape shape = new Shape() {
            @Override
            public String pic(String figure) {
                return triangle.pic("triangle");
            }
        };
        //Triangle.pic("triangle");
        assertThat(stream.toString(), is(String.format("xxxx%sxxx%sxx%sx", System.getProperty("line.separator"))));
    }

    @Test
    public void whenPaintNewFigureThenHasOtherFigures2() {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stream));
        Square square = new Square();
        Shape shape = new Shape() {
            @Override
            public String pic(String figure) {
                return square.pic("square");
            }
        };
        //Square.pic("square");
        assertThat(stream.toString(), is(String.format("xxxx%sxxxx%sxxxx%sxxxx%sxxxx", System.getProperty("line.separator"))));
    }
}
