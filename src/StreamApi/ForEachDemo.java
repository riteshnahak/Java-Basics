package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(23,43,53,56,77,32,90,21);
        Stream<Integer> stream=nums.stream();
        stream.forEach(n-> System.out.print(n+" "));
        //stream.forEach(n-> System.out.print(n+" "));
        //once u use stream u cant reuse it will show java.lang.IllegalStateException
        // one stream can be used one time to perform only one operation
    }
}
