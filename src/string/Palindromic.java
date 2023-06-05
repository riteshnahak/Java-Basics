package string;

public class Palindromic {

	public static void main(String[] args) {
		String str="Lol";
		System.out.println(isPalindropic(str));
		
	}
	
	static boolean isPalindropic(String str) {
		str=str.toLowerCase();
		for(int i=0;i<=str.length()/2;i++) {
			char start=str.charAt(i);
			char end=str.charAt(str.length()-1-i);
			
			if (start!=end) {
				return false;
			}
			
		}
		return true;
	}
}
