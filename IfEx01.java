
public class IfEx01 {

	public static void main(String[] args) {
		
		// 1. 0~100 정수 생성
		
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수: " + point);
		
		if(point >= 60) {
			System.out.println("축하합니다.");
			System.out.println("합격이에요.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println(point >= 60 ? "축하합니다\n합격입니다" : "불합격입니다");
		
//		if(point < 60) {
//			System.out.println("불합격입니다.");
//		}
	}
}
