import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the account number:");
		long accNo=inp.nextLong();
		System.out.println("Enter the available amount in the account:");
		double bAmt=inp.nextDouble();
		System.out.println("Enter the amount to be deposited:");
		double dep=inp.nextDouble();
		
		Account obj=new Account(accNo,bAmt);
		obj.setAccountNumber(accNo);
		obj.setBalanceAmount(bAmt);
		obj.deposit(dep);
		System.out.printf("Available balance is:%2f ",obj.getBalanceAmount());
		System.out.println();
		
		System.out.println("Enter the amount to be withdrawn: ");
		double withDraw=inp.nextDouble();
		
		boolean flag=obj.withdraw(withDraw);
		
		if(flag)
		{
			System.out.printf("Available balance is:%2f"+obj.getBalanceAmount());
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.printf("Available balance is:%2f"+obj.getBalanceAmount());
		}

	}
		
}


