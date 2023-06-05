package array;

import java.util.Scanner;

public class SecondBiggestNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of an array ::");
        int val=scanner.nextInt();
        int [] arr=new int[val];

        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the array element ::");
            arr[i]=scanner.nextInt();
        }
        int max=arr[0];
        int sMax=0;
        for (int num:arr){
            if(num>max){
                sMax=max;
                max=num;
            } else if (sMax<num && num!=max) {
                sMax=num;
            }
        }
        System.out.println("Bigger Number is ::"+max);
        System.out.println("Second Bigger Number is ::"+sMax);


    }
}
