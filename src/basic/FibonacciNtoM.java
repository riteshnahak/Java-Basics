package basic;

import java.util.Scanner;

public class FibonacciNtoM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a start number :: ");
        int num1=scanner.nextInt();
        System.out.println("Enter a Last number :: ");
        int num2=scanner.nextInt();
        int a=0;
        int b=1;
        int c=1;
        while (a<=num2){
            c=a+b;
            a=b;
            b=c;
            if (a>=num1 && a<=num2){
                System.out.print(a + " ");
            }
        }
    }
}
