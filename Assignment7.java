package week3.day1Assignements;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to replace a specified character with another character and add # to the given string.

		String sentence = "I am working with Java8"
		replace 8 to 11 
		Print the characters from 5 to 14*/
		
		String str1 = "I am working with Java8";
		
		if(str1.contains("8")) {
			System.out.println(str1);
			String str2 = str1.replace("8", "11");
			System.out.println(str2);
		}
		
		System.out.println(str1.substring(5, 14));
	}

}
