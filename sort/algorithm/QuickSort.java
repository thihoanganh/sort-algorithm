package sort.algorithm;

import java.util.stream.Stream;

public class QuickSort {
	public static void swap(Integer[] arr, Integer i, Integer j) {
		var temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static Integer partition(Integer[] arr , Integer low, Integer high) {
		var pivot = arr[high]; // choose last index of array as pivot
		var pointer = low - 1;
		for( var i = low ; i < high; i++) {
			if(arr[i] <= pivot) {
				pointer++;
				swap(arr,pointer,i);
			}
		}
		swap(arr,pointer+1,high); 
		return pointer +1;
	}
	public static void sort(Integer[] arr, Integer low,Integer high) {
		if(low<high) { 
			Integer pivot = partition(arr,low,high);
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
	}
	
	public static void printArr(Integer[] arr) {
		Stream.of(arr).forEach(System.out::print);
	}
	public static void main(String[] args) {
		Integer[] arr = {1,6,3,7,8,3,9};
		 sort(arr,0,arr.length-1);
		 printArr(arr);
	}
}
