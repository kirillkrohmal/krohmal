package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.IsoscTriangle;
import ru.job4j.ExtraTasks.Point;
import ru.job4j.ExtraTasks.Square;
import ru.job4j.ExtraTasks.Triangle;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class SquareTest {
    @Test
    public void whenAddNewPointAndHasSquare() {
        boolean expected = true;
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        Point c = new Point(10, 0);
        Point d = new Point(10, 10);
        Square square = new Square(a, b, c, d);
        //act
        boolean result = square.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddNewPointAndHasSquare2() {
        boolean expected = true;
        Point a = new Point(11, 13);
        Point b = new Point(1, 25);
        Point c = new Point(4, 0);
        Point d = new Point(4, 0);
        Square square = new Square(a, b, c, d);
        //act
        boolean result = square.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddNewPointAndHasSquare3() {
        boolean expected = true;
        Point a = new Point(11, 13);
        Point b = new Point(1, 25);
        Point c = new Point(4, 0);
        Point d = new Point(4, 0);
        Square square = new Square(a, b, c, d);
        //act
        boolean result = square.exists();
        //assert
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddNewPointAndHasSquare4() {
        boolean expected = true;
        Point a = new Point(11, 13);
        Point b = new Point(1, 25);
        Point c = new Point(4, 0);
        Point d = new Point(4, 0);
        Square square = new Square(a, b, c, d);
        //act
        boolean result = square.exists();
        //assert
        assertThat(result, is(expected));
    }
}



