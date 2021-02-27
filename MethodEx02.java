
public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 1. 메서드 호출시 실행에 필요한 값을 전달하는 매개체
		 * 2. 몇개 받을지는 메서드를 선언할 때 결정한다.
		 * 3. 매개변수를 여러개 받을때는 ,로 연결한다.
		 * 4. 매개변수가 없다면 ()를 비워둔다.
		 */
		
		System.out.println("1~10까지의 합: " + calSum(10));
		System.out.println("1~100까지의 합: " + calSum(100));
		System.out.println("1~50까지의 합: " + calSum(50));
		
		int result = calSum2(10, 20);
		System.out.println("10~20까지의 합: " + result);
		
		String result2 = calSum3(1,3,"가");
		System.out.println(result2);
		String result3 = calSum3(3,1,"가");
		System.out.println(result3);
	}
	
	static int calSum(int end) { // end: 필요하면 언제든지 사용하고 사용안해도 무방
	
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			
			sum += i;
		}
		
		return sum;
	}
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// 정수 2개 문자열 1개를 매개변수로 전달받는 calSum3()
	// 기능 - 두 정수 사이의 차 만큼 문자열을 붙인 결과를 반환
	// ex) 입력값(1,2,"가") -> 반환) "가가"
	
	static String calSum3(int a, int b, String s) {
		
		int max = 0;
		int min = 0;
		
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		String str = "";
		for(int i = min; i <= max; i++) {
			str += s;
		}
		
		return str;
	}
}
