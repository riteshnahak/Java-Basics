package array;

public class BiggestNoApproch2 {
	

	public static void main(String[] args) {
		int [] arr= {2,45,64,22,56,77};
		max(arr);
	}

	 static void max(int[] arr) {
		 int maxValue=arr[0];
		 for (int i : arr) {
			if(i>maxValue) {
				maxValue=i;
			}
		}
		 System.out.println("Maximum value is "+maxValue);
		 
	}

}
