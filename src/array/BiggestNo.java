package array;

import java.util.Scanner;

public class BiggestNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of value the array :: ");
        int value=scanner.nextInt();
        int [] arr=new int[value];

        // Value storing to array
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the values ::");
            arr[i]=scanner.nextInt();
        }

        // Value retrieval in array
        int max=arr[0];
        for (int num:arr){
            if (num>max)
                max=num;
        }
        System.out.println("maximum Number in array is ::"+max);
        
         
    }
}
