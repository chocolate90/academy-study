
public class EnhancedForEx {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};

//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for(int i : arr) { // (값을 받을 변수 : 배엶명)
			System.out.println(i);
		}

		System.out.println("---------------");

		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String s : arr2) {
			System.out.println(s);
		}
		
		System.out.println("---------------");
		
		int[] arr3 = {40, 20, 50, 30, 50};
		
		int sum = 0;
		for(int i : arr3) {
			sum += i;
		}
		
		System.out.println("평균: " + (double)sum/arr3.length + " 합계: " + sum);
				
	}
}
