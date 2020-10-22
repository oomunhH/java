package Test02;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		Account account=new Account("441-0290-1203",500000,0.073);
//		System.out.println("계좌정보: "+account.getAccount()+" 현재잔액: "+account.getBalance());
		try {
			account.withdraw(1000000);
		} catch (UserAccountException e) {
			System.out.println(e.getMessage());
		}
//		System.out.println("이자: "+account.calculateInterest());
		System.out.println("프로그램 정상 종료");
	}
	

}
