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
		final Integer[] input = new Integer[] { 5, 3, 6, 0, 9 };
		selection.sort(input);
		assertEquals(new Integer(9), input[input.length-1]);//Expect as last element
		assertEquals(new Integer(0), input[0]);//Expect as first element

	}

}
