package dsa.linearsearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
                {34,21,35,5},
                {43,56,98},
                {21,34},
                {22}
        };
        System.out.println(searchMax(arr));
    }

    static int searchMax(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
