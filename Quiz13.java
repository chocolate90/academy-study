package basic;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {

		/*
		 * 사용자가 0을 입력할 때까지 값을 입력 받습니다.
		 * 0을 입력하면 그 전까지 입력한 값들의 합을 출력하고 종료
		 */

		Scanner scan = new Scanner(System.in);

		int sum = 0;

		int i = 1;
		while(i > 0) {
			System.out.print("정수입력>");
			int n = scan.nextInt();

			sum += n;
			
			if(n == 0) {
//				System.out.println(sum);
				i = 0;
			}
		}
		System.out.println(sum);
		
		scan.close();
		
//		int sum = 0;
//		
//		int i = 1;
//		while(i != 0) { // 0일 때 false
//			System.out.print("정수입력>");
//			i = scan.nextInt();
//
//			sum += i;
//			
//		}
//
//		System.out.println(sum);
	}
}
