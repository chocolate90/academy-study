package basic;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
//		System.out.println(); -> 줄바꿈
		// 1. 입력받은 수까지 3의 배수이거나, 4의 배수일 경우 가로로 출력

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int n = scan.nextInt();
		
//		int i = 1;
//		
//		while(i <= n) {
//			
//			if(i % 3 == 0 || i % 4 == 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}
		
		// 2. 입력받은 수까지의 6의 배수의 합계
		
//		int i1 = 1;
//		int sum = 0;
//		
//		while(i1 <= n) {
//			if(i1 % 6 == 0) {
//				sum += i1;
//			}
//			i1++;
//		} 
//		System.out.println("6의 배수의 합: " + sum);

		// 3. 1~1000까지의 정수중에 4의 배수 이면서 8의 배수가 아닌 수의 개수
		
//		int i2 = 1;
//		int count = 0;
//		
//		while(i2 <= n) {
//			if(i2 % 4 == 0 && i2 % 8 != 0) {
//				count++;
//			}
//			i2++;
//		}
//		System.out.println("개수: " + count);
		
		// 4. 1000의 약수의 개수 
		
//		int i3 = 1;
//		int count2 = 0;
//		
//		while(i3 <= n) {
//			if (n % i3 == 0) {
//				count2++;
//			}
//			i3++;
//		}
//		System.out.println("약수의 개수: " + count2);
		
		scan.close();
	}
}
