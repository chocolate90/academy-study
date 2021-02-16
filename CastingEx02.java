
public class CastingEx02 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입에 저장할 때는 (type) 캐스팅을 사용해서
		 * 명시적 형변환을 해야 한다.
		 */
		
		int i = 65;
		char c = (char)i;
		short s = (short)i;
		
		System.out.println(c);
		System.out.println(s);
		
		float f = 3.14f;
		int j = (int)f;
		
		System.out.println(j);
		
		/*
		 * 강제 타입 변환시에 주의할 점은 값을 받아들일 수 없는 범위가 들어오면
		 * 잘려나간 쓰레기 값을 저장하게 된다.
		 */
		
		int a = 1000;
		byte b = (byte)a; 
		
		System.out.println(b);
		
		/*
		 * 예외사항
		 * char 값을 short형으로 변경 할 떄도 명시적으로 형변환을 해야한다.
		 */
		
		char cc = 'A';
		short ss = (short)cc;
		
		System.out.println(ss);
		
		
	}
}
