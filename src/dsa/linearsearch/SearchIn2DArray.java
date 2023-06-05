package dsa.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {34,21,35,5},
                {43,56,98},
                {21,34},
                {22}
        };
        System.out.println(Arrays.toString(search(arr,22)));
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
