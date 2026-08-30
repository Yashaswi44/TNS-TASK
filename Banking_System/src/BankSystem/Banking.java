package BankSystem;
import java.util.Scanner;
import Bank.BankAccount;
public class Banking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input
		System.out.println("____Welcome____");
		System.out.println("Enter Account Holder Name:");
		String name=sc.nextLine();
		System.out.println("Enter Account Number:");
		long account_Number=sc.nextLong();
		System.out.println("Enter Initial Deposit:");
		double initialBalance=sc.nextDouble();
		//Create object
		BankAccount account=new BankAccount(name,account_Number,initialBalance);
		int choice;
		//while loop
		while(true) {
			System.out.println("___Banking Menu___");
			System.out.println("1.Deposit Money");
			System.out.println("2.Withdrawn Money");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			//Switch statement
			switch(choice) {
			case 1: System.out.println("Enter amount to deposit:");
			double depositAmount=sc.nextDouble();
			account.deposit(depositAmount);break;
			case 2:System.out.println("Enter amount to withdraw:");
			double withdrawAmount=sc.nextDouble();
			account.withdraw(withdrawAmount);break;
			case 3: account.CheckBalance();break;
			case 4: account.displaydetails();break;
			case 5: System.out.println("Thank you");
			sc.close();
			return;
			default: System.out.println("Inavalid choice");
			
			}
		}
	}
	
}
