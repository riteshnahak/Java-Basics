package loop;
import java.util.Scanner;

/*
Write a program that prompts the user to input a   positive integer.
It should then print the two value swap of  that number.
 */
public class DigitSwap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a six digit number ");
        int num=scanner.nextInt();
        int digit1 = num / 100000;
        int digit2 = (num / 10000) % 10;
        int digit3 = (num / 1000) % 10;
        int digit4 = (num / 100) % 10;
        int digit5 = (num / 10) % 10;
        int digit6 = num % 10;

        int swappedNum = digit2 * 100000 + digit1 * 10000 +
                digit4 * 1000 + digit3 * 100 +
                digit6 * 10 + digit5;

        System.out.println(swappedNum);

    }
}
