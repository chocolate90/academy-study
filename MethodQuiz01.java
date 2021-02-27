package basic;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		System.out.println(method2("가"));
		double result = method3(1,2,3.4);
		System.out.println(result);
		System.out.println(method4(1));
		System.out.println(method4(2));
		method5("가",5);
		System.out.println(maxNum(1,2));
		System.out.println(abs(-3));
		
		String result1 = java(9);
		System.out.println(result1);
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String s) {
		
		return s;
	}
	
	static double method3(int a, int b, double c) {
		
		return a+b+c;
	}
	
	static String method4(int a) {
		
		if(a % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
		
//		return a % 2 == 0 ? "짝수" : "홀수";
		
	}
	
	static void method5(String s, int a) {
		
		for(int i = 1; i <= a; i++) {

			System.out.print(s);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		
		if(a > b) {
			return a;
		} else {
			return b;
		}

	}
	
	static int abs(int a) {

		
		if(a < 0) {
			return -a;
		} else {
			
			return a;
		}
	}

	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				System.out.print("자");
			} else {
				System.out.print("바");
				
			}
		}
		return str;
	}
}
