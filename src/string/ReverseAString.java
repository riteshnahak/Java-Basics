package string;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        
    	Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the string u want to reverse::");
        String string=scanner.next();
        char[] chars=string.toCharArray();
        
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            // Swap characters at left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move left index to the right
            left++;
            // Move right index to the left
            right--;
        }
        // converting char to string
        System.out.println(new String(chars));
    }
}
















