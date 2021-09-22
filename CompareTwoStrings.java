package week3.day1Assignements;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 ="I am Learning Java" ;
	    String test2 ="I am learning java";
		if(test1.equals(test2)){
			
			System.out.println("Both strings are equal");
		}else {
			// case sensitive
			System.out.println("Both strings are not equal");
		}
		// for not case sensitive
		if(test1.equalsIgnoreCase(test2)){
			
			System.out.println("Both strings are equal");
		}else {
			System.out.println("Both strings are not equal");
		}		
	    		  

	}

}
