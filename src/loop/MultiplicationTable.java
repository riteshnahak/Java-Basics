package loop;

/*
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
 */


import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number for which u want multiplication table::");
        int num=scanner.nextInt();
        int mul=1;
        System.out.println("Your table for "+num+ " is :");
        for (int i=1;i<=10;i++){
            mul=num*i;
            System.out.println(num+"*"+i +"="+ mul);
        }
    }
}
