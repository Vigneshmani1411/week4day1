package week4.day1;

public class Bank implements CIBIL, PNB {

	public void maxLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Loan Amount is 50000");
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("The credit Score of your Account");
	}

	public void minBalance() {
		// TODO Auto-generated method stub
		System.out.println("Minimum Balance is 2000");
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("The Cibil score of your account");
	}


	public static void main(String[] args) {
		
		
		CIBIL obj1 = new Bank();
		obj1.cibilScore();
		
		PNB obj2 = new Bank();
		obj2.maxLoanAmount();
		obj2.minBalance();
		obj2.creditScore();
	}


}
