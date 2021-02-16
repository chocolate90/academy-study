
public class IntegerEx {

	public static void main(String[] args) {
		
		// 정수형 타입
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 2147483648L; // long타입은 L을 붙인다.
		System.out.println(d);
		
		System.out.println("----------------");
		// 2진수 or 8진수 or 16진수로 저장할 수 있습니다.
		// 2진수는 0b를 붙임
		
		int bin = 0b1010;
		System.out.println("2진수 1010의 값은 : " + bin + " 입니다.");
		
		//8진수는 0을 붙인다.
		int octa = 064;
		System.out.println("8진수 64의 값은 : " + octa);
		
		//16는 0x를 붙인다.
		int hexa = 0x3a4c;
		System.out.println("16진수 3a4c의 값은 : " + hexa);
		
		System.out.println("----------------");
		
		// 실수형
		float f1 = 3.14F;
		double d1 = 3.14;
		
		// e표기법
		double d2 = 314e-2;
		System.out.println(d2);
		double d3 = 0.0314e2;
		System.out.println(d3);
		
		System.out.println("----------------");
		
		// boolean
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}
}
