
public class Search {
		private int value=0;
		private int [] arr;
		
	public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public int[] getArr() {
			return arr;
		}
		public void setArr(int[] arr) {
			this.arr = arr;
		}
		
	public Search() {}
	public Search(int [] arr,int value) {
		System.out.println("-------생성자 호출--");
		this.value=value;
		this.arr=arr;
	}
	public String searchIndex() {
		System.out.println(arr+""+value);
		String result=null;
				
		for (int i = 0; i < arr.length; i++) {

			result="없습니다.";
			if(value==arr[i]) {
				result=i+"방에 있습니다.";
				break;
			}
		}
		return result;
	}

	}
