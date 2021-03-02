
public class PhoneMain {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone any = new Phone("빨강");
		any.info();
		
		Phone red = new Phone(300000, "빨강");
		red.info();
		
		Phone galaxy = new Phone("갤럭스 노트 10+", "블랙");
		galaxy.info();
		
		Phone shaomi = new Phone("샤오미", 900000, "그린");
		shaomi.info();
	}
}
