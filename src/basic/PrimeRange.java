package basic;


import java.util.Scanner;

class PrimeCheck {
    static boolean flag;

    public static boolean isPrime(int n)
    {
        int count = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }
        }
        if (count <= 2)
            flag = true;
        else {flag=false;}

        return flag;
    }


}
public class PrimeRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the LowerBound ::");
        int num1 = scanner.nextInt();
        System.out.println("Enter the UpperBound ::");
        int num2 = scanner.nextInt();
        for(int i=num1;i<=num2;i++)
        {
            if(PrimeCheck.isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}
