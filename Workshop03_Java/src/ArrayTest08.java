
public class ArrayTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score= {99,34,67,22,11,9};

		Max_Min_Search cal=new Max_Min_Search();
		int max=cal.max_search(score);
		int min=cal.min_search(score);
		System.out.println("최댓값은: "+max);
		System.out.println("최솟값은: "+min);
		
		
		
		
//		int max=0;
//		int min=0;
//		for (int i = 0; i < score.length; i++) {
//			max=score[0];
//			if (max>score[i]) {
//				
//			}else {max=score[i];}
//		}
//		System.out.println("최댓값은 "+max);
//		
//		for (int i = 0; i < score.length; i++) {
//			min=score[0];
//			if (min<score[i]) {
//				
//			}else {min=score[i];}		
//		}
//		System.out.println("최솟값은"+min);
	}

}
