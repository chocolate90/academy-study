
public class WhileEx01 {

	public static void main(String[] args) {
		
		int a = 1; // 제어변수: 반복문의 횟수를 제어할 변수
		
		int sum = 0; // 값을 누적할 변수
		
		while(a <= 10) {
			
		    sum += a; // sum = sum + a
			
		    System.out.println(sum);
			a++; // 제어변수의 조작을 통해서 조건이 언젠가 false가 되게 만든다.
			
		}
		
		System.out.println("1~10까지의 합: " + sum);
		// 1~10까지 합?
		
//		int sum = 0; // 누적...
		
	}
}
