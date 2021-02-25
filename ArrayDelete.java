import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
		// 배열의 삭제 (5번째 인덱스를 지운다.)
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for(int i = 5; i < arr.length-1; i++) {
//			arr[i] = arr[i+1];
//		}
//		System.out.println(Arrays.toString(arr));
		
		String[] arr = {"강타", "토니안", "이재원", "장우혁", "문희준" };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름>");
		String name = scan.next();
		
		int count = arr.length; // 배열의 길이로 사용
		boolean chk = false; // 삭제여부 확인
		
		for(int i = 0; i < count; i++) {
			
			if(name.equals(arr[i])) {
				
				for(int j = i; j < count-1; j++ ) {
					arr[j] = arr[j+1];
				}
				count--; // 접근할 index(사람수)
				chk = true;
			}
		}
		System.out.println(count);
		
		if(chk) { // 삭제 성공
			System.out.print("삭제후 정보: [");
			for(int i = 0; i < count; i++) {
				System.out.print(arr[i]);
				if(i == count-1) break;
				System.out.print(", ");
			}
			System.out.println("]");
		} else { // 삭제가 일어나지 않은 경우
			System.out.println("찾는 이름이 없습니다.");
		}
	}
}
