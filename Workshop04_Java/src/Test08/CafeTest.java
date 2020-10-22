package Test08;

import java.util.Scanner;

public class CafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
		Cafe cafe=new Cafe();
//		int i=scan.nextInt();
//		for (i = 0; i < args.length; i++) {
//			Coffee coffeei=new Coffee(scan.next(),scan.nextInt());
//		}
		Coffee coffee0=new Coffee("Americano",4000);
		Coffee coffee1=new Coffee("Cafelatte",5000);
		Coffee coffee2=new Coffee("Macchiato",6000);
		Coffee coffee3=new Coffee("Americano",4000);
		Coffee coffee4=new Coffee("Cafelatte",5000);
		Coffee coffee5=new Coffee("Macchiato",6000);
		Coffee coffee6=new Coffee("Americano",4000);
		Coffee coffee7=new Coffee("Cafelatte",5000);
		Coffee coffee8=new Coffee("Macchiato",6000);
		Coffee coffee9=new Coffee("Macchiato",6000);
		Coffee coffee10=new Coffee("Macchiato",6000);
		
		cafe.setCoffee(coffee0);
		cafe.setCoffee(coffee1);
		cafe.setCoffee(coffee2);
		cafe.setCoffee(coffee3);
		cafe.setCoffee(coffee4);
		cafe.setCoffee(coffee5);
		cafe.setCoffee(coffee6);
		cafe.setCoffee(coffee7);
		cafe.setCoffee(coffee8);
		cafe.setCoffee(coffee9);
		cafe.setCoffee(coffee10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(cafe.getCoffeeList()[i]);
		}
		System.out.println(cafe.totalPrice());
	}

}
