package Test08;

public class Cafe {
	Coffee[] CoffeeList=new Coffee[10];
	int index=0;
	public Cafe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setCoffee(Coffee coffee) {
			if(index<10) {
			CoffeeList[index]=coffee;
			index++;}
			else {System.out.println("정보 추가가 될 수 없습니다.");}
		
	}
	public Coffee[]	getCoffeeList() {
		
		return CoffeeList;
	}
	public int totalPrice() {
		int sum=0;
		for (int i = 0; i < index; i++) {
			sum+=CoffeeList[i].getPrice();
		}
		return sum;
	
}
}
	
