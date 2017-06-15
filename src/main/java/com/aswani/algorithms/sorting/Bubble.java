package com.aswani.algorithms.sorting;

public class Bubble {

	public void sort(int[] a) { // Sort a[] into increasing order.

		for (int pass = a.length - 1; pass >= 0; pass--) {
			for (int i = 0; i <= pass - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}

			}

		}
	}

}
