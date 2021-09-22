package week3.day1Assignements;

public class AxisBank extends BankInfo {

	
	 public void deposit() {
		 System.out.println("Deposit method overrided in child class");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank bank = new AxisBank();
		bank.deposit();

	}

}
