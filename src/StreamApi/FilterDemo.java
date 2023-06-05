package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,43,53,56,77,32,90,21);
        Stream<Integer> stream=nums.stream();
        stream.filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
    }
}
