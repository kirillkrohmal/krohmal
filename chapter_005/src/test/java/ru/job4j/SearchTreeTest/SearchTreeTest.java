package ru.job4j.SearchTreeTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SearchTree.SearchTree;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTreeTest<E extends Comparable<E>> {
	SearchTree tree = new SearchTree<E>();

	@Test
	public void whenElFindLastThen() {
		SearchTree tree = new SearchTree<E>();

		tree.add(1, 2);
		tree.add(1, 3);
		tree.add(1, 4);
		tree.add(4, 5);
		tree.add(5, 6);

		assertThat(
				tree.containsKey(6),
				is(true)
		);
	}

	@Test
	public void whenElFindNotExitThenOptionEmpty() {
		SearchTree tree = new SearchTree<E>();

		tree.add(1, 2);

		assertThat(
				tree.hasNext(),
				is(true)
		);
	}

	@Before
	public void iteratorTest2() {
		tree = new SearchTree<E>();

		tree.add(1, 5);
		tree.add(2, 2);
		tree.add(3, 8);
		tree.add(4, 9);
		tree.add(5, 3);
		tree.add(6, 6);
		tree.add(7, 2);
		tree.add(8, 6);
	}

	@Test
	public void iteratorTest3() {
		Iterator<Integer> iterator = tree;
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(5));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(2));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(8));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(9));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(3));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(6));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(2));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(6));
		assertThat(iterator.hasNext(), is(false));
	}
}

