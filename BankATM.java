package Session6Assignment4;

public class BankATM {
	int atmId; 
	String bankName;
	String location;
	double balance;
	
	public BankATM(int atmId, String bankName, String location, double balance) {
		super();
		this.atmId = atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	//Deposits the amount by adding the amount to the balance.
	public void depositMoney(double amt)
	{
		this.balance = this.balance + amt;
		System.out.println("Transaction Successfull");
	}
	
	public void withdrawMoney(double amt) throws  BankATMException
	{
		if (this.balance < (double)10000)
		{
			throw new BankATMException("You have reached the minimum balance:The transaction will fail::" +this.balance);
		}
		else if (this.balance< amt)
			{
		System.out.println("The blanace is lower than the requested amt. The transaction cannot proceed" +this.balance);
			}
		else
		{
		this.balance = this.balance-amt;
		System.out.println("The transaction successfull,pls collect amount");
		}
	}
}
