package Bank;

public class BankAccount {
	String account_Holder;
	long account_Number;
	double Balance;
	//Constructor
	public BankAccount(String account_Holder,long account_Number,double Balance){
		this.account_Holder=account_Holder;
		this.account_Number=account_Number;
		this.Balance=Balance;
	}
	//Deposit
	public void deposit(double amount) {
		if(amount>0) {
			Balance=Balance+amount;
			System.out.println("Amount Desposited Successfully");
			System.out.println("Deposited Amount:"+amount);
		}else {
			System.out.println("Invalid amount");
		}
	}
	//withdraw
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid amount");
		}else if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance=Balance-amount;
			System.out.println("amount withdrawn successfully");
			System.out.println("Withdrawn Amount:"+amount);
		}
			
	}
	//Display
	public void CheckBalance() {
		System.out.println("Current Balance:"+Balance);
	}
	//Display Details
	public void displaydetails() {
		System.out.println("_____ Account-Details____");
		System.out.println("Account_Holder:"+account_Holder);
		System.out.println("Account_Number:"+account_Number);
		System.out.println("Balance:"+Balance);
	}
}
