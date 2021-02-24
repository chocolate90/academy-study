
public class ContinueEx01 {

	public static void main(String[] args) {
		
		// continue - 조건문과 함께 사용하고, 반복문의 다음으로 이동시킨다.
		
//		for(int i = 1; i <= 10; i++) {
//			
//			if(i % 2 == 0) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
		
		// 주의 - while문에서는 continue를 만날 때,
		// 조건식으로 이동하기 때문에 i의 증감식을 적절히 고려해야 한다.
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				i++;
				continue;
				
			}
			System.out.println(i);
			
			i++;
		}
	}
}
