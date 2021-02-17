
public class CastingEx03 {

	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		
		// 1. 서로 다른 타입의 연산에서 큰 타입에 맞춰 자동 형 변환 된다.
		char cc = (char)(c + i) ;
		int ii = c + i;
		
		System.out.println(cc);
		System.out.println(ii);
		
		System.out.println('A' + 2);
		
		
		int j = 10;
		double d = 3.14;
		
		double dd = j + d;
		
		System.out.println(dd);
		
		// 2. int 형보다 작은 타입의 연산의 결과는 int가 된다.
		byte b1 = 100;
		byte b2 = 12;
		
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		byte b4 = 10;
		short s1 = 100;
		
		short ss = (short)(b4 + s1);
		System.out.println(ss);
	}
}
