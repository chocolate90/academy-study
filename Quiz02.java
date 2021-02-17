package basic;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 1. 1~100까지 랜덤한 정수를 생성하고 3의 배수인지 아닌지 3항 연산식
		
		int n = (int)(Math.random() * 100) + 1;
		
		System.out.println(n);
		
		String result = n % 3 == 0 ? "3의 배수" : "3의 배수 아님";
		
		System.out.println(result);
		
		// 2. -5~5까지의 랜덤한 정수를 생성하고 무조건 절대값만 출력하는 3항 연산식
		
//		int i = (int)(Math.random() * -6) + (int)(Math.random() * 6);
		
		int i = (int)(Math.random() * 11) - 5;
		
		System.out.println( i + "의 절대값:" + (i < 0 ? -i : i));
		
		// 3. 1~200까지의 랜덤한 수를 만들고 이것을 사과의 개수라고  가정
		// bucket은 사과를 담는 바구니 입니다 (10개)
		// 어떤 사과가 나오던 필요한 바구니의 개수를 구하는 3항연산식
		
		int bucket = 10;
		
		int r = (int)(Math.random() * 200) + 1;
		
		int count = r % bucket == 0 ? r / bucket : r / bucket + 1;
		
		System.out.println("사과의 개수: " + r + ", 필요한 바구니 개수: " + count);
		
		
	}
}
