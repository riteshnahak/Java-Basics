package singleton;

public class AdharCard {
	
	// declare a private static non primitive reference variable
	private static AdharCard ac;
	
	// create a private constructor
	private AdharCard() {
		System.out.println("Object is created");
	}
	
	//have a public static helper method to create single object
	public static void createObject() {
		if(ac==null) {
			ac=new AdharCard();
		}
	}
	
	public static void main(String[] args) {
		createObject();
		createObject();
	}
	
	
	

}
