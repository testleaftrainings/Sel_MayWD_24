package week2.day4;

public class BankImplementation extends HDFC {

	@Override
	public void mandatoryKYC() {
		System.out.println("Aadhar mandatory");
		
	}

	@Override
	public void carLoan() {
	System.out.println("upto 5 Lakhs");
		
	}
	
	@Override
	public void withdrawalLimit() {
		System.out.println("3 Lakhs");
		
	}
	
	public static void main(String[] args) {
		BankImplementation bank=new BankImplementation();
		bank.carLoan();
		bank.mandatoryKYC();
		bank.withdrawalLimit();
	}

}
