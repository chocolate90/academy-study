
public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			// while의 3가지 필요값을  ()안에 적어놓은 형태
			sum += i;
			
		}
		System.out.println("1~10까지의 합: " + sum);
		
		// 10에서 1로 감소하는 for문
		
		for(int i = 10; i >= 1; i--) {
			
		System.out.println(i);

		}
		
	}
}
