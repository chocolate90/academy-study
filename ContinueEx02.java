import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {

		// 과제(중첩 반복문)
		// 입력받은 정수 까지의 수중에 소수들의 합계
		// ex) 입력: 10, 소수(2,3,4,7) 17

		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int n = scan.nextInt();

		int sum = 0;
		int count = 0;
		ex:for(int i = 1; i <= n; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {

				if(i % j == 0) {
					
					count++;
				} 
				if(count > 2) {
					continue ex;
				}
			}
			
			if(count == 2) {
				sum += i;
			}
		}

		System.out.println(sum);
		
		scan.close();
	}
}
