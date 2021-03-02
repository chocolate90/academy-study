
public class Phone {

	// 멤버 변수
	String model;
	int price;
	String color;
	
	// 생성자 : 생성자는 클래스 이름과 대/소문자까지 동일하다.
	// 반환 유형은 없다.
	
	Phone() {
		System.out.println("생성자 호출!");
		model = "큐리텔";
		price = 100000;
		color = "검정";
	}
	
	// 생성자는 여러개 선언할 수 있다.
	// 단, 매개변수의 종류, 개수가 달라야 한다.
	
	Phone(String pColor) {
		model = "애니콜";
		price = 200000;
		color = pColor;
	}
	
	Phone(int pPrice, String pColor) {
		model = "가로본능";
		price = pPrice;
		color = pColor;
	}
	
	Phone(String pModel, String pColor) {
		model = pModel;
		price = 1000000;
		color = pColor;
	}
	
	Phone(String pModel, int pPrice, String pColor) {
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	// 메서드
	void info() {
		System.out.println("----폰의 정보----");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
		
	}
}
