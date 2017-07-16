package ru.job4j.CollectionSortTest;

import org.junit.Test;
import ru.job4j.CollectionSort.CollectionSort;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 13.07.2017.
 */
public class CollectionSortTest {
    @Test
    public void whenCollectionSortAddAndHaveOtherTime() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new LinkedList<>();
        long result = sort.add(collection, 10000000);
        String expected = "6784L";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectionSortAddAndHaveOtherTime2() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new ArrayList<>();
        long result = sort.add(collection, 10000000);
        String expected = "5489L";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectionSortAddAndHaveOtherTime3() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new TreeSet<>();
        long result = sort.add(collection, 1000);
        String expected = "9L";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectionSortDeleteAndHaveOtherTime() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new LinkedList<>();
        long result = sort.delete(collection, 10000000);
        String expected = "6784L";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectionSortDeleteAndHaveOtherTime2() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new ArrayList<>();
        long result = sort.delete(collection, 10000000);
        String expected = "5489L";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCollectionSortDeleteAndHaveOtherTime3() {
        CollectionSort sort = new CollectionSort();
        Collection<String> collection = new TreeSet<>();
        long result = sort.delete(collection, 1000);
        String expected = "9L";
        assertThat(result, is(expected));
    }
}

