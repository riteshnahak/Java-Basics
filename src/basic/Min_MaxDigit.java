package basic;

import java.util.Scanner;

public class Min_MaxDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scanner.nextInt();
        int min=9;
        int max=0;
        int rem1;
        while (num>0){
            rem1=num%10;
            if (rem1<min)
                min=rem1;
            if (rem1>max)
                max=rem1;

            num=num/10;

        }
        System.out.println("Minimum number is "+min);
        System.out.println("Maximum number is "+max);
    }
}
