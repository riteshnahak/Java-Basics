package array;

import java.util.Arrays;

public class SwapAsPerIndex {

	public static void main(String[] args) {
		int[] array= {14,45,32,66,7,9};
		
		swap(array, 1, 4);
		System.out.println(Arrays.toString(array));
		
		
	}
	
	static void swap(int [] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
}
