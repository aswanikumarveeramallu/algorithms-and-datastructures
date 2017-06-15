package com.aswani.algorithms.sorting;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	private Merge merge;

	@Before
	public void init() {
		merge = new Merge();
	}

	@Test
	public void sortIntegers() {
		final int[] input = new int[] { 38, 27, 43, 3, 9, 82, 10 };
		merge.sort(input);
		assertEquals(82, input[input.length - 1]);// Expect as last element
		assertEquals(3, input[0]);// Expect as first element

	}

}
