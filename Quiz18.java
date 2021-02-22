package basic;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {

		/*
		 * 두 정수를 입력 받는다.
		 * 두 수의 크기는 정해지지 않음
		 * 두 수 사이의 합을 구하는 프로그램 작성 if ~else if
		 * for문 안에는 3항연산자 사용이 가능
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int n = scan.nextInt();
		System.out.print("정수입력>");
		int n1 = scan.nextInt();

		int sum = 0;
		//.... a == b, a > b, a < b
		// 큰수?, 작은수?

//		if(n < n1) {
//
//			for(int i = n; i <= n1; i++) {
//				sum += i;
//			} 
//		} else if(n > n1) {
//			for(int i = n1; i <= n; i++) {
//				sum += i;
//			}
//		} else {
//			sum = 0;
//		}
//		System.out.println("두 수 사이의 합:" + sum);

		int sum1 = 0;
		for(int i = (n == n1 ? 0 : n > n1 ? n1 : n) ; i <= (n == n1 ? 0 : n > n1 ? n : n1) ; i++ ) {
			sum += i;
		}
		
		System.out.println("두 수 사이의 합:" + sum);
	}
}