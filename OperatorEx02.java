
public class OperatorEx02 {

	public static void main(String[] args) {
		
		// 2항 연산자
		// 산술연산자
		
		int i = 7 / 3; // 2
		int j = 7 % 3; // 1
		int k = 8 * 3; // 24
		
		// 비교 연산자
		System.out.println(i == j); // f
		System.out.println(i != j); // t
		System.out.println(i >= j); // t
		System.out.println(i < j); // f
		System.out.println(k != 21); //t
		System.out.println(k % 2 != 0); // f
		System.out.println(k % 2 == 0); // t - k는 짝수?
		System.out.println(k % 6 == 0); // t - k는 6의 배수?
		
		System.out.println("----------------");
		
		// 비트 연산자 & | ^
		
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		// 두 비트 값이 1이면 1, 나머지는 0
		System.out.println(a & b); // 0000 0001 
		
		// 두 비트중 하나만 1이어도 1을 반환
		System.out.println(a | b); // 0000 0111
		
		// 다르면 1, 같으면 0
		System.out.println(a ^ b); // 0000 0110
		
		// 비트 시프트 >>, <<
		
		int h = 100;
		System.out.println(h >> 3 );
	}
}
