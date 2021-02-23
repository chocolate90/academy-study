package basic;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int count1 = 0;
		while(true) {
			int i = (int)(Math.random() * 100) + 1;
			int n = (int)(Math.random() * 100) + 1;
			System.out.println(i + " + " + n + " = " + " ? ");
			System.out.println("[문제를 그만 두시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == i+n) {
				System.out.println("정답입니다!!");
				count++;
			} else if(answer == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("틀렸는데요??");
				count1++;
			}
		}
		System.out.println("정답 횟수: " + count + "회");
		System.out.println("틀린 횟수: " + count1 + "회");
		
		scan.close();
	}
}
