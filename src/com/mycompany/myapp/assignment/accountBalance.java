package com.mycompany.myapp.assignment;

public class accountBalance {

	long accountNumber;
	String accountType;
	double accountBalance=5000;
	
	public double deposit(double amt)
	{
		accountBalance =accountBalance +amt;
		System.out.println("vinay deposited : "+amt);
		 
		 return amt;
	}
	
		
	public String accountType1(String type) {
		System.out.println("account type is: "+type);
		return type;
	}
	
	public long accountNumber1(long accNo) {
		System.out.println("account number is: "+accNo);
		return accNo;
	}
	
	public double Withdrawal(double amt) {
		System.out.println("Withdrawal amount is: "+amt);
		accountBalance = accountBalance-amt;
		return amt;
	}
	
	public double balance() {
		System.out.println("balance is: "+accountBalance);
		return accountBalance;
	}
	
public accountBalance(long actNumber,String accountType, double accountBalance) {
		
		accountNumber = actNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accountBalance v = new accountBalance(12345L, "Checking", 5000);
		//System.out.println(v.accountNumber,v.accountType,v.accountBalance);
		/*accountBalance vinay = new accountBalance();
		vinay.deposit(5000);
		vinay.balance();
		vinay.accountType1("checking");
		vinay.accountNumber1(588846L);
		vinay.Withdrawal(4000);
		vinay.balance();
		vinay.Withdrawal(5000);
		vinay.balance();
		vinay.deposit(100);
		vinay.balance();*/
	}

}
