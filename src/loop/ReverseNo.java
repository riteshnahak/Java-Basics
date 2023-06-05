package loop;

import java.util.Scanner;

/*
Write a program that prompts the user to input an integer and then outputs the number
with the digits reversed. For example, if the input is 12345, the output should be 54321.
 */
public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number for reverse::");
        int num=scanner.nextInt();
        int revNo=0;
        while (num>0){
            int rem=num%10;
            revNo=revNo*10+rem;
            num=num/10;
        }
        System.out.println("Reverse no is "+revNo);
    }
}
