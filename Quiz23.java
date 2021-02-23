package basic;

import java.util.Arrays;

public class Quiz23 {

	public static void main(String[] args) {
		
		// 선택정렬
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40}; // 오름차순 정렬
		
		// 1회전 -> {1, 23, 5, 43, 100, 200, 40}
		// 2회전 -> {1, 5, 23, 43, 100, 200, 40}
		// 3회전 -> {1, 5, 23, 43, 100, 200, 40}
		// 4회전 -> {1, 5, 23, 40, 100, 200, 43}
		// 5회전 -> {1, 5, 23, 40, 43, 200, 100}
		// 6회전 -> {1, 5, 23, 40, 43, 100, 200}
		
		
//		for(int i = 0; i < arr.length-1; i++) {
//			
//			for(int j = i+1; j < arr.length ; j++) {
//				System.out.println(i + " - " + j);
//				// 오름차순일 경우 i인덱스가 j인덱스보다 크면 위치 변경
//				
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
				
		// 버블정렬 - 큰 수를 뒤로 
		int[] ar = {5, 2, 43, 20, 1};
		
		// 1회전 - {2, 5, 20, 1, 43}
		// 2회전 - {2, 5, 1, 20, 43}
		// 3회전 - {2, 1, 5, 20, 43}
		// 4회전 - {1, 2, 5, 20, 43}
		
		for(int i = 1; i < ar.length; i++) { // 회전수
			
			for(int j = 0; j < ar.length-i; j++) { // 비교할 인덱스
				
				if(ar[j] > ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
