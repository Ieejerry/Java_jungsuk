import java.security.PublicKey;

class Car {
	String color;
	int door;
	
	void drive() {	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {	// 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();	// 실제 인스턴스가 무엇인지가 중요
		
		FireEngine fe2 = (FireEngine)car;	// 조상 -> 자손으로 형변환
		Car car2 = (Car)fe2;	// 자손 -> 조상으로 형변환
//		car2.drive();	// NullpointerException 발생
		
		Car c = new Car();
//		FireEngine f = (FireEngine)c;	// 형변환 실행 에러. java.lang.ClassCastException
//		f.water();	// 컴파일 OK
	}
}