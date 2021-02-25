package basic;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {

		//		System.out.printf("%-3s", "○");

		/*
		 *  1. 사람수를 입력받을 수 있다.
		 *  2. 입력받은 사람만큼 랜덤값을 생성해서 배열에 절대 중복되지 않게 랜덤으로 지정한다.
		 *  
		 *  3. 해당 배열의 크기만큼  ○으로 출력한다.
		 *  4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선탣할 수 있다.
		 *  5. 제대로 선택된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 자리라면, 출력문을 띄우고 다시 선택
		 *  
		 *  그리고 선택된 자리는 ●로 다시 표시해 주세요.
		 *  
		 *  미리 중복 제거 작업 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		int size = scan.nextInt();

		int[] seat = new int[size];

		for (int i = 0; i < seat.length; i++) {
			seat[i] = i+1;
		}

		for(int i = 0; i < seat.length; i++) {
			int i2 = (int)(Math.random()*seat.length);

			int temp = seat[i];
			seat[i] = seat[i2];
			seat[i2] = temp;
		}

		System.out.println(Arrays.toString(seat));

		while(true) {
			System.out.println("---------------------좌석 선택 프로그램---------------------");
			for(int i = 1; i <= seat.length; i++) {
				System.out.printf("%-3s", i);

			}
			System.out.println();
			for(int j = 1; j <= seat.length; j++) {

				System.out.printf("%-3s", "○");


			}
			System.out.println();
			System.out.print("좌석 선택>");
			int seatNum = scan.nextInt();

			seatNum -= 1;

			if(seatNum <= seat.length) {
				System.out.println("자리 번호를 공개합니다>" + seat[seatNum] );
			} 

			seat[seatNum] = -1;
			System.out.println(Arrays.toString(seat));




		}
	}
}
