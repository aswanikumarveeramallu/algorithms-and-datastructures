package com.aswani.algorithms.sorting;

public class Insertion {

	public void sort(Comparable<?>[] a) { // Sort a[] into increasing order.
		int N = a.length;
		if (SortUtility.isSorted(a, 0, N))
			return;
		for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2],
										// a[i-3]... ..
			for (int j = i; j > 0 && SortUtility.less(a[j], a[j - 1]); j--)
				SortUtility.swap(a, j, j - 1);
		}
	}

}
