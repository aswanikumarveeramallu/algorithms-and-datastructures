package com.aswani.algorithms.sorting;


public class Selection {

	/**
	 * verify given object is less than other one
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	private boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	/**
	 * Exchange items in array
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private void swap(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public void sort(Comparable[] a) {
		int length = a.length;
		for (int i = 0; i < length; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
			}
			swap(a, i, min);
		}

	}

	private void display(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	private boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

}
