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
	private SearchTree tree;

	@Test
	public void whenElFindLastThen() {
		tree = new SearchTree<E>();

		tree.add(1);
		tree.add(1);
		tree.add(1);
		tree.add(4);
		tree.add(5);

		assertThat(
				tree.containsKey(6),
				is(true)
		);
	}

/*	@Test
	public void whenElFindNotExitThenOptionEmpty() {
		SearchTree tree = new SearchTree<E>();

		tree.add(1);

		assertThat(
				tree.hasNext(),
				is(true)
		);
	}*/

	@Before
	public void iteratorTest2() {
		tree = new SearchTree<E>();

		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		tree.add(7);
		tree.add(8);
	}

	@Test
	public void iteratorTest3() {
		Iterator<Integer> iterator = tree.iterator();
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(1));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(2));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(3));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(4));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(5));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(6));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(7));
		assertThat(iterator.hasNext(), is(true));
		assertThat(iterator.next(), is(8));
		assertThat(iterator.hasNext(), is(false));
	}
}

