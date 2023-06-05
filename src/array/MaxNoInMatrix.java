
package array;

import java.util.Scanner;


public class MaxNoInMatrix {
    public static void main(String[] args) {
        int [][] arr=new int[3][4];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the value in "+i+"th row & "+j+"th index.");
                arr[i][j]=scanner.nextInt();
            }
            System.out.println();
        }
        int max=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum number in the matrix is ::"+max);
    }
}
