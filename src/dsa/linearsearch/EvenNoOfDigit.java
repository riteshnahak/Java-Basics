package dsa.linearsearch;

// how many number in array contain even  no of digit
public class EvenNoOfDigit {
    public static void main(String[] args) {
        int [] arr={23,345,34344,1,34,6694};
        System.out.println(evenCount(arr));
    }
    static int evenCount(int[] arr){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(digit(arr[i])%2==0){
                count++;
            }
        }
        return count;
    }
    static int digit(int num){
        int digCount=0;
        while (num>0){
            digCount+=1;
            num=num/10;
        }
        return digCount;
    }
}
