
public class VarMain {

	public static void main(String[] args) {
		
		// 멤버변수 a의 확인
		Variable var = new Variable();
		
		System.out.println(var.a);
		var.a = 1000; // 멤버 변수의 변경
		
		var.printNumber(100);
	}
}
