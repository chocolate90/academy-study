package basic;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {

		/*
		 * 가로, 세로를 스캐너를 통해 입력받는다
		 * 가로길이만큼, 세로길이만큼 사각형을 출력
		 * 단, 윤곽만 나타나면 된다.
		 * 
		 * 사각형을 출력 -> 첫행과 마지막행 출력, 아닌경우 첫열과 마지막열 출력
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();

		for(int i = 1; i <= h; i++) { // 행 세로

			for(int j = 1; j <= w ; j++) { // 열 가로
				
				if(i == 1 || i == h) { // 첫 행과 마지막 행
					System.out.print("*");
				} else { // 중간 행 
					if(j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}

	}
}
