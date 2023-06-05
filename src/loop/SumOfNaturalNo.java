package loop;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number till which u want to do sum from 1::");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum till "+num+" is "+sum);
    }
}
