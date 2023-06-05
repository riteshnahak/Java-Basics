package basic;

import java.util.Scanner;

public class OccurrenceOfDigit {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number::");
        int num=scanner.nextInt();
        System.out.print("Enter digit for which u want to check Occurrence::");
        int occNum=scanner.nextInt();
        int count=0;
        while (num>0){
            int rem=num%10;
            if (rem==occNum){
                count++;
            }
            num=num/10;
        }
        System.out.println("Occurrence ::"+count);

    }
}
