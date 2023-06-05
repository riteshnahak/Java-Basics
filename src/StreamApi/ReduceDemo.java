package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,43,53,56,77,32,90,21);
        Stream<Integer> stream=nums.stream();
        Stream<Integer> stream1=nums.stream();

        // reduce return<T> if it is integer it will return integer
        Integer result=stream.reduce(0,(s,e)-> s+e);
        System.out.println(result);

    }
}
