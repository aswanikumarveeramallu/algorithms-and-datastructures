package com.aswani.algorithms.sorting;

/**
 * Selection sort implemenation
 * 
 * @author aswani
 *
 */
public class Selection {

	public void sort(Comparable<?>[] a) {
		if (SortUtility.isSorted(a, 0, a.length))
			return;
		int length = a.length;
		for (int i = 0; i < length; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (SortUtility.less(a[j], a[min])) {
					min = j;
				}
			}
			SortUtility.swap(a, i, min);
		}

	}

}
