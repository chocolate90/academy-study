
public class OperatorCondition {

	public static void main(String[] args) {
		
		/*
		 *  프로그램에서는 어떤 수의 검증을 위해 랜덤한 값이 필요할 때가 있다.
		 *  
		 *  Math.random() - double형태의 0.0이상~1.0미만의 랜덤수
		 */
		
		 //System.out.println(Math.random());
		
		 //double d = Math.random() * 10; // 0.0~ 10.0미만
		 //int r = (int)d + 1; // 1~11미만
		 
		 int r =(int)(Math.random() * 10) + 1;
		 
		 System.out.println(r);
		 
		 // 삼항 연산식 - (조건 ? 연산1 : 연산2)
		 
		String result = r % 2 == 0 ? "짝수~" : "홀수~";
		System.out.println(result);
		
		System.out.println( r % 2 == 0 ? "짝수" : "홀수");
	}
}
