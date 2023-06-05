package lambda;


public class AnnonymusInnerClass {
	
	
	public static void main(String[] args) {
		IEmployeeDetails emp=new IEmployeeDetails() {
			
			

			@Override
			public int age(int currentYr, int yearOfBirth) {
				return currentYr-yearOfBirth ;
			}	
		};
		System.out.println("Age is "+emp.age(2023, 1996));
	
	}
	
	
	
	
}
