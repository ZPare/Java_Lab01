package zoe_pare_exercise2;

public class CheckingAccount {

//instance variables
	private int accountNumber;
	private String customerName;
	private double accountBalance;

	
//Getters
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
//Getters and Setters
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(double accountBalance) {
		   if(accountBalance >= 50.00) { 
			   this.accountBalance = accountBalance;
			       
		   }
		   else {
			   System.out.println("Amount Does Not Meet Requirement");
		   }
	}
	
//Constructor
	public CheckingAccount(int accountNumber, String customerName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	
//Method
	public void doubleWithdraw(double amount) {
		//if(this.accountBalance - (amount +2) >= 50)
		//{this.accountBalance -= amount +2;
		//return.this.accountBalance;
		if (amount > 0.0) {
			amount = accountBalance - amount - 2.00;
			System.out.println("Account Balance After Withdrawl: " + amount);
		}
		//else(
		//System.out.println("Not enough money");
		//return this.accountBalance;
	}
	
	public void StringtoString() {
		System.out.println("Customer Name: "+ customerName);
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account Balance: "+ accountBalance);
	}
}
