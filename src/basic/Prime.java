package basic;

import java.util.Scanner;

public class Prime {
	
	static int count=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int number=scanner.nextInt();
        isPrime(number);
        
    }
    
    static void isPrime(int num) {
    	for (int i=1;i<=num;i++){
            if (num%i==0) {
                count=count+1;
            }
        }
        if(count>2){
            System.out.println(num+" is not a prime no");
        }else {
            System.out.println(num+" is a prime no");
        }
    }
}
