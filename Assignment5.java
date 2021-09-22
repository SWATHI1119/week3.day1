package week3.day1Assignements;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str3 = new  String("test leaf");
		String str4 = new String("test leaf");
		String string5 = "ram";
		String string6 = "ram";
		// here it is comparing the object reference
		if(str3 == str4) {
			System.out.println("same text");
	    }else 
	    {
	    	System.out.println("Different text");
	    }
		// out put : Different text
		// equals() compares the contents of the string 
		if(str3.equals(str4)){
			System.out.println("same text");	
		}else {
			System.out.println("different text");
		}
		// out put : same text
		
		if(string5 == string6) {
			System.out.println("same text");
	    }else 
	    {
	    	System.out.println("Different text");
	    }
		System.out.println("***");
		// == operators compare the object reference 
		
  }
}
