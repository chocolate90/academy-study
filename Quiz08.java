package basic;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박, 사과, 멜론, 귤, 포도]");
		System.out.print(">");
		
		String s = scan.next();
		
		switch (s) {
		case "수박":
			System.out.println(s + "는 만원입니다.");
			break;
		
		case "사과":
			System.out.println(s + "는 천원입니다.");
			break;
			
		case "멜론":
			System.out.println(s + "는 오천원입니다.");
			break;
			
		case "귤":
			System.out.println(s + "는 오백원입니다.");
			break; 
		
		case "포도":
			System.out.println(s + "는 이천원입니다.");
			break;

		default:
			System.out.println(s + "는 없습니다.");
			break;
		}
	}
}
