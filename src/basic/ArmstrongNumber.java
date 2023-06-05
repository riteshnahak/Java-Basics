package basic;

import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int rem = number % 10;
            sum += Math.pow(rem, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
		
		
	}
}
