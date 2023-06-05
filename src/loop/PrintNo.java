package loop;

import java.util.Scanner;

public class PrintNo {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.print("Enter a number till which u want to iterate from 1.::");
        int num=scanner.nextInt();
        for (int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
