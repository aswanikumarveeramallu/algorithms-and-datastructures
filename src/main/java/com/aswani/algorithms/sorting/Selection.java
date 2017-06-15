package com.aswani.algorithms.sorting;

/**
 * Selection sort implemenation
 * 
 * @author aswani
 *
 */
public class Selection {

	public void sort(int[] a) {
		int i, j, min, temp;
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[j - 1]) {
					min = a[j];
				}
			}
			temp = min;
			min = a[i];
			a[i] = temp;
		}

	}
}
