package basic;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scanner.nextInt();
        int rev=0;
        while (num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse No is "+rev);
    }
}
