package loop;

import java.util.Scanner;

/*
Write a program to find the factorial value of any number entered through the keyboard.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number for which u want factorial::");
        int num=scanner.nextInt();
        int factorial=1;
        for (int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+ num+ " is "+factorial);
    }

}
