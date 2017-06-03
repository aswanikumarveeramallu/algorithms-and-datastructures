package com.aswani.algorithms.sorting;

public final class SortUtility {

	/**
	 * verify given object is less than other one
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	/**
	 * Exchange items in array
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static void display(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}

}
