package array;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInTwoArray {
    public static void main(String[] args) {
        int [] arr1={1,5,42,4,6,9};
        int [] arr2={2,5,42,22,7,8};
        Set<Integer> set=new HashSet<>();
        // Storing array1 value in set
        for (int num:arr1) {
            set.add(num);
        }
        for (int i=1;i<arr2.length;i++){
            if (set.contains(arr2[i])){
                System.out.println("Common element is ::"+arr2[i]);
            }
        }
        }
}
