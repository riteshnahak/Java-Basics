package array;

public class SingleDimensionArraySwap {

    public static void main(String[] args) {
      int [] arr={5,6,8,9,1,2};
      int [] arr2={1,2,3,4,5,6};
        int temp;
        int temp2;
        //method 1
        for (int i=0;i<arr2.length;i++){
            if (i%2 !=0) {
                temp=arr2[i-1];
                arr2[i-1]=arr2[i];
                arr2[i]=temp;
            }
        }
        // Method 2
        for(int i=0;i<arr.length;i+=2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }



        for (int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
