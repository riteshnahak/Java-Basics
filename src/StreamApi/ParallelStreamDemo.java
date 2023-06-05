package StreamApi;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,3,2,6,9,1);
//        if u want to use multiple thread to reduce cpu time
        // write as parallel stream & it will use multi thread automatically
        // for fibonaci u cant use parallel steam as some number depenedent on other no
        Integer result=nums.parallelStream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(s,e)-> s+e);
        System.out.println(result);
    }
}
