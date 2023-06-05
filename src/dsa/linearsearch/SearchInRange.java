package dsa.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={54,45,22,13,56,778,54,33,84};
        System.out.println(search(arr,2,5,54));
    }

    static int search(int[] arr,int start,int end,int target){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
