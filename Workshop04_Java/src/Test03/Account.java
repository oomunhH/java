package Test03;

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
	public void deposit(int money) {
		balance+=money;
		System.out.println("계좌정보: "+this.getAccount()+" 현재잔액: "+balance);
	}
	public void withdraw(int money) {
		if(money>balance) {
			System.out.println("출금할 수 없습니다.");
		}else {
			balance-=money;
			System.out.println("현재잔액: "+balance);
		}
	}
}
