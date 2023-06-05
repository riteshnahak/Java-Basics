package array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 1, 3, 4, 2, 7, 8, 6,4};

//        for (int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]){
//                    System.out.println("Duplicate number is ::"+arr[j]);
//                }
//            }
//        }
        Set <Integer> set=new HashSet<>();
        for (int num:arr) {
            // As set doesn't contain duplicate value so when we add an element if it is
            // already added then it is duplicate no.
            if (!set.add(num)){
                System.out.println("Duplicate element is ::"+num);
            }
        }

    }
}