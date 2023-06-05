package array;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
		
		int [][] arr= {{12,34,21},
				{45,64},
				{21,23,45}};
		int[] res=search(arr, 45);
		System.out.println("Index of max value::"+Arrays.toString(res));
		
	}
	static int[] search(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length-1;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col} ;
				}
			}
		}
		return new int[] {-1,-1};
	}
	
	
	
	
	
//	static void reverse(int [] arr) {
//		
//		int start=0;
//		int end=arr.length-1;
//		
//		while(start<end) {
//			swap(arr, start, end);
//			start++;
//			end--;
//		}
//		
//	}
	
	
//	 static int max(int[] arr) {
//		 int maxVal=Integer.MIN_VALUE;
//		 for(int i=0;i<arr.length;i++) {
//			 if(arr[i]>maxVal) {
//				 maxVal=arr[i];
//			 }
//		 }
//		return maxVal;
//	}

//	static void swap(int [] arr,int index1,int index2) {
//		int temp=arr[index1];
//		arr[index1]=arr[index2];
//		arr[index2]=temp;
//	}

}
