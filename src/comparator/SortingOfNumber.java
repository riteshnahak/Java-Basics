package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortingOfNumber {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(22);
        num.add(6);
        num.add(13);
        num.add(11);

        System.out.println(num);
        // Sorting the numbers
        Collections.sort(num);
        System.out.println(num);
    }
}
