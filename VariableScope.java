
public class VariableScope {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
		
		// 동일한 유형의 변수는 ,를 이용해서 한번에 선언할 수 있다.
		int num1 = 10, num2 = 20;
		int num4 = 0; // 밖에서 선언하면 안에서도 쓰고 밖에서도 쓸 수 있다.
		
		if(true) {
			int num3 = num1 + num2;
			
			num4 = 1000;
		}
		
//		int num3 = 100; - num3은 if 중괄호 안에 있기 떄문에 밖에서 변수 선언 가능.
//		System.out.println(num3); - num3은 if 중괄호 안에 있기 떄문에 밖에서 출력 불가.
		
		System.out.println(num4);
	}
}
