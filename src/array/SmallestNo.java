package array;

import java.util.Scanner;

public class SmallestNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the array::");
        int val=scanner.nextInt();
        int [] arr=new int[val];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the array values ::");
            arr[i]=scanner.nextInt();
        }

        int min=arr[0];
        for (int num:arr){
            if (num<min)
                min=num;
        }
        System.out.println("Minimum value is ::"+min);
    }
}
