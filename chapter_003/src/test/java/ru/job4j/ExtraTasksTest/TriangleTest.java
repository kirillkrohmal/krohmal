package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.Point;
import ru.job4j.ExtraTasks.Triangle;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class TriangleTest {
    @Test
    public void whenAddPointAndHasTriangle() {
        double expected = 105.65D;
        Point a = new Point(11, 13);
        Point b = new Point(1, 25);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        //act
        double result = triangle.area();
        //assert
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddPointAndHasTriangle1() {
        double expected = 24249.57D;
        Point a = new Point(4, 0);
        Point b = new Point(213, 111);
        Point c = new Point(2, 1);
        Triangle triangle = new Triangle(a, b, c);
        //act
        double result = triangle.area();
        //assert
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddPointAndHasTriangle2() {
        double expected = 780.28D;
        Point a = new Point(32, 31);
        Point b = new Point(1, 2);
        Point c = new Point(2, 32);
        Triangle triangle = new Triangle(a, b, c);
        //act
        double result = triangle.area();
        //assert
        assertThat(result, closeTo(expected, 0.1D));
    }

    @Test
    public void whenAddPointAndHasTriangle3() {
        double expected = 4694.29D;
        Point a = new Point(43, 43);
        Point b = new Point(14, 143);
        Point c = new Point(2, 0);
        Triangle triangle = new Triangle(a, b, c);
        //act
        double result = triangle.area();
        //assert
        assertThat(result, closeTo(expected, 0.1D));
    }
}



