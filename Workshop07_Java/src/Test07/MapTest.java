package Test07;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 HashMap<String, Mobile> map=new HashMap<>();
	 Mobile m1=new Mobile("Lu6800","Optimus 2X",800000);
	 Mobile m2=new Mobile("Su6600","Optimus Black",900000);
	 Mobile m3=new Mobile("Ku5700","Optimus Big",700000);
	 Mobile m4=new Mobile("Su7600","Optimus Mach",950000);
	 map.put(m1.getCode(),m1);
	 map.put(m2.getCode(),m2);
	 map.put(m3.getCode(),m3);
	 map.put(m4.getCode(),m4);
	 
	 double sum=0.0;
	 Set<String> keys=map.keySet();
	for (String key : keys) {
		Mobile m=map.get(key);
		System.out.println(m);
		sum+=m.getPrice();
	}
	System.out.println("제품 가격합계는 "+sum+"원 이다.");
	System.out.println("제품 가격평균은 "+sum/keys.size()+"원 이다.");
	
	sum=0;
	for (String key : keys) {
		
		Mobile m=map.get(key);
		System.out.println(m.getName()+"의 10% 증가한 가격은"+(m.getPrice()*1.1));
		sum+=m.getPrice()*1.1;
	}
	System.out.println("10%올린 제품 가격합계는 "+sum+"원 이다.");
	System.out.println("10%올린 제품 가격평균은 "+sum/keys.size()+"원 이다.");
	}
	


}
