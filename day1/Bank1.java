package week4.day1;

public class Bank1 extends SBI{

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("Bank Balance is 7000");
	}

	@Override
	public void maxLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("Maximum Loan Amount is 45000");
	}
public static void main(String[] args) {
	

	SBI obj1=new Bank1();
	obj1.bankBalance();
	obj1.ITLoan();
	obj1.maxLoanAmount();
}	

}
