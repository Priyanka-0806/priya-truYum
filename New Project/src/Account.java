
public class Account {
	private long accountNumber;
	private double balanceAmount;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public Account(long accountNumber, double balanceAmount) {
		super();
		this.accountNumber = accountNumber;
		this.balanceAmount = balanceAmount;
	}
	
	public void deposit(double depositAmount) {
		balanceAmount+=depositAmount;
		}
	
	public boolean withdraw(double withdrawAmt) {
		if(balanceAmount>=withdrawAmt) {
			balanceAmount=balanceAmount-withdrawAmt;
			return true;}
		else
			return false;
		}
	}
	


