
public class printArr {
	int sum=0;
	int length=0;
	double avg=0;
	public int printCal(int [] array) {
		
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		length=array.length;
		avg=(double)sum/array.length;
//		System.out.println("sum="+sum);
//		System.out.println("avg="+sum/array.length);
		return sum;
		
	}
	public double returnAvg() {
		return avg;
	}
	
	public double returnAvg2() {
		double Avg2=sum/length;
		return Avg2;
	}
	
	public int printES(int [] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==1) {
				sum+=arr[i];		
			}		
		}
		return sum;
	}
}