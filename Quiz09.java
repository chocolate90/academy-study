package basic;

import java.util.Arrays;

public class Quiz09 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "Hello", "사요나라", "%#$"};
		
		/*
		 * 랜덤수를 이용해서 0~3까지
		 * 나오는 랜덤수를 배열의 index에 적용해서
		 * 선택된 단어가 어느나라 말인지 출력
		 */
		
		int n = (int)(Math.random() * arr.length);
		
		switch (n) {
		case 0:
			System.out.println(arr[0] + ": 한국말 입니다.");
			break;
			
		case 1:
			System.out.println(arr[1] + ": 영어 입니다.");
			break;
			
		case 2:
			System.out.println(arr[2] + ": 일본어 입니다.");
			break;
			
		case 3:
			System.out.println(arr[3] + ": 외계어 입니다.");
			break;

	
		}
		
	}
}
