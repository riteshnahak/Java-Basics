package basic;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[][] input = {{9, 9}, {9, 9}};
        // op=[1,9,8]
        int[] output = sumRows(input);
        System.out.println(Arrays.toString(output));
    }

    public static int[] sumRows(int[][] input) {
        int sum1 = input[0][0] * 10 + input[1][0];
        int sum2= input[0][1] * 10 + input[1][1];
        int sum=sum1+sum2;
        int[] arr=new int[sum];
        int[] output = String.valueOf(sum).chars().map(Character::getNumericValue).toArray(); // Converting the sum into an array of digits

       // System.out.println(Arrays.toString(output));
        // Modify the output array
        return output;
    }

}
