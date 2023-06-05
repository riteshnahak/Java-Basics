package array;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arr=new int[3][4];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the value in "+i+"th row & "+j+"th index.");
                arr[i][j]=scanner.nextInt();
            }
        }

        // Now array retrieval
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
