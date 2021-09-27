package sort.algorithm;


public class InsertionSort {
	
	public static void sort(Integer[] arr) {
		for(var i = 1 ; i < arr.length ; i++) {
			var comparing = i -1 ;
			var current = arr[i];
			while( comparing >=0 &&  current < arr[comparing]) {
				// asign new value to current position
				arr[comparing + 1] = arr[comparing];
				comparing--;
			}
			arr[comparing +1 ] = current;
		}
	}
	
	public static void printArray(Integer[] arr) {
		for(var i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

	 public static void main(String[] args) {
			Integer[] arr = {1,6,3,7,8,3,9};
			 sort(arr);
			 printArray(arr);
	 }
}
