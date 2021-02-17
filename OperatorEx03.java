
public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		
		// if 문장 뒤에 소괄호가 true면 if을 실행, 아니면 else를 실행한다. 
		// 두개짜리 &&, ||는 만족할 수 없는 조건일 때, 뒤를 실행하지 않는다.
		if( x != 10 && ++y == 21 ) { 
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x는: " + x + ", y는: " + y);
		
		
		if( x == 10 || ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x는: " + x + ", y는: " + y);
	}
}
