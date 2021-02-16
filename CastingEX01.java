
public class CastingEX01 {

	public static void main(String[] args) {
		
		/*
		 *  크기가 작은 타입을 큰 타입에 넣을 떄는
		 *  자바의 가상머신 JVM이 자동으로 형변환을 해준다.
		 */
		
		byte b = 10; 
		
		short s = b; // byte > short 자동형변환
		int i = b; // byte > int 자동형변환
		long l = b; // byte > long 자동형변환
		
		char c = '가';
		int j = c;
		
		System.out.println("가의 유니코드 숫자값 : " + j);
		
		int k = 1000;
		double d = k; // int > double 자동형변환 
		
		System.out.println(d);
		
	}
}
