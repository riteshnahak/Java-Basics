package dsa.linearsearch;

public class SearchInArray {
    public static void main(String[] args) {
        int [] arr={33,22,45,66,73,21};
        System.out.println(index(arr,79));
    }

    static int index(int[] arr,int target){
        for (int i=0;i<arr.length;i++) {
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
