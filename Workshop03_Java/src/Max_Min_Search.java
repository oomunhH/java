
public class Max_Min_Search {
	int max=0;
	int min=0;
	public int max_search(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			max=arr[0];
			if(max>arr[i]) {
				
			}else	{
				max=arr[i];
			}
		}
		return max;
	}
	public int min_search(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			min=arr[0];
			if(min<arr[i]) {
				
			}else	{
				min=arr[i];
			}
		}
		return min;
	}
	
	
	
}
