package week3.day1Assignements;

public class CharacterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Exercise
		String text = "Java Exercise";
		char[] charArray = text.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'E') {
				System.out.println("Char at " +i+ " index" );
				
			}
			if(charArray[i] == 's') {
				System.out.println("Char at " +i+ " index" );
				
			}
		}
		
		//or
		System.out.println("Char at " +text.indexOf('E')+ " index" );
		System.out.println("Char at " +text.indexOf('s')+ " index" );
		
		
	
	}
}

