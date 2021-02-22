package basic;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
//		String[] arr = {"+", "-", "*", "/"};
		
		//변수 사용해서 만들어 보기.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수1>");
		int num1 = scan.nextInt();
		System.out.print("연산을 선택하세요 [+, -, *, /]");
		String s = scan.next();
		System.out.print("정수2>");
		int num2 = scan.nextInt();
		
		switch (s) {
		case "+":
			System.out.println("두 수의 더하기는: " + (num1 + num2));
			break;
		case "-":
			System.out.println("두 수의 빼기는: " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱하기는: " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나누기는: " + (num1 / num2));
			break;

		default:
			System.out.println("사칙연산을 선택해 주세요\n[+, -, *, /]");
			break;
		}
	}
}
