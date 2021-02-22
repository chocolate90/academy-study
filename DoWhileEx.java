
public class DoWhileEx {

	public static void main(String[] args) {
		
		/*
		 *  do~while문은 조건을 마지막으로 검사 하기 때문에
		 *  false여도 한번은 실행이 된다.
		 *  
		 *  그 이후 부터는 while와 동일
		 */
		
		// While - 1~10까지 합
		
		int sum = 0;
		int i = 1;

		while(i <= 10) {
			
			sum += i;
			
			i++;
		}
		
		System.out.println("1~10까지 합:" + sum);
		
		int sum2 = 0;
		int k = 1;
		do {
			
			sum2 += k;
			k++;
		} while(k <= 10);
	
		System.out.println("1~10까지 합:" + sum2);
	}
}
