package week2.day4;

public abstract class HDFC implements RBI {
	
	@Override
	public void mandatoryKYC() {
		System.out.println("Pan is mandatory");
		
	}
	
	public abstract void carLoan();
	
}
