package ru.job4j.ExtraTasksTest.task_020;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_020.PermutationGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by Comp on 20.08.2017.
 */
public class PermutationGeneratorTest {
    @Test
    public void simple() {
        PermutationGenerator combine = new PermutationGenerator(new int[] {1, 2});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                asList(
                        asList(1, 2),
                        asList(2, 1)
                )
                )
        );
    }

    @Test
    public void three() {
        PermutationGenerator combine = new PermutationGenerator(new int[] {1, 2, 3});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                asList(
                        asList(1, 2, 3),
                        asList(1, 3, 2),
                        asList(2, 1, 3),
                        asList(3, 2, 1)
                )
                )
        );
    }
}



