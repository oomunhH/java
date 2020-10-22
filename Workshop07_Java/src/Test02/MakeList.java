package Test02;

import java.util.ArrayList;
import java.util.List;

public class MakeList {

	public MakeList() {
		super();
		// TODO Auto-generated constructor stub
	}
	List<Integer> list=new ArrayList<Integer>();
	public void makeArrayList(int size) {
		
		for (int i = 0; i < size; i++) {
			int num=(int)((Math.random()*10+10));
			list.add(num);
		}
	}
	
	public double getAverage() {
		double avg=0;
		int sum=0;
		for (Integer n : list) {
			
			sum+=n;
		}
		avg=sum/list.size();
		return avg;
	}
	
	public List<Integer> getList(){
		return list;
	}
	
	
}
