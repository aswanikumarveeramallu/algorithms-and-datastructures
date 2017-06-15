package com.aswani.algorithms.sorting;

public class Shell {

	public void sort(int[] a) {
		for (int gap = a.length / 3; gap > 0; gap /= 3) {
			int i, j, v;
			for (j = gap; j < a.length; j++) {
				v = a[j];
				i = j;
				while (a[i - 1] > v && j >= gap) {
					a[j] = a[j - 1];
					j -= gap;
				}
				a[j] = v;
			}

		}

	}

}
