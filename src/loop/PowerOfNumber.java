package loop;

import java.util.Scanner;

/*
Two numbers are entered through the keyboard.
Write a program to find the value of one number raised to the power of another.
(Do not use Java built-in method)
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base number ::");
        int num1=scanner.nextInt();
        System.out.println("Enter the power number ::");
        int num2=scanner.nextInt();
        int power=1;
        for (int i=1;i<=num2;i++){
            power=power*num1;
        }
        System.out.println(num1+" Power of "+num2+" is : "+power);
    }
}
