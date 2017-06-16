package com.aswani.algorithms.sorting;


public class Merge {

	public void sort(int[] a) {
		int n = a.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int la[] = new int[mid];
		int ra[] = new int[n - mid];
		for (int i = 0; i <= mid - 1; i++) {
			la[i] = a[i];
		}

		for (int i = mid; i <= n - 1; i++) {
			ra[i - mid] = a[i];
		}
		sort(la);
		sort(ra);
		merge(la, ra, a);

	}

	public void merge(int[] la, int[] ra, int[] a) {
		int nl = la.length;
		int nr = ra.length;
		int i = 0, j = 0, k = 0;
		while (i < nl && j < nr) {
			if (la[i] <= ra[j]) {
				a[k] = la[i];
				i = i + 1;
			} else {
				a[k] = ra[j];
				j = j + 1;
			}
			k = k + 1;
		}
		while (i < nl) {
			a[k] = la[i];
			i = i + 1;
			k = k + 1;
		}
		while (j < nr) {
			a[k] = ra[j];
			j = j + 1;
			k = k + 1;
		}
	}

}
