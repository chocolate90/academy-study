package basic;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 *  스캐너를 이용해서 정수 하나를 입력받는다.
		 *  입력받은 정수가 음수, 0, 홀수, 짝수 인지 구분하는 조건문
		 *  
		 *  x % 2 == 0 짝수    x % 2 == 1 홀수
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int n = scan.nextInt();
		
		if(n % 2 == 0) {
			if(n == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수 입니다.");
			}
		} else if(n < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
//		if(n < 0) {
//			System.out.println(n + "은 음수 입니다.");
//		} else {
//			if(n == 0) {
//				System.out.println("0입니다.");
//			} else if(n % 2 == 0) {
//				System.out.println(n + "은 짝수 입니다.");
//			} else {
//				System.out.println(n + "은 홀수 입니다.");
//			}
//		}
		
		
		
//		if(n < 0) { // 음수
//			System.out.println(n + "음수 입니다.");
//		} else if(n == 0) { // 0인 경우
//			System.out.println("0입니다.");
//		} else if(n % 2 == 0) { // 짝수
//			System.out.println(n + "짝수 입니다.");
//		} else { // 홀수
//			System.out.println(n + "홀수 입니다.");
//		}
		
		scan.close();
	}
}
