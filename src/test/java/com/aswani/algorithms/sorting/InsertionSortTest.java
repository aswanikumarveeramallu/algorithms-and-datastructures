package com.aswani.algorithms.sorting;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortTest {
	
	private Insertion insertion;

	@Before
	public void init() {
		insertion = new Insertion();
	}

	@Test
	public void sortIntegers() {
		final Integer[] input = new Integer[] { 5, 3, 6, 0, 9 };
		insertion.sort(input);
		assertEquals(new Integer(9), input[input.length-1]);//Expect as last element
		assertEquals(new Integer(0), input[0]);//Expect as last element

	}

}
