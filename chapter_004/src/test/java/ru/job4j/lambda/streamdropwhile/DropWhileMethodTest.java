package ru.job4j.lambda.streamdropwhile;

import org.junit.Test;
import ru.job4j.stream.streamdropwhile.DropWhileMethod;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class DropWhileMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DropWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2))
        );
    }
}