package com.aswani.algorithms.sorting;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HeapsortTest {
	private Heapsort heapsort;

	@Before
	public void init() {
		heapsort = new Heapsort();
	}

	@Test
	public void sortIntegers() {
		final int[] input = new int[] { 5, 3, 6, 0, 9 };
		heapsort.sort(input);
		assertEquals(9, input[input.length - 1]);// Expect as last element
		assertEquals(0, input[0]);// Expect as first element

	}

}
