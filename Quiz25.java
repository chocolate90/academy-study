package basic;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("금액을 투입해 주세요>");
		int money = scan.nextInt();

		es:while(true) {
			System.out.println("남은금액: " + money + "원");
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코가골라: 600원, [4]잔돈받기");
			System.out.print("음료수 선택>");
			int n = scan.nextInt();

			switch (n) {
			case 1:
//				money -= 400;
//				if(money < 0) {
//					money += 400;
//					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
//				} else {
//					System.out.println("뎀이소다를 받았습니다.");
//				}
				
				if(money >= 400) {
					System.out.println("뎀이소다를 받았습니다.");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다.");
				}

				break;

			case 2:
				money -= 500;
				if(money < 0) {
					money += 500;
					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
				} else {
					System.out.println("밀킥스를 받았습니다.");
				}
				break;

			case 3:
				money -= 600;
				if(money < 0) {
					money += 600;
					System.out.println("금액이 부족합니다. 돈을 넣어주세요");
				} else {
					System.out.println("코가골라를 받았습니다.");
				}
				break;

			case 4:
				System.out.println("남은금액 " + money + "원을 반환합니다.");
				break es;

			}
		}


	}
}
