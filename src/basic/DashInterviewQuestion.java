package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DashInterviewQuestion {
    public static void main(String[] args) {
        int [][] input={{1,2},{1,2}};
        int sumOfArr=sumOfArr(input)*input.length;
        List<Integer> list=breakNo(sumOfArr);
        Collections.reverse(list);
        System.out.println(list);

    }
    static int sumOfArr(int [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = arr[i][j] * 10 + arr[i][j + 1];
                break;
            }
        }
        return sum;
    }

    static List<Integer> breakNo(int num){
        ArrayList<Integer> al=new ArrayList<>();
        while (num>0){
            int rem=num%10;
            num=num/10;
            al.add(rem);
        }
        return al;
    }

}
