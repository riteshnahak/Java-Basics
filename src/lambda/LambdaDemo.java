package lambda;

import java.util.ArrayDeque;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		IEmployeeDetails emp=(num1,num2)->num1-num2;
		System.out.println("Age is::"+emp.age(2022, 1996));
		
	}
}
