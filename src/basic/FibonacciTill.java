package basic;

import java.util.Scanner;

public class FibonacciTill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int num=scanner.nextInt();
        int a=0;
        int b=1;
        int c=1;
        while (a<=num){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
