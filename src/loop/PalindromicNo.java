package loop;

import java.util.Scanner;

public class PalindromicNo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number ::");
        int num=scanner.nextInt();
        int inputNo=num;
        int revNo=0;
        while (num>0){
            int rem=num%10;
            revNo=revNo*10+rem;
            num=num/10;
        }

        if(revNo==inputNo)
            System.out.println(inputNo+ " is a palindromic number");
        else
            System.out.println(inputNo+ " is a not palindromic number");

    }
}
