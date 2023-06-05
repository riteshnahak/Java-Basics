package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(6,5,2,8,1,7);
        // CHOOSE THE ODD NO DOUBLE THE VALUE THEN ADD THEM UP.
        // here we are mutating our original list so to avoid this u can use stream
        int sum=0;
        for (int num:list) {
            if (num%2==1){
                num=num*2;
                sum=sum+num;
            }
        }
        System.out.println(sum);
    }
}
