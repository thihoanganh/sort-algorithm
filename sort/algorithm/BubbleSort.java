package sort.algorithm;

public class BubbleSort {

	public static void sort(Integer[] arr) {
		var n = arr.length;
		for(var i=0 ; i<n ; i++) {
			for(var j=0 ; j<n -i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					var temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
