package Test02;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		double interest=(double)balance*interestRate;
		return interest;
	}
	public void deposit(int money) throws UserAccountException {
		balance+=money;
		if(money<=0) {
			throw new UserAccountException("입금 금액이 0보다 적습니다.");
		}
		else {
		System.out.println("계좌정보: "+this.getAccount()+" 현재잔액: "+balance);}
	}
	public void withdraw(int money) throws UserAccountException {
		if(money>balance || money<0) {
			throw new UserAccountException("출금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}else {
			balance-=money;
			System.out.println("현재잔액: "+balance);
		}
	}
}
