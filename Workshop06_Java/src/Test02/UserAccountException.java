package Test02;
//(6_2 사용자정의 exception 만들기 입금액이 0보다적을때 입금금액이 0보다 작습니다. 출금액이 잔액보다 많으면 출금액이 잔액보다 맞습니다.)
//main 에서 try catch
public class UserAccountException extends Exception{

	public UserAccountException(String mesg) {
		super(mesg);
		// TODO Auto-generated constructor stub
	}
	
}
