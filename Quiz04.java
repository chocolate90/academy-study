package basic;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 키가 140 이상이고, 나이가 8세 이상일 때 놀이기구 탑승 가능.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키: ");
		int n = scan.nextInt();
		
		System.out.print("나이: ");
		int i = scan.nextInt();
		
		if(n >= 140 && i >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		} else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		
		scan.close();
	}
}
