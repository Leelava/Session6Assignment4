package Session6Assignment4;

import java.util.Scanner;

public class Bank {
/* Reads in the ATMID,Bank name,location ,Balance from the user and creates three ATM objects. 
 * On each object performs deposit and withdraw operation. In case of withdraw operation throws user defined exception
 * if the balance reaches minimum amt 10000.
 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		for (int i =1; i <=3; i++)
		{
			System.out.println("Enter the ATMID");	
			int atmID =s.nextInt();
			
			System.out.println("Enter the Balance");
			double balance =s.nextDouble();
			
			System.out.println("Enter the Bank name");
			String bankName = s.next();
			
			System.out.println("Enter the Location");
			String location = s.next();
			
			BankATM  ATMobj = new BankATM(atmID,bankName,location,balance);
			
			System.out.println("Enter the deposit amt");
			
			double depositAmt = s.nextDouble();
			ATMobj.depositMoney(depositAmt);//Calling method to deposit the amt
			
			System.out.println("Enter the withdrawal amt");
			double withdrawAmt = s.nextDouble();
				try{
					ATMobj.withdrawMoney(withdrawAmt);// calling method to withdraw amt. In try-catch to catch the custom exception
				}
				catch (BankATMException e) {
					e.printStackTrace();
					System.out.println("Inside custom exception");
				}

		}

	}
}
