package recurssion;

public class FibonacciRecursion {
    public static void main(String[] args) {
//        for (int i=4;i<=58;i++){
//            System.out.print(fibo(i)+" ");
//        }
        System.out.println(fibo(58));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
