package ru.job4j.extrataskstest.task020;

import org.junit.Test;
import ru.job4j.extratasks.task020.PermutationGenerator;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class PermutationGeneratorTest {
    @Test
    public void simple() {
        PermutationGenerator combine = new PermutationGenerator(new int[]{1, 2});
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
        PermutationGenerator combine = new PermutationGenerator(new int[]{1, 2, 3});
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



