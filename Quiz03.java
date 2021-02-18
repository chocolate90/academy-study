package basic;

public class Quiz03 {

	public static void main(String[] args) {
		
		// -10~10까지의 랜덤수를 만들고, 이 값이 0, 양수, 음수인지 판별
		// 조건 - if else 사용금지
		
		int n = (int)(Math.random() * 21) - 10;
		
		System.out.println(n + " : " + (n == 0 ? "0 입니다." : n > 0 ? "양수 입니다" : "음수 입니다."));
		
		int r = (int)(Math.random() * 21) - 10;
		
		String result = r == 0 ? "0 입니다" : (r < 0 ? "음수 입니다." : "양수 입니다.");
		
		System.out.println(r + " 값은: " + result);
	}
}
