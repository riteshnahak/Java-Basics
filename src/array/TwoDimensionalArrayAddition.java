package array;

import java.util.Scanner;

public class TwoDimensionalArrayAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[3][4];
        int[][] arr2 = new int[3][4];
        int[][] arr3 = new int[3][4];

        System.out.println("Enter the first array details ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Enter the value at " + i + "th index and " + j + "th index");
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the Second array details ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println("Enter the value at " + i + "th index and " + j + "th index");
                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Your first array is ::");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Your Second array is ::");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Summation of First and Second array is ::");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}




