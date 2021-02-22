package basic;

public class Quiz17 {

	public static void main(String[] args) {
		
		// 1. 7~100까지 정수중에서 7의 배수를 가로로 출력 (증감식을 7씩 증가)
		
//		for(int i = 7; i <= 100; i += 7) {
//			
//			System.out.print(i + " ");
//		}
		
		// 2. 1~100까지 12의 배수를 가로로 출력
		
//		for(int i = 1; i <= 100; i++) {
//			
//			if(i % 12 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// 3. 1~200까지 정수중에서 9의 배수의 개수
		
//		int count = 0;
//		for(int i = 1; i <= 200; i++) {
//			
//			if(i % 9 == 0) {
//				count++;
//			}
//		}
//		System.out.println("1~200까지 9의 배수의 개수: " + count);
		
		// 4. 50~100까지 두 수 사이의 합
		
//		int sum = 0;
//		for(int i = 50; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("50~100까지의 합: " + sum);
		
		// 5. A~Z까지 가로로 출력 ( A의 유니코드 65, Z의 유니코드 90 )
		
		for(int i = 65; i <= 90; i++) {
			char a = (char)i;
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		for(char c = 'A'; c <= 'Z'; c++) {

			System.out.print(c + " ");
		}
		
	}
}
