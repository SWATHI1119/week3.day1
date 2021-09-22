package week3.day1Assignements;

public class Students {

	
	 public void getStudentInfo(int id) {
		 System.out.println(id);
		 
	 }
	 public void getStudentInfo(int id , String Name) {
		 
		 System.out.println("Student id** " +id+"Student Name** "+Name);
	 }
	 public void getStudentInfo(String email,String PhoneNumber) {
		 System.out.println("Student id** " +email+"Phone Number** "+PhoneNumber);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stuObj = new Students();
		stuObj.getStudentInfo(12089);
		stuObj.getStudentInfo(12089, "swa");
		stuObj.getStudentInfo("swa@gmail.com", "96005763");

	}

}
