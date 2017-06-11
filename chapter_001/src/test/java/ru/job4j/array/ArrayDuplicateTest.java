package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(array);
        String[] expected = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}