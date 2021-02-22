package basic;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {

//		int n = 1;
//		
//		while(n <= 15) {
//			
//			System.out.println( n + "번 학생의 출석체크");
//		
//			n++;
//		}
		
		// 구구단수를 입력 받아서,  입력받은 단수의 구구단을 출력해주세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요> ");
		int i = scan.nextInt();
		System.out.println("구구단: " + i + "단");
		
		int n = 1;
		
		while(n <= 9) {
			
//			System.out.println(i + " X " + n + " = " + i * n);
			System.out.printf("%d x %d = %d\n", i, n, i*n  );
			
			n ++;
		}
	}
}
