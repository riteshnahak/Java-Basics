package basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : :");
        int num=scanner.nextInt();
        if ( num%400==0 || num%4==0 && num%100!=0) {
            System.out.println(num+" is a Leap Year..");
        }
        else {
            System.out.println(num+" is not a Leap Year..");
        }



    }
}
