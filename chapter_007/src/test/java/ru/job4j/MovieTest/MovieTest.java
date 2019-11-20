package ru.job4j.MovieTest;

import org.junit.Test;
import ru.job4j.Movie.Movie;

import static org.junit.Assert.assertEquals;

/**
 * Created by Comp on 10.10.2018.
 */
public class MovieTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(Movie.movie(500, 15, 0.9), 43);
        testing(Movie.movie(100, 10, 0.95), 24);
    }
}
