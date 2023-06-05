package array;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={12,22,2,44,21,17,33,10};
        bubbleSort(arr);
        System.out.println("Array elements are ::");
        for (int num:arr) {
            System.out.print(num+" ");
        }
    }

    private static void bubbleSort(int[] p) {
        // 1st for loop for rounds
        int temp;
        for (int i=0;i<p.length;i++){

            for (int j=0;j<p.length-1-i;j++){
                //j<p.length-1-i mean j will not sort already sorted value in i
                if (p[j]>p[j+1]){
                    temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
    }
}
