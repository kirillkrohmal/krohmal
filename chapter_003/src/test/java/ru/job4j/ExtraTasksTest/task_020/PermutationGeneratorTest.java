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


    private Object exp;

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits() {
        int[] a = {1, 2, 3};
        int start = 1;
        ArrayList<int[]> result = new ArrayList<>();
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        //result = permutationGenerator.permute(a, start, result);
        //assertThat(result, contains(exp));
        //assertEquals(permutationGenerator.permute(a, start, result), );
    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits() {
        int[] a = {1, 3, 2};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        //int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        //assertThat(result, is(expected));
    }

    @Test
    public void whenAddArraySequenceAndHaveOtherUnits2() {
        int[] a = {2, 3, 1};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        //int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        //assertThat(result, is(expected));

    }

    @Test
    public void whenAddArraySequenceAndHaveSameUnits2() {
        int[] a = {3, 2, 1};
        int b = 1;
        int c = 2;
        PermutationGenerator permutationGenerator = new PermutationGenerator();
        //int[] result = permutationGenerator.swap(a, b, c);
        int[] expected = {2, 1, 3};
        //assertThat(result, is(expected));
    }
}


