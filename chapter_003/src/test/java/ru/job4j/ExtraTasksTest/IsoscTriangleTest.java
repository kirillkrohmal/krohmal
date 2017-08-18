package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.IsoscTriangle;
import ru.job4j.ExtraTasks.Point;
import ru.job4j.ExtraTasks.Triangle;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class IsoscTriangleTest {
    @Test
    public void whenAddPointAndHasTriangle() {
        boolean expected = true;
        Point a = new Point(11, 13);
        Point b = new Point(1, 25);
        Point c = new Point(4, 0);
        IsoscTriangle isoscTriangle = new IsoscTriangle(a, b, c);
        //act
        boolean result = isoscTriangle.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddPointAndHasTriangle1() {
        boolean expected = true;
        Point a = new Point(4, 0);
        Point b = new Point(213, 111);
        Point c = new Point(2, 1);
        IsoscTriangle isoscTriangle = new IsoscTriangle(a, b, c);
        //act
        boolean result = isoscTriangle.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddPointAndHasTriangle2() {
        boolean expected = true;
        Point a = new Point(32, 31);
        Point b = new Point(1, 2);
        Point c = new Point(2, 32);
        IsoscTriangle isoscTriangle = new IsoscTriangle(a, b, c);
        //act
        boolean result = isoscTriangle.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddPointAndHasTriangle3() {
        boolean expected = true;
        Point a = new Point(43, 43);
        Point b = new Point(14, 143);
        Point c = new Point(2, 0);
        IsoscTriangle isoscTriangle = new IsoscTriangle(a, b, c);
        //act
        boolean result = isoscTriangle.exists();
        //assert
        assertThat(result, is(expected));
    }
}



