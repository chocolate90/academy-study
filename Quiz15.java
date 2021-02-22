package basic;

import java.util.Arrays;

public class Quiz15 {

	public static void main(String[] args) {
		
		// 힌트  - 몫과 나머지
		
		// 동전 - 금액을 큰 금액부터 거슬러서 몇개가 나오는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		// 금액                   17    1    2   1   3
		int money = 17780;
		int n = 0;
		
		int i = 0;
		

		while(i < arr.length) {
			
			n = money / arr[i];
			money %= arr[i];
			
			System.out.println(arr[i] + "원:" + n);
			
			i++;
			
		}
		
//		int i = 0;
//		
//		while(i < arr.length) {
//			
//			System.out.println(arr[i] + "원:" + money / arr[i]);
//			money %= arr[i];
//			
//			i++;
//		}

	}
}
