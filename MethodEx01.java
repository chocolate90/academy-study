
public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 메서드(함수)는 메서드 내부에 선언 할 수 없다.
		 * 2. 메서드는 만드는 과정과 사용하는 과정(호출)이 있습니다.
		 * 3. 메서드는 호출했을 때 실행에 결과를 메서드 호출문으로 돌려줍니다.
		 */
		
		System.out.println( "1~10까지의 합: " + calSum()  );
		System.out.println( "1~10까지의 합: " + calSum()  );
		System.out.println( "1~10까지의 합: " + calSum()  );
		
		int result = calSum();
		System.out.println("1~10까지의 합: " + result);
		
		String result2 =  strPlus();
		System.out.println(result2);
		
		String result3 = randomStr();
		System.out.println(result3);
		
	} // end main
	
	static int calSum() { // 호출은 이름부터 소괄호만 본다.
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		
		return sum;
	}
	
	static String strPlus() {
		
		String str = ""; // 공백
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}

	static String randomStr() {
		
		double d = Math.random();
		
//		String s = "";
		if(d <= 0.3) {
			return "가위"; // 반환과 동시에 종료
//			s = "가위";
		} else if (d <= 0.6) {
			return "바위";
//			s = "바위";
		} else {
			return "보";
//			s = "보";
		}
		
//		return s;
	}
}

