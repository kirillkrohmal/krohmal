package ru.job4j.ExtraTasksTest;

import org.junit.Test;
import ru.job4j.ExtraTasks.ArraysChoice;
import ru.job4j.ExtraTasks.PermutationGenerator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class PermutationGeneratorTest {
    @Test
    public void whenAddArraySequenceAndHaveOtherUnits() {
        int[] a = {1, 2, 3};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits() {
        int[] a = {1, 2, 3};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits2() {
        int[] a = {1, 2, 3};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits2() {
        int[] a = {1, 2, 3};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        assertThat(result, is(expected));
    }
}


