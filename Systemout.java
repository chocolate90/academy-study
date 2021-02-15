
public class Systemout {

	public static void main(String[] args) {
		
		// main을 적고 ctrl + space를 누루면 자동생성된다.
		/*
		 * 코드실행 단축키는 ctrl + f11
		 * sysout을 적고 ctrl + space는 println()을 자동생성한다.
		 */
		
		// println() - 작성한 코드의 마지막에 \n을 자동삽입한다.
		System.out.println("안녕하세요~");
		System.out.println("우리집 강아지는 장군이 입니다");
		
		// print() - 개행을 포함하지 않는다.
		System.out.print("줄바꿈이 없네요....\n");
		
		// printf - 형식지정 출력문
		/*
		 * 서식문자
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음
		 * %c - 단일 문자를 입력받음 (한글자)
		 * %s - 문자열을 입력받음
		 */
		System.out.printf("오늘은  %d일 입니다\n", 15);
		System.out.printf("오늘은  %d월 %d일 입니다", 2, 15);
		System.out.printf("\n오늘은 %d년 %d월 %d일 입니다", 2021, 2, 15);
		// \n 줄바꿈은  처음의 맨뒤와 마지막의 맨앞에 넣을 수 있다.
		
		System.out.printf("\n파이 값은 %f입니다.", 3.14);
		System.out.printf("\n파이 값은 %.2f입니다.", 3.14);
		// .xf를 넣으면 자릿수를 지정할 수 있다.
		System.out.printf("\n파이 값은 %10.2f입니다.", 3.14);
		// 숫자.xf를 넣으면 숫자만큼의 자릿수를 지정할 수 있다.
		
		System.out.printf("\n한글의 시작은 %c 입니다.", '가');
		// 한글자를 표현할 땐 ''를 사용한다.
		System.out.printf("\n한글의 시작은 %s 입니다.", "가");
		
		System.out.println("\n파이 값은          3.14입니다.");
	}
}
