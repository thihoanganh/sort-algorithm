package sort.algorithm;

import java.util.stream.Stream;

public class MergeSort {

	public static void merge(Integer[] arr, Integer l, Integer m, Integer r) {
		int s1 = m - l + 1; // size of ele in first subarr
		int s2 = r - m; // size of ele in second subarr

		// now create 2 arrs with above size
		Integer[] firstTempArr = new Integer[s1];
		Integer[] secondeTempArr = new Integer[s2];

		// iterate to first subarr
		for (var i = 0; i < s1; i++) {
			// and move ele of main arr to subarr
			firstTempArr[i] = arr[i + l];
		}

		// iterate to second subarr
		for (var i = 0; i < s2; i++) {
			// and move ele of main arr to subarr
			secondeTempArr[i] = arr[m + 1 + i];
		}

		int i = 0; // index of first temp arr
		int j = 0; // index of second temp arr
		int k = l; // index of main arr
		while (i < s1 && j < s2) {
			if (firstTempArr[i] < secondeTempArr[j]) {
				arr[k] = firstTempArr[i];
				i++;
			} else {
				arr[k] = secondeTempArr[j];
				j++;
			}
			k++;
		}

		while (i < s1) {
			arr[k] = firstTempArr[i];
			i++;
			k++;
		}

		while (j < s2) {
			arr[k] = secondeTempArr[j];
			j++;
			k++;
		}
	}

	public static void sort(Integer[] arr, Integer l, Integer r) {
		if (l < r) {
			int m = (l + r) / 2; // middle pointer
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);

		}
	}

	public static void printArr(Integer[] arr) {
		Stream.of(arr).forEach(System.out::print);
	}

	public static void main(String[] args) {
		Integer[] arr = { 1, 6, 3, 7, 8, 3, 9 };
		sort(arr, 0, arr.length - 1);
		printArr(arr);
	}

}
