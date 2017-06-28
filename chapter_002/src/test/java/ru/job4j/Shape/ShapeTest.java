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
        Shape figure = new Triangle();
        Paint paint = new Paint(figure);
        String result = paint.draw(figure);
        final String line = System.getProperty("line.separator");
        assertThat(result, is(String.format("xxxx%sxxx%sxx%sx%s%s", line, line, line, line, line)));
    }

    @Test
    public void whenPaintNewFigureThenHasOtherFigures2() {
        Shape figure = new Square();
        Paint paint = new Paint(figure);
        String result = paint.draw(figure);
        final String line = System.getProperty("line.separator");
        assertThat(result, is(String.format("xxxxx%sxxxxx%sxxxxx%sxxxxx%sxxxxx%s", line, line, line, line, line)));
    }
}
