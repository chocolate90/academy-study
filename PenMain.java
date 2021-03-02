
public class PenMain {

	public static void main(String[] args) {
		
		// Pen의 기능, 속성을 사용하려면 설계용 클래스를 생성해야 한다. 
		Pen black = new Pen();
		
		black.ink = "검정"; // . 은 참조하다의 의미
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		black.info();
		
		System.out.println();
		
		Pen red = new Pen();
		
		red.ink = "빨강";
		red.price = 2000;
		red.company = "하이테크";
		
		red.write();
		red.info();
		
		Calculator cal = new Calculator();
		
		cal.add(black.price);
		System.out.println(cal.add(red.price));
	}
}
