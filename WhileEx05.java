import java.util.Arrays;

public class WhileEx05 {

	public static void main(String[] args) {
		
		// 배열의 순차적인 접근은 0~길이 미만까지 반복문을 회전한다.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		int i = 0;
		while(i < arr.length) {
			
//			System.out.println(arr[i]);
			sum += arr[i]; // 배열 요소의 누적
			
			i++;
		}
		
		System.out.println("배열 요소의 합: " + sum);
	}
}
