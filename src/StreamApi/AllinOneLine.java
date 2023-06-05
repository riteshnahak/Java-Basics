package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllinOneLine {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,3,2,6,9,1);
//        Stream<Integer> stream=nums.stream();
        Integer result=nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(s,e)-> s+e);
        // Intermediate function
            // will execute only if someone needs it eg-filter,map
        //Termination function
            //always execute when u write and has a return type .eg-reduce
        System.out.println(result);
    }
}
