package com.aswani.algorithms.sorting;

import org.junit.Before;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SelectionSortTest {

	private Selection selection;

	@Before
	public void init() {
		selection = new Selection();
	}

	@Test
	public void sortIntegers() {
		final int[] input = new int[] { 5, 3, 6, 0, 9 };
		selection.sort(input);
		assertEquals(9, input[input.length-1]);//Expect as last element
		assertEquals(0, input[0]);//Expect as first element

	}

}
