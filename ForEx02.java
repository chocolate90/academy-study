import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		// 정수를 입력 받아서 소수인지 판별
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scan.nextInt();
		
		int count = 0; // 카운트 변수
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) { // num의 약수
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + num + "의 약수의 개수: " + count);
		
		System.out.println( count == 2 ? num + " = 소수" : num + " = 소수가 아닙니다.");
		
		scan.close();
	}
}
