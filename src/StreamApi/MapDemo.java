package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,43,53,56,77,32,90,21);
        Stream<Integer> stream=nums.stream();
        stream.map(n->n*2).forEach(n-> System.out.print(n+" "));

//        The map() method in Java Stream is a functional operation that transforms
//        each element in a stream by applying a specified function to it.
//        The map() method returns a new stream consisting of the transformed elements
    }
}
