package basic;

import java.util.Arrays;

public class Quiz19 {

	public static void main(String[] args) {
	
		/*
		int x = 1;
		int y = 5;
		
		int temp = x;
		x = y;
		y = temp;
		*/
		
		/*
		 * 배열의 들어있는 값 중에서 절대 중복되지 않는 숫자 3개를 랜덤으로 추출
		 * arr에서 절대 값이 중복되지 않게 추출된 3개의 값을 새로운 배열에 담음
		 * 
		 * 방법 - 배열의 길이만큼 회전하되, 랜덤하게 뽑힌 인덱스 위치값의 자리를 바꿈
		 * 
		 */
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		
//		int n = (int)(Math.random() * arr.length) + 1;
//		int n1 = (int)(Math.random() * arr.length) + 1;
//		int n2 = (int)(Math.random() * arr.length) + 1;
//		int temp = arr[0];
//		arr[0] = n;
//		int temp1 = arr[1];
//		arr[1] = n1;
//		int temp2 = arr[2];
//		arr[2] = n2;
//		
//		int[] arr2 = {n, n1, n2};
//		
//		System.out.println(n + ", " + n1 + ", " + n2);
//		System.out.println(temp + ", " + temp1 + ", " + temp2);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr.length);
			int n = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] newArr = new int[3];
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
		
	}
}
