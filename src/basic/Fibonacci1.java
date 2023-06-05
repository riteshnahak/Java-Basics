package basic;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num=scanner.nextInt();
        int a=0;
        int b=1;
        int c=1;
        for (int i=1;i<=num;i++){
            System.out.println(a + " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
