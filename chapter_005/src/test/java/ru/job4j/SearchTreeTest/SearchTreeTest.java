package ru.job4j.SearchTreeTest;

import org.junit.Before;
import org.junit.Test;
import ru.job4j.SimpleTree.SimpleTree;
import ru.job4j.SimpleTree.Tree;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Comp on 23.10.2017.
 */
public class SearchTreeTest {

	SimpleTree tree = new Tree<>(1);

	@Test
	public void when6ElFindLastThen6() {
		Tree<Integer> tree = new Tree<Integer>(1);
		tree.add(1, 2);
		tree.add(1, 3);
		tree.add(1, 4);
		tree.add(4, 5);
		tree.add(5, 6);
		assertThat(
				tree.findBy(6).isPresent(),
				is(true)
		);
	}

	@Test
	public void when6ElFindNotExitThenOptionEmpty() {
		Tree<Integer> tree = new Tree<Integer>(1);
		tree.add(1, 2);
		assertThat(
				tree.findBy(2).isPresent(),
				is(false)
		);
	}

	@Before
	public void iteratorTest2() {

		tree = new Tree<Integer>(1);
	}

	@Test
	public void iteratorTest3() {

		tree = new Tree<Integer>(1);

		tree.add(1, 2);
		tree.add(1, 3);
		tree.add(1, 4);
		tree.add(4, 5);
		tree.add(5, 6);


		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(1));
		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(2));
		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(3));
		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(4));
		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(5));
		assertThat(tree.iterator().hasNext(), is(true));
		assertThat(tree.iterator().next(), is(6));
		assertThat(tree.iterator().hasNext(), is(true));
		
	}

}

