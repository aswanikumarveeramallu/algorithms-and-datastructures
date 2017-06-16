package com.aswani.algorithms.sorting;

public class Quicksort {

	public void sort(int[] a) {
		sort(a, 0, a.length-1);
	}

	private void sort(int[] a, int start, int end) {
		if (start < end) {
			int pIndex = partition(a, start, end);
			sort(a, start, pIndex - 1);
			sort(a, pIndex + 1, end);
		}
	}

	private int partition(int[] a, int start, int end) {
		int pIndex = start;
		int pivot = a[end];
		for (int i = start; i < end ; i++) {
			if (a[i] <= pivot) {
				int swap = a[i];
				a[i] = a[pIndex];
				a[pIndex] = swap;
				pIndex = pIndex + 1;
			}
		}
		int temp = a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		return pIndex;

	}
}
