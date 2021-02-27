package basic;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		// 18~21번
		
		System.out.println(java(5));
		System.out.println(sum(6));
		System.out.println("10까지의 소수의 개수: " + primeNum(10));
		System.out.println("7~9의 사이의 합: " + sumNum(7,9));
		System.out.println("7~9의 사이의 합: " + sumNum(9,7));
		System.out.println("5~5의 사이의 합: " + sumNum(5,5));
	}
	
	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			
			if(i % 2 == 1) {
				System.out.print("자");
			} else {
				System.out.print("바");
			}
			
		}
		return str;
	}

	static int sum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

	static int primeNum(int a) {
		
		
		int primeNum = 0; // 소수의 개수를 누적
		
		for(int i = 1; i <= a; i++) {
			
			int count = 0;
			//소수 판별문
			for(int j = 1; j <= i; j++) {
				// 나머지
				if(i % j == 0) { // 약수
					count++;
				}
			}
			
			if(count == 2) { // 
				primeNum++;
			}
		}
		return primeNum;
	}

	static int sumNum(int a,int b) {
		
		int max = 0;
		int min = 0;
		
		int sum = 0;
		if(a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
}
