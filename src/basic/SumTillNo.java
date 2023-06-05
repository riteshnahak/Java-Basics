package basic;

import java.util.Scanner;

public class SumTillNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number till which u want sum ::");
        int num=scanner.nextInt();
        int count=0;
        for (int i=1;i<=num;i++){
            count+=i;
        }
        System.out.println("Sum till "+num+" is ::"+count);
    }
}
