package com.aswani.algorithms.sorting;

public class Insertion {

	public void sort(int[] a) {
		int i, j, v;
		for (j = 2; j <= a.length - 1; j++) {
			v = a[j];
			i = j;
			while (a[i - 1] > v && j >= 1) {
				a[j] = a[j - 1];
				j--;
			}
			System.out.print(v);
			a[j] = v;
		}

	}

}
