package com.aswani.algorithms.sorting;

import static junit.framework.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ShellSortTest {
	private Shell shell;

	@Before
	public void init() {
		shell = new Shell();
	}

	@Test
	public void sortIntegers() {
		final Integer[] input = new Integer[] { 5, 3, 6, 0, 9 };
		shell.sort(input);
		assertEquals(new Integer(9), input[input.length-1]);//Expect as last element
		assertEquals(new Integer(0), input[0]);//Expect as first element

	}

}
