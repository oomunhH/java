
public class ArrayTest01 {
		int [] arr= {10,20,30,40,50};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArr Array=new printArr();
		
//		ArrayTest01 A=new ArrayTest01();
//		int [] arr=A.arr;

//		CreateArr c=new CreateArr();
//		int [] arr=c.Arr_create();
		
		int [] arr=new CreateArr().Arr_create();
		
		int sum=0;
		
		
//		System.out.println("첫번째 sum="+Array01.printCal(arr));
//		System.out.println("두번째 sum="+sum);
		sum=Array.printCal(arr);
		double avg=Array.returnAvg();
		double avg2=Array.returnAvg2();
		System.out.println("받아온 합계="+sum);
		System.out.println("받아온 평균값="+avg);
		System.out.println("받아온 평균값2번째="+avg2);
		//Array01.printCal(arr);
		
		
		
		Arr_Avg Array2=new Arr_Avg();
		System.out.println(sum);
		int length=arr.length;
		System.out.println(length);
		double avg3=Array2.cal_Avg(length, sum);
		System.out.println("세번째 평균="+avg3);
		
		
//		for (int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println("for sum = "+sum);
//		System.out.println("for avg = "+sum/arr.length);
//		sum=0;
//		for(int x:arr) {
//			sum+=x;
//		}
//		System.out.println("sum = "+sum);
//		System.out.println("avg = "+sum/arr.length);
		
		System.out.println("----------------------------");

		Search array3=new Search();
		
		
		Search test=new Search(arr,50);
		System.out.println(test.searchIndex());
		
		
	}

}