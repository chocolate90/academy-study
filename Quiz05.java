package basic;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 정수 두개를 입력받아서 어떤 값이 큰 수인지 같다면 "같은 수입니다."
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int n = scan.nextInt();
		
		System.out.print(">");
		int i = scan.nextInt();
		
		if(n > i) {
			System.out.println("큰 수는 " + n + "입니다.");
		} else if(n < i) {
			System.out.println("큰 수는 " + i + "입니다.");
		} else {
			System.out.println(" 같은 수입니다.");
		}
		
//		if(n == i) {
//			System.out.println(" 같은 수입니다.");
//		} else if(n > i) {
//			System.out.println(n + "이 큰 수입니다.");
//		} else {
//			System.out.println(i + "이 큰 수입니다.");
//		}
		
		scan.close();
	}
}
