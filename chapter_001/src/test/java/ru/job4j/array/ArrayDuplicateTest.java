package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Krohmal Kirill (mailto:krohmal_kirill@mail.ru)
 * @since 17.11.2019
 * Class ArrayDuplicateTest
 */
public class ArrayDuplicateTest {
    /**
     * Test remove.
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arrayDuplicate.remove(array);
        String[] expected = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, arrayContainingInAnyOrder(expected));
    }
}