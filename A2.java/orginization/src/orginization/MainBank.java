package orginization;


public class MainBank {

	public static void main(String[] args) {
		
		Bank sa = new SavingAccount();
		sa.fixedDeposit();
		
		Bank ca = new CurrentAccount();
		ca.cashCredit();
		
		
	
		
	}

}