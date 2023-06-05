package mustdopattern;



public class RightRightAngle {
    public static void main(String[] args) {
        int n=6;
        for (int i=0;i<n;i++){

            // for spaces
            for (int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            // for start print
            for (int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
