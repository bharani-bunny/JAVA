import java.util.*;
class Account
{
	int accno;
 	String acctype;
 	float accbal;
 	public void setDetails(int no,String s,float bal)
 	{
  		accno = no;
  		acctype = s;
  		accbal = bal;
 	}
 	public void getDetails()
 	{
  		System.out.println("Account number is : "+accno);
  		System.out.println("Account type is : "+acctype);
  		System.out.println("Account balance is : "+accbal);
 	}
 	public void withdraw(float amt)
 	{
  		if(accbal<amt)
  		{
   			System.out.println("Requested amount not available");
   		}	
  		else
  		{
   			accbal=accbal-amt;
   		}	
 	}
 	public void deposit(float amt)
 	{
  		accbal=accbal+amt;
 	}
 	public float getBalance()
 	{
  		return accbal;
 	}
}

class BankAccount
{
 	public static void main(String args[ ])
 	{
  		Account ac = new Account();
  		Scanner sc = new Scanner(System.in);
  		int acno;
  		float depamt,wdamt,bal;
  		String actype;
  		System.out.println("Enter account number, account type and account balance:");
  		acno=sc.nextInt();
  		actype = sc.next();
  		bal = sc.nextFloat();
  		ac.setDetails(acno,actype,bal);
  		System.out.println("\nDetails of the Account are:");
  		ac.getDetails();
  		System.out.println("Enter amount to be withdrawn:");
  		wdamt = sc.nextFloat();
  		ac.withdraw(wdamt);
  		System.out.println("Current Balance of the account is : "+ac.getBalance());
  		System.out.println("Enter amount to be deposited:");
  		depamt = sc.nextFloat();
  		ac.deposit(depamt);
  		System.out.println("Current Balance of the account is : "+ac.getBalance());
 	}
}
