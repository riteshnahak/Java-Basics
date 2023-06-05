package basic;

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scanner.nextInt();
        int inputNo=num;
        int rev=0;
        while (num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (rev == inputNo)
            System.out.println(inputNo+" is a Palindromic Number");
        else
            System.out.println(inputNo+" is not a Palindromic Number");
    }
}
