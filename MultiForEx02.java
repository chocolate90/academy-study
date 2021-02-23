
public class MultiForEx02 {

	public static void main(String[] args) {
		
		// 중첩반복문에서 조건이 변경되는 형태
		
		for(int i = 1; i <=5; i++) { // 행을 표현
			
			for(int j = 1; j <= 5; j++) { // 출력 표현
				System.out.println(i + " - " + j);
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  ***** 
		 */
		
		System.out.println("-----------------");
		
		int star = 5;
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------");
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********  
		 * 
		 *  바깥반복문 - 행
		 *  내부반복문 - 공백용도, 출력용도
		 */
		
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			for(int n = 1; n <= i * 2 -1; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
