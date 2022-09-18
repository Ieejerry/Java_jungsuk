class MyPoint2 extends Object {	// 부모가 없는 클래스에는 컴파일러가 자동으로 Object 클래스를 상속시킨다.
	int x;
	int y;
}

// Object클래스는 모든 클래스의 최고 조상 클래스

class InheritanceCircle2 extends MyPoint2 {	// 상속
	int r;
}

class CompositeCircle2 extends Object {	// 포함, 부모가 없는 클래스에는 컴파일러가 자동으로 Object 클래스를 상속시킨다.
	MyPoint2 p = new MyPoint2();	// 참조변수의 초기화
	int r;
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		CompositeCircle2 cc = new CompositeCircle2();
		System.out.println(cc.toString());	// "CompositeCircle2@3d012ddd", Object클래스의 toString()메소드 사용 가능
		System.out.println(cc);	// "CompositeCircle2@3d012ddd", toString()을 사용하나, 사용하지 않으나 같은 결과를 반환한다.(println의 기능)
		CompositeCircle2 cc2 = new CompositeCircle2();
		System.out.println(cc2.toString());	// "CompositeCircle2@626b2d4a", Object클래스의 toString()메소드 사용 가능
		// toString() 메소드는 객체의 "클래스 이름@객체 주소"를 문자열로 반환한다.
	}
}
