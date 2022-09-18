class MyPoint {
	int x;
	int y;
}

class InheritanceCircle extends MyPoint {	// 상속
	int r;
}

class CompositeCircle {	// 포함
	MyPoint p = new MyPoint();	// 참조변수의 초기화
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		InheritanceCircle ic = new InheritanceCircle();
		ic.x = 1;
		ic.y = 2;
		ic.r = 3;
		System.out.println("ic.x = " + ic.x);
		System.out.println("ic.y = " + ic.y);
		System.out.println("ic.r = " + ic.r);
		
		CompositeCircle cc = new CompositeCircle();
		cc.p.x = 1;
		cc.p.y = 2;
		cc.r = 3;
		System.out.println("cc.p.x = " + cc.p.x);
		System.out.println("cc.p.y = " + cc.p.y);
		System.out.println("cc.r = " + cc.r);
	}
}
