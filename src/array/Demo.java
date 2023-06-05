package array;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
    	
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the number of values in the array ::");
        int value=scanner.nextInt();
        int [] arr=new int[value];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter value in array ::");
            arr[i]=scanner.nextInt();
        }
        for (int num:arr) {
            System.out.print(num+" ");
        }

    }
}
