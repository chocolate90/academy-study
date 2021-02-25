import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		// 배열의 수정
		
		String[] arr = {"강타", "토니안", "문희준", "장우혁", "이재원"};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 이름>");
		String name = scan.next();
		
		boolean chk = false; // 적어도 한번 수정된 결과를 확인하기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {
			
			if(name.equals(arr[i])) {
				System.out.println(arr[i] + "학생 이름을 수정합니다.");
				System.out.print("수정할 이름 >");
				arr[i] = scan.next();
				chk = true; // 변경되었다는 의미
			}
		}
		
		// 수정의 결과
		
		if(chk) {
			System.out.println("정상적으로 수정되었습니다.");
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("찾는 이름이 없습니다.");
		}
	}
}
