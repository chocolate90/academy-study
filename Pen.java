
// 설계용 클래스(라이브러리 클래스)는 메인이 없다.
public class Pen {

	// 클래스 안에 소속될 속성을 나타내는 것을 멤버변수(필드)라고 부른다.
	
	String ink;
	int price;
	String company;
	
	// 클래스 안에 기능을 나타내는 것을 매서드로 표현한다.
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다.");
	}
	
	void info() {
		System.out.println("====펜의 정보====");
		System.out.println("색상:" + ink);
		System.out.println("가걱:" + price);
		System.out.println("제조사:" + company);
	}
	
}
