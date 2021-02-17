
public class OperatorEx01 {

	public static void main(String[] args) {
		
		// 단항 연산자
		// 부호 연산자 +, -
		
		int i = +3;
		int j = -i;
		
		// 증감 연산자 ++, --
		
		int k = 1;
		int h = k++; // 후위연산자 - 먼저 값을 대입한 후 1 증가
		
		System.out.println("k의 값: " + k);
		System.out.println("h의 값: " + h);
		
		int x = 1;
		int y = ++x; // 전위연산자 - 먼저 값을 증가후 저장
		
		System.out.println("x의 값: " + x);
		System.out.println("y의 값: " + y);
		
		// 일반적인 표현
		x = 1;
		
		x++;
		++x;
		
		System.out.println("x의 값: " + x);
		
		System.out.println("-------------");
		
		x = 1;
		y = 1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		x = 10;
		y = 10;
		
		int result = (x++) + (++y) + 10;
		
		System.out.println("result의 값: " + result);
		
		System.out.println("-------------");
		
		// 예외적 상황
		
		x = 10;
		y = 10;
		
		
		// 한 항에서 여러번 사용되는 경우 값이 올라간 형태에서 연산작입이 이루어진다.
		int result2 = x++ + x++ + x++; // 현재 x 값 : 13
		System.out.println(result2);
		
		System.out.println("---------------");
		
		// 비트반전, 보수법
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101 > -11
		
		System.out.println(~b + 1);
		
		byte b1 = (byte)(~b + 1);
		
		System.out.println(~b1 + 1);
		
		System.out.println("---------------");
		
		// 논리 반전 연산자 ! - 부정의 의미
		boolean bool1 = true;
		System.out.println(!bool1); // f
		System.out.println(!false); // t
	}
}
