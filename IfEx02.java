import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		// 입력 받은 점수를 A, B, C, D, F 등급으로 분리
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수: ");
		int point = scan.nextInt();
		
		if(point >= 90) {
			
			System.out.println("축하합니다~");
			
			if(point > 100) {
				System.out.println("잘못 된 점수입니다.");
			} else if(point >= 95) {
				System.out.println("A+ 학점입니다.");
			} else { // 90 <= x < 95
				System.out.println("A 학점입니다.");
			}
			
		} else if(point >= 80) {
			System.out.println("B 학점입니다.");
		} else if(point >= 70) { // 70 <= p < 80
			System.out.println("C 학점입니다.");
		} else if(point >= 60) {
			System.out.println("D 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		}
		
		scan.close();
	}
}
