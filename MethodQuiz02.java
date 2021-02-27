package basic;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		/*
		//print()
		System.out.println("정수 두개를 입력하세요.");
		
		//input() 2번 호출
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int i = scan.nextInt();
		System.out.print("정수>");
		int j = scan.nextInt();
		
		//add() 결과를 반환
		int result = i + j;
		
		//result() 결과 값을 출력
		System.out.println(result);
		*/
		
		print();
		int a = input();
		int b = input();
		
		int result = add(a,b);
		result(result);
	}
	
	static void print() {
		System.out.println("정수 두개를 입력하세요");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int a = scan.nextInt();
		
		return a;
	}
	
	static int add(int a, int b) {
		
		int result = a + b;
		return result;
	}
	
	static void result(int a) {
		System.out.println("두수의 합: " + a);
	}
}
