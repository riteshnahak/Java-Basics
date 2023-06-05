package concept;


import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {

		fun(3,5,3,2,5,6,7);
	}
	
	static void fun(int ... args) {
		// ... for passing zero or more than 0 value as an array
		System.out.println(Arrays.toString(args));
	}

}
